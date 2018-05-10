<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="updateshopx_form">
<input type="hidden" name="shopxiaolei.id" value="${xiao.id }">
<input type="hidden" id="xialaid" value="${xiao.daid }">
<input type="hidden" id="xialaname" value="${xiao.daname }">

商品小类名称：<input  name="shopxiaolei.name"  value="${xiao.name }"   type="text" class="easyui-textbox" style="width:200px"><br/><br/>
所属商品大类：<select id="ccc" name="shopxiaolei.daid"  style="width:200px;"> 
				
		  </select> 
			<br/><br/>

备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注：<input  name="shopxiaolei.beizhu"  value="${xiao.beizhu }"  type="text" class="easyui-textbox" style="width:200px">
</form>


<script type="text/javascript">
	
$(function(){ 
	var a =$("#xialaid").val();
	var b =$("#xialaname").val();
	
    $.ajax({
    	url:"<%=request.getContextPath()%>/shopaction!selectshopdalei.action",
    	type:"post",
    	dataType:"json",
    	success:function(data){
		var str="<option value='"+a+"'>"+b+"</option>";
    		for (var int = 0; int < data.length; int++) {
    			console.log(data[int].id);
    			str+="<option value='"+data[int].id+"'>"+data[int].name+"</option>";
			}
    	$("#ccc").html(str);
    	},error:function(){
    		
    		
    	}
    	
    	
    })
	
	
});

</script>
</body>
</html>