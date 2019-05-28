package com.vb.seckillserver.dao.seckill;



import com.vb.seckillserver.entity.seckill.Student;
import com.vb.seckillserver.entity.seckill.StudentTest;
import com.vb.seckillserver.entity.seckill.StudentWithList;
import com.vb.seckillserver.entity.seckill.StudentWithTeacher;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    //单个类student 的查询
    Student querySingleStudentById(int id);

    //传入多个参数的查询
    Student querySingleStuByMutlParmas(@Param("id") int id, @Param("studentName") String name);

    //List的查询
    List<Student> queryAllStudents();

    //类中带List<>的查询
    StudentWithList queryStuWithListById(int id);

    //类中带类的查询
    StudentWithTeacher queryInnerStudentById(int id);

    //返回测试
    StudentTest queryStudentTest(int id);

}
