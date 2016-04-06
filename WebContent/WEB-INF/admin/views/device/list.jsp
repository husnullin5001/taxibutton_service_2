<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<table border="1">
	<thead>
		<tr>
			<th>#</th>
			<th>Api id</th>
			<th>Phone</th>
			<th>Key</th>
			<th>code name</th>
			<th>user name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${devices}" var="device">
			<tr class="infoTr">
				<td>${device.getId()}</td>
				<td>${device.getApiId()}</td>
				<td>${device.getPhone()}</td>
				<td>${device.getConfirmKey()}</td>
				<td>${device.getTaxi()}</td>
				<td>${device.getUserName()}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br />
<a href="create">Create</a>
<br />