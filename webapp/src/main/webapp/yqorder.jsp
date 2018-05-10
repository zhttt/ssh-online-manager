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
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jquery-easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/jquery-easyui/themes/icon.css">
<!-- tree树 -->

<body>
<table id="y_goods"></table>
<div id="y_ta">
    <a href="javascript:shangg()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">修改</a>
    <a href="javascript:shangg()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
    <a href="javascript:dely(null)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
</div>
<div id="shangping"></div>

<script type="application/javascript">
    //查询
    $('#y_goods').datagrid({
        url:'<%=request.getContextPath() %>/order!queryOrder.action',
        columns:[[
            {field:'',title:'',checkbox:true},
            {field:'ordersid',title:'id',width:100 },
            {field:'orderscode',title:'订单编号 ',width:100 },
            {field:'orderscreattime',title:'创建时间',width:100 ,formatter:function(value,row,index){   //关键：格式化，并返回一个img标签
                var aa=value.substr(0,10);
                return aa; }},
            {field:'ordersmoney',title:' 总钱数 ',width:100 },
            {field:'ordersproduct',title:'订单的产品',width:100 },
            {field:'orderspronum',title:'订单中的产品的数量',width:100 },
            {field:'ordersstatus',title:'订单状态 ',width:100 },
            {field:'ordersuser',title:'订单人id ',width:100 },
            {field:'ordersupdatadata',title:'修改时间',width:100,formatter:function(value,row,index){   //关键：格式化，并返回一个img标签
                var aa=value.substr(0,10);
                return aa; }}

        ]],
        fit:true,
        striped:true,
        pagination:true,
        ctrlSelect:true,
        pageList:[10,15,20],
        toolbar:'#y_ta'
    });

</script>
//删除
<script type="text/javascript">
    function dely(){
        var ids="";
        //获取所有被选中的行
        var arr = $("#y_goods").datagrid("getSelections");
        for (var i = 0; i < arr.length; i++) {
            ids+=","+arr[i].ordersid;
        }
        ids = ids.substr(1);

        $.ajax({
            url:"<%=request.getContextPath()%>/order!deleteOrder.action",
            type:"post",
            data:{"ids":ids},
            dataType:"json",
            async:false,
            success:function(data){
                if(data=="success"){
                    $('#y_goods').datagrid('load');
                }else{
                    $.messager.alert("删除失败！");
                }
            }
        })
    }
</script>
<script type="text/javascript">
    function shangg(){
        $('#shangping').dialog({
            title: "新增信息",
            width: 300,
            height: 300,
            closed: false,
            cache: false,
            href: "<%=request.getContextPath()%>/yqaddorder.jsp",
            modal: true,
            buttons:[{
                text:'保存',
                handler:function(){
                    $("#addqiangge").form('submit',{
                        url:"<%=request.getContextPath()%>/order!addOrder.action",
                        success:function(data){
                            var data = eval('(' + data + ')');
                            if(data=="success"){
                                $('#shangping').dialog('close');
                                $('#y_goods').datagrid('load');
                            }else{
                                $.messager.alert("提示",data);
                            }
                        }
                    });
                }
            }]
        });
    }
</script>
</body>
</html>
