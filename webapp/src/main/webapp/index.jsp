<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-easyui/jquery.easyui.min.js"></script>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/jquery-easyui/themes/ui-sunny/easyui.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/jquery-easyui/themes/icon.css"/>
</head>
	
   <body class="easyui-layout">   
   <!-- 
	布局组件  easyui-layout
	手风琴组件  easyui-accordion
	树  easyui-tree
	
	选项卡  easyui-tabs
 --> 
   	<div data-options="region:'north',title:'North Title',split:true,border:false" style="height:100px;"></div>   
   	<div data-options="region:'west',title:'West',split:true,border:false" style="width:200px;">
   		<div id="aa" class="easyui-accordion" data-options="fit:true" style="width:300px;height:200px;">   
		    <div title="Title1" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">   
		      
		       <ul id="tree" class="easyui-tree"></ul>
		    </div>   
		</div>  
   	</div>   
   	<div data-options="region:'center',title:'center title',border:false" style="padding:5px;background:#eee;">
   		<div id="tables" class="easyui-tabs" data-options="fit:true" style="width:500px;height:250px;">   
		    <div title="" style="padding:20px;display:none;">   
		        	欢迎来到股票管理系统  
		    </div>   
		</div>  
   	</div>   
	<script type="text/javascript">
		//在浏览器控制台打印信息
		//console.info(node)
		$('#tree').tree({    
		    url:"<%=request.getContextPath()%>/UserController!getTree.action",
		    method:"post",

		    onClick:function (node){
		    	if($("#tree").tree("isLeaf",node.target)){
		    		if($('#tables').tabs("exists",node.text)){
		    			$('#tables').tabs("select",node.text)
		    		}else{
		    			$('#tables').tabs('add',{    
				    	    title:node.text,    
				    	    href:node.url,
				    	    closable:true,    
				    	    tools:[{
				    	        iconCls:'icon-mini-refresh',    
				    	        handler:function(){    
				    	           	
				    	        }    
				    	    }]    
				    	}); 
		    		}
		    	}
		    }
		});  
	</script>
</body>  
</html>