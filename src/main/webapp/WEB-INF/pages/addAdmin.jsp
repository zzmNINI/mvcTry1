<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-01-31
  Time: 下午 7:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html">
    <title>添加用户</title>
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
<center><h3>添加用户</h3></center>
<form action="add" method="post">
    <table align="center" border="1" width="300px">
        <tr>
            <th>ID</th>
            <td><input type="text" name="Aid"/></td>
        </tr>
        <tr>
            <th>密码</th>
            <td><input type="text" name="pwd"/></td>
        </tr>
        <tr>
            <th>姓名</th>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <th>性别</th>
            <td>
                <input type="radio" name="gender" value="男"/>男
                <input type="radio" name="gender" value="女" checked="checked"/>女
            </td>
        </tr>
        <tr>
            <th>年龄</th>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <th>电话</th>
            <td><input type="text" name="phone"/></td>
        </tr>
        <tr>
            <th>邮箱</th>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <th>qq</th>
            <td><input type="text" name="qq"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="保存"/>&nbsp;
                <input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>