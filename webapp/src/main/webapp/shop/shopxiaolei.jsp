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



<table id="dg">
<div id="tb">
<div class="easyui-linkbutton" onclick="addshop()" data-options="iconCls:'icon-add',plain:true">新增</div>
<div class="easyui-linkbutton" onclick="deleteshop()" data-options="iconCls:'icon-remove',plain:true">删除</div>
<div class="easyui-linkbutton" onclick="updateshop()"data-options="iconCls:'icon-edit',plain:true">修改</div>
</div>
</table>


<div id="dialog_addshop"></div>
<div id="dialog_update"></div>


<script type="text/javascript">
function condshopxiaolei(){
	var aa= $("#shopxiaoleiname").val()
	
	$('#dg').datagrid('load',{
		name:aa,
	});
}

$(function(){
	$('#dg').datagrid({    
	    url:'<%=request.getContextPath()%>/shopaction!selectshopxiaolei.action',  
	    
	    columns:[[    
	        {field:'id',title:'编号',width:100},    
	        {field:'name',title:'商品小类名称',width:100},    
	        {field:'daname',title:'商品大类名称',width:100},    
	        {field:'notes',title:'备注',width:100},
	         
	        
	    ]]    ,
	    pagination:true,
		pageNumber:1,
		pageSize:10,
		pageList:[10,15,20],
		loadMsg:"数据库加载中。。。。。。。。。。。。。。。。。。",
	}); 
	})


function addshop(){
	

	$("#dialog_addshop").dialog({
		
		 title: '新增商品小类',    
		    width: 400,    
		    height: 200,    
		    closed: false,    
		    cache: false,
		    href:"<%=request.getContextPath()%>/shopaction!toaddshopxiaolei.action",
		    modal: true ,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					
					$.ajax({
						url:"<%=request.getContextPath()%>/shopaction!addshopxiaolei.action",
						data:$("#addshopx_form").serialize(),
						dataType:"json",
						type:"post",
						success:function(data){
							$("#dialog_addshop").dialog("close");
							$("#dg").datagrid("reload");
							 $.messager.alert('恭喜','新增成功'); 
						},error:function(){
							 $.messager.alert('警告','新增失败'); 
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
function deleteshop(){
	
	var ids=$("#dg").datagrid("getSelections");

	if(ids.length!=1){
		  $.messager.alert('警告','请选择1项'); 
	}else{
				$.ajax({
				url:"<%=request.getContextPath()%>/shopaction!deleteshopxiaoleibyid.action?id="+ids[0].id,
			
				type:"post",
				success:function(){
					
					$("#dg").datagrid("reload");
					$.messager.alert("恭喜","删除成功了");	
					
				},
				error:function(){
					$.messager.alert("报错","删除失败");	
					
				}
				})
			}
		

}
function updateshop(){
	  var ids=$("#dg").datagrid("getSelections");
	  
	  if(ids.length!=1){
		  $.messager.alert('警告','请选择1项'); 
	  }else{
		  $("#dialog_update").dialog({
			  title:"修改商品大类",
			  width: 400,    
		      height: 200,    
		      closed: false,    
		      cache: false,
		      href:"<%=request.getContextPath()%>/shopaction!selectshopxiaoleibyid.action?id="+ids[0].id,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					
					$.ajax({
						url:"<%=request.getContextPath()%>/shopaction!addshopxiaolei.action",
						data:$("#updateshopx_form").serialize(),
						dataType:"json",
						type:"post",
						success:function(data){
							$("#dialog_update").dialog("close");
							$("#dg").datagrid("reload");
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
					$("#dialog_update").dialog("close");
				}
			}]
		  })
	  }
}

</script>

</body>
</html>