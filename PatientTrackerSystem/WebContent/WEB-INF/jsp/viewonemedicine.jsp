<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="springcore" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Medicine</title>
</head>
<body>
<springform:form commandName="oneMedicine" method="post" action="updatemedicine.htm">
<table>
<tr>
<td><springform:label path="medicineId">Medicine ID:</springform:label>
<td><springform:input path="medicineId" disabled="true"/>
</tr>

<tr>
<td><springform:label path="medicineDescription">Medicine Descriptiom:</springform:label>
<td><springform:input path="medicineDescription"/>
</tr>

<tr>
<td><springform:label path="cureFor">Cure For:</springform:label>
<td><springform:input path="cureFor"/>
</tr>

<tr>
<td><springform:label path="manufacturingCompany">Manufacturing Company:</springform:label>
<td><springform:input path="manufacturingCompany"/>
</tr>

<tr>
<td><springform:label path="dosage">Dosage:</springform:label>
<td><springform:input path="dosage"/>
</tr>

<tr>
<td><springform:label path="prescribedFor">Prescribed For:</springform:label>
<td><springform:input path="prescribedFor"/>
</tr>

<tr>
<td><springform:label path="amount">Amount:</springform:label>
<td><springform:input path="amount"/>
</tr>

<tr>
<td><input type="submit" value="Update Medicine"></td>
</tr>
</table>
</springform:form>

<h1 style = "color=blue">${status}</h1>
<form method="get" action="index.htm">
<input type = "submit" value = "View Medicine"/>
</form>
</body>
</html>