<%-- <% response.addHeader("Refresh","40"); %> --%> <!-- Referche la page chaque 40s -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/discStyle.css"/>" />
<meta charset="UTF-8">
<title>Envoyer Email</title>

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
				<td><div class="divContenu">

						<table>
							<tr>
								<td><b>${nom}${prenom} (<small>${email}</small>)
								</b></td>
							</tr>

							<tr>
								<td><c:set var="contact" value="${nom} ${prenom}" /> <c:set
										var="backCol" value="#FFFFFF" />
									<div class="DivDisc" id="Discussion">
										<table>
											<c:forEach var="disc" items="${ListDisc}" varStatus="i">
												<c:if test="${fn:length(ListDisc) > 0}">
													<tr align="left">
														<td><c:choose>
																<c:when test="${contact == disc.envoipar}">
																	<c:set var="backCol" value="#F0FFF0" />
																</c:when>
																<c:otherwise>
																	<c:set var="backCol" value="#FAEBD7" />
																</c:otherwise>
															</c:choose>
															<fieldset class="bullmsg"
																style="background-color: ${backCol}; ">
																<legend align="left" style="color: gray;">
																	${disc.envoipar} </legend>
																<p class="msgcontent">
																	<c:out value="${disc.msg}" />
																	<br> <small class="dateenvoi"> <c:out
																			value="${fn:substring(disc.dateenvoi, 0, 16)} " />
																	</small>
																</p>
															</fieldset></td>
													</tr>
												</c:if>
											</c:forEach>
										</table>
									</div></td>
							</tr>
							<tr>

								<form:form method="POST"
									action="${pageContext.servletContext.contextPath}/NewMail/${idFrom}/${idTo}/${idMsg}"
									modelAttribute="message">
									<tr>
										<td><form:textarea path="contenu"
												placeholder="Votre message" cols="60" rows="2" /></td>
									</tr>

									<tr>
										<td><input type="submit" value="envoyer" class="btn"></td>
									</tr>

								</form:form>

							</tr>
						</table>
					</div></td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		var elem = document.getElementById('Discussion');
		elem.scrollTop = elem.scrollHeight;
	</script>
</body>
</html>