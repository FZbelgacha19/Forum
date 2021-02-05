<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css"/>" />
<meta charset="UTF-8">
<title>Discussion</title>
</head>
<body>
	<div class="div">
		<c:import url="entete.jsp" />
	</div>
	<div class="div">
		<table>
			<tr>
				<td valign="top" align="left"><c:import url="profil.jsp"></c:import>
				</td>
				<td><div class="divContenu"
						style="height: 206px; overflow: auto;">
						<div style="display: none;">${idFrom}</div>
						<table>
							<c:set var="listSend" value="${SendBylist}" />
							<c:forEach var="auteur" items="${listAuteur}" varStatus="status">

								<c:if test="${auteur.id != idFrom}">
									<tr>
										<td>${auteur.nom}</td>
										<td>${auteur.prenom}</td>
										<td><small><a
												href="<c:url value='/envoiEmail/${idFrom}/${auteur.id}' />">${auteur.email}</a></small></td>
										<td><c:if test="${fn:contains(listSend, auteur.id) }">
												<b style="color: blue;">*</b>
											</c:if></td>
									</tr>
								</c:if>
							</c:forEach>
						</table>
					</div></td>
			</tr>
		</table>
	</div>
</body>
</html>