<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/22
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        var user = {
            "id": 1,
            "name": "张三"
        };
        $.ajax({
            url: "/data/jsonType",
            data: JSON.stringify(user),
            type: "post",
            contentType: "application/json;charset=UTF-8",
            dataType: "JSON",
            success: function(data) {
                alert(data.id +"---"+ data.name);
            }
        });
    </script>
</head>
<body>

</body>
</html>
