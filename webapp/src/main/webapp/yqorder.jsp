<%@ page import="javax.xml.stream.Location" %><%--
  Created by IntelliJ IDEA.
  User: yangjian
  Date: 2018/5/9
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/order!queryOrder.action">111</a>
<table border="1">
    <tr>
        <th>id</th>
        <th>订单编号</th>
        <th>创建时间</th>
        <th>总钱数</th>
        <th>订单的产品</th>
        <th>订单中的产品的数量</th>
        <th>订单状态</th>
        <th>订单人id</th>
        <th>修改时间</th>
        <th>操作</th>
    </tr>
<c:forEach items="${list}" var="h">
        <tr>
            <td>${h.ordersid}</td>
            <td>${h.orderscode}</td>
            <td>${h.orderscreattime}</td>
            <td>${h.ordersmoney}</td>
            <td>${h.ordersproduct}</td>
            <td>${h.orderspronum}</td>
            <td>${h.ordersstatus}</td>
            <td>${h.ordersuser}</td>
            <td>${h.ordersupdatadata}</td>
            <td><input type="button" value="删除" onclick="fff(${h.ordersid})"><input type="button" value="修改" onclick="ddd(${h.ordersid})"></td>
        </tr>
</c:forEach>
</table>
<script type="application/javascript">
        function fff(id){

        }
        function ddd(id){
            alert(id)
        }
</script>

</body>
</html>
