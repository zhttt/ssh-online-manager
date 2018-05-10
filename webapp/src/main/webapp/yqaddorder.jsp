<%--
  Created by IntelliJ IDEA.
  User: yangjian
  Date: 2018/5/10
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="addqiangge" method="post">
<table align="center"  id="axs">
    <tr>
        <td>订单编号</td>
        <td>
            <input type="text"class="easyui-textbox" name="orderscode"  id="yy"  ></td>

    </tr>
    <tr>
        <td>创建时间</td>
        <td><input type="text" id="yqqs" class="easyui-datebox"     name="orderscreattime"></td>
    </tr>
    <tr>
        <td>总钱数</td>
        <td><input type="text" class="easyui-textbox"  name="ordersmoney"  ></td>
    </tr>
    <tr>
        <td>订单的产品</td>
        <td><input type="text" class="easyui-textbox"  name="ordersproduct"  ></td>
    </tr>
    <tr>
        <td>订单中的产品的数量</td>
        <td><input type="text"  class="easyui-textbox"  name="orderspronum"  ></td>
    </tr>
    <tr>
        <td>订单状态</td>
        <td><input type="text"  class="easyui-textbox"  name="ordersstatus"  ></td>
    </tr>
    <tr>
        <td>订单人id</td>
        <td><input type="text" class="easyui-textbox"  name="ordersuser"  ></td>
    </tr>
    <tr>
        <td>修改时间</td>
        <td><input type="text" class="easyui-datebox"     name="ordersupdatadata"></td>
    </tr>

</table>
</form>
</body>
</html>
