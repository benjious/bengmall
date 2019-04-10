
$(function () {
        var allData= [];
    $('#uploadImg')
        .fileupload({
            async:false,
            url: '/bengmall/good/product/create',//请求发送的目标地址
            Type: 'POST',//请求方式 ，可以选择POST，PUT或者PATCH,默认POST
            dataType : 'json',//服务器返回的数据类型
            autoUpload: false,
            singleFileUploads: true,
            acceptFileTypes: /(gif|jpe?g|png)$/i,//验证图片格式
            maxNumberOfFiles: 5,//最大上传文件数目
            maxFileSize: 10000000, // 文件上限10MB
            minFileSize: 100,//文件下限  100b
            messages: {//文件错误信息
                acceptFileTypes: '文件类型不匹配',
                maxFileSize: '文件过大',
                minFileSize: '文件过小'
            },


            progressall: function (e, data) {
                var progress = parseInt(data.loaded / data.total * 100, 10);
                console.log("进度条："+progress);
                $('#progress .bar').css(
                    'width',
                    progress + '%'
                );
            },

            //上传成功后服务器返回信息
            done: function (e, data) {
                console.log("done  : "+data.result["result"].message);
                if (data.result["result"].success) {
                    alert("创建商品成功!");
                } else {
                    alert("创建商品失败!"+"原因是： "+ data.result["result"].message);
                }
            },
            fail: function (e, data) {
                console.log(data.result["result"].message);
                alert(data.result.toString());
                alert("系统出现错误 : "+data.result.message.toString());
            }

        })

        //额外的数据 和 upload 的数据放在fordata 中,这个返回false就不会上传
        .bind('fileuploadsubmit', function (e, data) {
            // The example input, doesn't have to be part of the upload form:
            var category = $('#creategood_category');
            var brand    = $('#creategood_brand');
            var proName  = $('#create_proName');
            var proDesc  = $('#create_gooddesc');
            var customerCanBuy = $('#create_customCanBuy');
            var price    = $('#create_proPrice');
            var stock  = $('#create_proStock');
            var stockWarnning = $('#create_stockWarnning');
            var store = $('#creategood_store');
            var type    = $('#creategood_type');
            data.formData = {
                category: category.val(),
                brand: brand.val(),
                proName:proName.val(),
                proDesc:proDesc.val(),
                customerCanBuy:customerCanBuy.val(),
                price:price.val(),
                stock:stock.val(),
                stockWarnning:stockWarnning.val(),
                store :store.val(),
                type:type.val()
            };
            if (!data.formData.category) {
                category.focus();
                console.log("类目选择为空");
                return false;
            }
        })
        .bind('fileuploadadd', function (e, data) {
            for (var i = 0; i < data.files.length; i++) {
                var para = document.createElement("img");
                para.src = getUrl(data.files[i]);
                para.setAttribute("style", "width:200px;high:200px");
                var element = document.getElementById("load_img_show");
                element.appendChild(para);
            }
            allData.push(data);
            console.log("总共： "+data.files.length+"  个文件。");
            $("#creategood_submit").off('click').on('click', function () {
               for (var i=0;i<allData.length;i++){
                   allData[i].submit();
               }
                // data.submit();
                console.log("数据被提交");
            });
        });



    //手动验证
    function validate(file) {
        //获取文件名称
        //验证图片格式
        if (!/.(gif|jpg|jpeg|png|gif|jpg|png)$/.test(fileName)) {
            console.log("文件格式不正确");
            return true;
        }
        //验证excell表格式
        /*  if(!/.(xls|xlsx)$/.test(fileName)){
             alert("文件格式不正确");
             return true;
         } */

        //获取文件大小
        var fileSize = file.size;
        if (fileSize > 1024 * 1024) {
            alert("文件不得大于一兆")
            return true;
        }
        return false;
    }

    //获取图片地址
    function getUrl(file) {
        var url = null;
        if (window.createObjectURL != undefined) {
            url = window.createObjectURL(file);
        } else if (window.URL != undefined) {
            url = window.URL.createObjectURL(file);
        } else if (window.webkitURL != undefined) {
            url = window.webkitURL.createObjectURL(file);
        }
        return url;
    }

});


$(function () {
    $(document).ready(function () {
        $.ajax({
            url: "/bengmall/good/product/category/list",
            type: "GET",
            dataType: "json",
            success: function (data) {
                for (var i = 0; i < data.result.length; i++) {
                    var parent = document.getElementById("creategood_category");
                    var node = document.createElement("option");
                    node.setAttribute("value", data.result[i].id);
                    node.innerHTML = data.result[i].name;
                    parent.appendChild(node);
                }
            }
        })
    });

    $(document).ready(function () {
        $.ajax({
            url: "/bengmall/good/product/brand/list",
            type: "GET",
            dataType: "json",
            success: function (data) {
                for (var i = 0; i < data.result.length; i++) {
                    var parent = document.getElementById("creategood_brand");
                    var node = document.createElement("option");
                    node.setAttribute("value", data.result[i].id);
                    node.innerHTML = data.result[i].name;
                    parent.appendChild(node);
                }
            }
        })
    });

    $(document).ready(function () {
        $.ajax({
            url: "/bengmall/good/product/store/list",
            type: "GET",
            dataType: "json",
            success: function (data) {
                for (var i = 0; i < data.result.length; i++) {
                    var parent = document.getElementById("creategood_store");
                    var node = document.createElement("option");
                    node.setAttribute("value", data.result[i].id);
                    node.innerHTML = data.result[i].name;
                    parent.appendChild(node);
                }
            }
        })
    });

    $(document).ready(function () {
        $.ajax({
            url: "/bengmall/good/product/type/list",
            type: "GET",
            dataType: "json",
            success: function (data) {
                for (var i = 0; i < data.result.length; i++) {
                    var parent = document.getElementById("creategood_type");
                    var node = document.createElement("option");
                    node.setAttribute("value", data.result[i].id);
                    node.innerHTML = data.result[i].name;
                    parent.appendChild(node);
                }
            }
        })
    });
});

$('#creategood_submit').click(new function () {

});




