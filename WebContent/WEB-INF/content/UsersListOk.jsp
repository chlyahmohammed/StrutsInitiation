<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Liste des utilisateurs :</h1>
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>Identificateur</th><th>Name</th>
		</tr>
		<s:iterator value="users">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
			</tr>
		</s:iterator>
	</table>
	
</body>
</html>