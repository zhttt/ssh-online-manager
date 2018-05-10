<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- 这是jquery的核心包  -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<!-- 这是easyui的核心包  -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/util-js.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/locale/easyui-lang-zh_CN.js"></script>


<!-- jqeuy默认的css样式 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/default/easyui.css">

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
<body>

<div style="width:30%;height:100%;float:left">

	<div id="tb1">
	<div class="easyui-linkbutton" onclick="addshop1()" data-options="iconCls:'icon-add',plain:true">新增</div>
	<div class="easyui-linkbutton" onclick="deleteshop1()" data-options="iconCls:'icon-remove',plain:true">删除</div>
	<div class="easyui-linkbutton" onclick="updateshop1()"data-options="iconCls:'icon-edit',plain:true">修改</div>
	</div>
	<table id="dg1"></table>
	<div id="dialog_addshop1"></div>
	<div id="dialog_update1"></div>
</div>
<%--<div style="width:70%;height:100%;float:left">
	<iframe allowtransparency="true"
			src="shop/daleitongji.jsp" width="100%"
			height="500px" marginwidth="0" marginheight="0" hspace="0" vspace="0"
			frameborder="0" scrolling="no" charset="GBK"></iframe>
</div>--%>




<script type="text/javascript">





	$('#dg1').datagrid({    
	    url:'<%=request.getContextPath()%>/shopaction!queryshopdalei.action',
	    
	    columns:[[    
	        {field:'id',title:'编号',width:100},    
	        {field:'name',title:'商品大类名称',width:100},    
	        {field:'notes',title:'备注',width:100}]],
	    fitColumns:true,
	  	fit:false,
	    pagination:true,
	    pagePosition:"bottom",
		pageNumber:1,
		pageSize:10,
		pageList:[10,15,20],
		loadMsg:"数据库加载中。。。。。。。。。。。。。。。",
	}); 



function addshop1(){
	

	$("#dialog_addshop1").dialog({
		
		 title: '新增商品大类',    
		    width: 400,    
		    height: 200,    
		    closed: false,    
		    cache: false,
		    href:"<%=request.getContextPath()%>/shopaction!toaddshopdalei.action",
		    modal: true ,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					
					$.ajax({
						url:"<%=request.getContextPath()%>/shopaction!addshopdalei.action",
						data:$("#addshop_form").serialize(),
						dataType:"json",
						type:"post",
						success:function(data){
							$("#dialog_addshop1").dialog("close");
							$("#dg1").datagrid("reload");
							 $.messager.alert('恭喜','新增成功1');
						},error:function(){
							 $.messager.alert('警告','新增失败2');
						}
					})
				}	
				
			},{
				text:'取消',
				iconCls:'icon-cancel',
				handler:function(){
					$("#dialog_addshop").dialog("close");
				}
				
			}]
		})
}
function deleteshop1(){
	
	var ids=$("#dg1").datagrid("getSelections");

	if(ids.length!=1){
		  $.messager.alert('警告','请选择1项'); 
	}else{
				$.ajax({
				url:"<%=request.getContextPath()%>/shopaction!deleteshopdaleibyid.action?id="+ids[0].id,
			
				type:"post",
				success:function(){
					
					$("#dg1").datagrid("reload");
					$.messager.alert("恭喜","删除成功了");	
					
				},
				error:function(){
					$.messager.alert("报错","删除失败");	
					
				}
				})
			}
		

}
function updateshop1(){
	  var ids=$("#dg1").datagrid("getSelections");
	  
	  if(ids.length!=1){
		  $.messager.alert('警告','请选择1项'); 
	  }else{
		  $("#dialog_update1").dialog({
			  title:"修改商品大类",
			  width: 400,    
		      height: 200,    
		      closed: false,    
		      cache: false,
		      href:"<%=request.getContextPath()%>/shopaction!selectshopdaleibyid.action?id="+ids[0].id,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					
					$.ajax({
						url:"<%=request.getContextPath()%>/shopaction!addshopdalei.action",
						data:$("#updateshop_form").serialize(),
						dataType:"json",
						type:"post",
						success:function(data){
							$("#dialog_update1").dialog("close");
							$("#dg1").datagrid("reload");
							$.messager.alert('恭喜','修改成功'); 
						},error:function(){
							 $.messager.alert('警告','报错'); 
						}
					})
					
				}
			},{
				text:'取消',
				iconCls:'icon-cancel',
				handler:function(){
					$("#dialog_update1").dialog("close");
				}
			}]
		  })
	  }
}

</script>

</body>
</html>