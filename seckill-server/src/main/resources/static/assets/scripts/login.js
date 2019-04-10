$(function () {
    $("#user_login_submit").submit(function () {
        $.ajax({
            url: "/bengmall/login",
            type: "post",//方法类型
            dataType: "json",//预期服务器返回的数据类型
            success: function (data) {
                console.log("提交成功");
            },
            error: function (data) {
                alert("修改密碼過程中出現錯誤！"+data.result["result"].message);
            }
        })
    });
});


