<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medicine Details</title>
</head>
<body>

<table>
<tr>
<th>Medicine Id</th><th>Medicine Description</th><th>Cure For</th><th>Manufacturing Company</th><th>Dosage</th><th>Prescribed For</th><th>Amount</th>
</tr>
<c:forEach items="${medicineList}" var="medicine">
<tr>
<td>
<a href="viewonemedicine.htm?medicineId=${medicine.medicineId}">
<c:out value="${medicine.medicineId}"/></a></td>
<td><c:out value="${medicine.medicineDescription}"/></td>
<td><c:out value="${medicine.cureFor}"/></td>
<td><c:out value="${medicine.manufacturingCompany}"/></td>
<td><c:out value="${medicine.dosage}"/></td>
<td><c:out value="${medicine.prescribedFor}"/></td>
<td><c:out value="${medicine.amount}"/></td>
</tr>
</c:forEach>
</table>
<h3 style ="color:blue;">${status1}</h3>
<form method="get" action="addmedicineform.htm">
<input type = "submit" value = "Add Medicine"/>
</form>
</body>
</html>