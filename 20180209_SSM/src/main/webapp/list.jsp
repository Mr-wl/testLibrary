<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath }/"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
function fenye(curPage){
	location.href="student/list.do?name="+$("#name").val()+"&curPage="+curPage;
}
function query(){
	location.href="student/list.do?name="+$("#name").val();
}
function update(id){
	location.href="student/getById.do?id="+id;
}
function del(id){
	if(confirm("确认删除吗？"))
	location.href="student/del.do?id="+id;
}
function selAll(){
	$(".ck").prop("checked",$("#ckAll").prop("checked"));
}
function revSel(){
	$(".ck").each(function(){
		$(this).prop("checked",!$(this).prop("checked"))
	});
}
function batchDel(){
	var ids="";
	$(".ck:checked").each(function(){
		ids+=","+this.value;
	});
	if(ids.length<1){
		alert("请多选");
		return;
	}else{
		ids=ids.substr(1);
		if(confirm("确定要删除吗")){
			location.href="student/del.do?ids="+ids;
		}
	}
}

function batchCheck(){
	location.href="student/check.do"
}
</script>
</head>
<body>
请输入要查询的名字：<input text="text" id="name" value="${name }"/>
<button onclick="query()">查询</button>
<table>
	<tr>
	<th>
	  <input type="checkbox" id="ckAll" onclick="selAll()"/>全选/全不选
	</th>
		<th>序号</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>生日</th>
		<th>性别</th>
		<th>爱好</th>
		<th>图片</th>
		<th>操作 </th>
	</tr>
	<c:forEach items="${list }" var="s">
		<tr>
		    <td>
		      <input type="checkbox" class="ck" value="${s.id}"/>
		    </td>
			<td>${s.id }</td>
			<td>${s.name }</td>
			<td>${s.age }</td>
			<td>${s.birthday }</td>
			<td>${s.sex }</td>
			<td>${s.hobbies }</td>
			<td><img src='${s.photopath }'/></td>	
			<td>
			  <button onclick="update(${s.id})">修改</button>
		      <button onclick="del(${s.id})">删除</button>
			</td>
		</tr>
	</c:forEach>
	<tr>
	  <td colspan="10">
	     <button onclick="fenye(1)">首页</button>
	     <button onclick="fenye(${page.prevPage})">上一页</button>
	     <button onclick="fenye(${page.nextPage})">下一页</button>
	     <button onclick="fenye(${page.pageCount})">尾页</button>
	     
	  </td>
	</tr>
	<tr>
	  <td colspan="10">
	     <button onclick="revSel()">反选</button>
	     <button onclick="batchDel()">批量删除</button>
	     <button onclick="batchCheck()">批量查看</button>
	  </td>
	</tr>
	
</table>
</body>
</html>