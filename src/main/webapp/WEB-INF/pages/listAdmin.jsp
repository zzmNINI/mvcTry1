<%@ page import="adminEntity.Admin" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-01-31
  Time: 下午 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
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
    <center><h3>查询所有客户</h3></center>
    <table align="center" border="1" width="700px">
        <tr>
            <th>编号</th>
            <th>ID</th>
            <th>密码</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>qq</th>
            <th>操作</th>
        </tr>
        <%
            List<Admin> la = (List<Admin>)request.getAttribute("listAdmin");
            for(Admin ad:la){
        %>
        <tr>
            <td><%=ad.getId()%></td>
            <td><%=ad.getAid() %></td>
            <td><%=ad.getPwd() %></td>
            <td><%=ad.getName() %></td>
            <td><%=ad.getGender() %></td>
            <td><%=ad.getAge() %></td>
            <td><%=ad.getPhone() %></td>
            <td><%=ad.getEmail() %></td>
            <td><%=ad.getQq() %></td>
            <td><a href="updateView?id=<%=ad.getId()%>">修改</a>&nbsp;<a href="delete?id=<%=ad.getId()%>">删除</a></td>
        </tr>
        <%} %>
        <tr>
            <td colspan="10" align="center"><a href="addView">添加用户</a>&nbsp;<a href="end">退出登录</a></td>
    </table>
</body>
</html>
