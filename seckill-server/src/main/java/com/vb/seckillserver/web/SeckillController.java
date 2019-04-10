package com.vb.seckillserver.web;



import com.vb.seckillserver.dto.Exposer;
import com.vb.seckillserver.dto.SeckillExecution;
import com.vb.seckillserver.dto.SeckillResult;
import com.vb.seckillserver.dto.SeckillStatEnum;
import com.vb.seckillserver.entity.seckill.Seckill;
import com.vb.seckillserver.exception.SeckillCloseException;
import com.vb.seckillserver.exception.SeckillRepeatException;
import com.vb.seckillserver.service.SeckillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/seckill")
public class SeckillController {

    @Autowired
    private SeckillService mSeckillService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String seckillList(Model model) {
        List<Seckill> seckills = mSeckillService.getAllSeckill();
        System.out.println("数据中获取的值为："+seckills.toString());
        model.addAttribute("list", seckills);
       return "list";
    }


    //某种商品的详情页
    @RequestMapping(value = "/{seckill}/detail", method = RequestMethod.GET)
    public String seckillDetail(@PathVariable("seckill") Long seckillId, Model model) {
        //重定向
        if (seckillId == null) {
            return "redirect:/list";
        }

        //转发
        Seckill seckill = mSeckillService.getSeckillById(seckillId);
        if (seckill == null) {
            return "forward:/list";
        }
        model.addAttribute("seckill", seckill);
        return "detail";

    }

    //ajax ,json暴露秒杀接口的方法
    @RequestMapping(value = "/{seckillId}/exposer",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public SeckillResult<Exposer> exposer(@PathVariable("seckillId") Long seckillId) {
        SeckillResult<Exposer> result;
        try {
            Exposer exposer = mSeckillService.exportSecillUrl(seckillId);
            result = new SeckillResult<Exposer>(true, exposer);
        } catch (Exception e) {
            e.printStackTrace();
            result = new SeckillResult<Exposer>(false, e.getMessage());
        }
        return result;

    }


    // "/{seckillId}/{md5}/execution"
    @RequestMapping("/{seckillId}/{md5}/execution")
    @ResponseBody
    public SeckillResult<SeckillExecution> seckillExecution(@PathVariable("seckillId") Long seckillId, @PathVariable("md5") String md5, @CookieValue(value = "killPhone", required = false) Long phone) {
        if (phone == null) {
            return new SeckillResult<SeckillExecution>(false, "未验证");

        }

        try {
            SeckillExecution se = mSeckillService.seckillExcutionProcedure(seckillId, phone, md5);
            return new SeckillResult<SeckillExecution>(true, se);
        } catch (SeckillRepeatException e) {
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillStatEnum.REPEAT_KILL);
            return new SeckillResult<SeckillExecution>(true, execution);

        } catch (SeckillCloseException e) {
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillStatEnum.END);
            return new SeckillResult<SeckillExecution>(true, execution);
        } catch (Exception e) {
            SeckillExecution execution = new SeckillExecution(seckillId, SeckillStatEnum.INNER_ERROR);
            return new SeckillResult<SeckillExecution>(true, execution);
        }

    }

    //@ResponseBody返回的数据为json
    @ResponseBody
    @RequestMapping(value = "time/now", method = RequestMethod.GET)
    public SeckillResult getTime() {
        Date date = new Date();
        return new SeckillResult<Long>(true, date.getTime());
    }




}
