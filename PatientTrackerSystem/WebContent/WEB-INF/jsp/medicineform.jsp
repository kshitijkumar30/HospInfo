<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="springcore" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert Details Here</title>
<style>
.error {
color: #ff0000;
font-style: italic;
}
</style>
</head>
<body>
<springform:form modelAttribute="medicineModel" method="post" action="addmedicine.htm">
<table>
<%-- <tr>
<td><springform:label path="medicineId">Medicine Id:</springform:label>
<td><springform:input path="medicineId"/></td>
<td><springform:errors path="medicineId" cssClass="error" /></td>
</tr> --%>
<tr>
<td><springform:label path="medicineDescription">Medicine Description:</springform:label>
<td><springform:input path="medicineDescription"/></td>
<td><springform:errors path="medicineDescription" cssClass="error" /></td>
</tr>
<tr>
<td><springform:label path="cureFor">Cure For:</springform:label>
<td><springform:input path="cureFor"/></td>
<td><springform:errors path="cureFor" cssClass="error" /></td>
</tr>
<tr>
<td><springform:label path="manufacturingCompany">Manufacturing Company:</springform:label>
<td><springform:input path="manufacturingCompany"/></td>
<td><springform:errors path="manufacturingCompany" cssClass="error" /></td>
</tr>
<tr>
<td><springform:label path="dosage">Dosage:</springform:label>
<td><springform:input path="dosage"/></td>
<td><springform:errors path="dosage" cssClass="error" /></td>
</tr>
<tr>
<td><springform:label path="prescribedFor">Prescribed For (Adult(A)/Child(C)):</springform:label>
<td><springform:input path="prescribedFor"/></td>
<td><springform:errors path="prescribedFor" cssClass="error" /></td>
</tr>
<tr>
<td><springform:label path="amount">Amount:</springform:label>
<td><springform:input path="amount"/></td>
<td><springform:errors path="amount" cssClass="error" /></td>
</tr>
<tr>
<td><input type="submit" value="Add Medicine"></td>
</tr>
</table>
</springform:form>
<h3 style ="color=blue;">${status}</h3>
<form method="get" action="index.htm">
<input type = "submit" value = "View Medicine"/>
</body>
</html>