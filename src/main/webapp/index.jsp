<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-01-31
  Time: 下午 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*,adminEntity.*" language="java" %>

<html>
<head>
    <title>用户登录</title>
    <style type="text/css">
        table td{
            text-align: center;
        }
        table {
            border-collapse: collapse;
        }
    </style>
</head>
<body>
    <%String str = request.getParameter("message");
        if("error".equals(str)){
    %>

    <script type="text/javascript" language="javascript">
        window.alert("账号或密码错误！请重试。。。");
    </script>
    <%} %>

    <center><h3>登录</h3></center>
    <form action="controller/login" method="post">
        <table align="center" border="1" width="300px">
            <tr>
                <th>ID</th>
                <td><input type="text" name="Aid"/></td>
            </tr>
            <tr>
                <th>密码</th>
                <td><input type="password" name="pwd"/></td>
            </tr>
            <tr><td colspan="2" align="center"><input type="submit" name="Submit" value="确认" style="width:80" ></td></tr>
        </table>
</form>
</body>
</html>
