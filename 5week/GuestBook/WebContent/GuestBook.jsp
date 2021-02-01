<%--
  Created by IntelliJ IDEA.
  User: Kym
  Date: 2021-01-30
  Time: 오전 1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>GuestBook</title>
</head>
<body>
	<h1>방명록</h1>
	<hr>

	<c:forEach var="item" items="${guestBookList}">
		<div>
			<div>id : ${item.getGuestBookId()}</div>
			<br>
			<div>name : ${item.getGuestBookName()}</div>
			<br>
			<div>${item.getGuestBookContent()}</div>
			<br>
			<div>regdate : ${item.getGuestBookDate()}</div>
			<br>
		</div>
		<hr>
	</c:forEach>

	<form action="register" method="post">
		<div>
			이름 : <input name="name" type="text">
		</div>
		<br>
		<div>
			내용 :
			<textarea rows="10" cols="70" name="content"></textarea>
		</div>
		<br>
		<div>
			<input type="submit" value="확인">
		</div>
	</form>
</body>
</html>
