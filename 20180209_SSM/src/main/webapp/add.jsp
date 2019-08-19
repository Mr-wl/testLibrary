<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath }/"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="student/add.do" method="post" enctype="multipart/form-data">
	<p>
		姓名：<input type="text" name="name"/>
	</p>
	<p>
		年龄：<input type="text" name="age"/>
	</p>
	<p>
		生日：
		<input type="text" name="birthday"/>
	</p>
	<p>
		性别：
		<input type="radio" name="sex" value="男"/>男
		<input type="radio" name="sex" value="女"/>女
	</p>
	<p>
		爱好：
		<input type="checkbox" name="hobbies" value="吃"/>吃
		<input type="checkbox" name="hobbies" value="喝"/>喝
		<input type="checkbox" name="hobbies" value="玩"/>玩
		<input type="checkbox" name="hobbies" value="乐"/>乐
	</p>
	<p>
		照片：
		<input type="file" name="photo"/>
	</p>
	<p>
		<input type="submit" value="提交"/>
	</p>
</form>
</body>
</html>