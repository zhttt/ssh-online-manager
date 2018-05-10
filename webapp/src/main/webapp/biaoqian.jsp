<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/5/10
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/label!queryLabel.action">111</a>
    <table border="1">
        <tr>
            <th>标签编号</th>
            <th>标签名称</th>
            <th>标签地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="l">
            <tr>
                <td>${l.lid}</td>
                <td>${l.lname}</td>
                <td>${l.laddress}</td>
                <td><input type="button" value="删除" onclick="fff(${l.lid})"><input type="button" value="修改" onclick="ddd(${l.lid})"></td>
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
