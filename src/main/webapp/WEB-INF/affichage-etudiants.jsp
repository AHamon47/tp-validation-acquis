<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste Etudiants</title>
    </head>
    <body>
        <h1>Liste des étudiants</h1>
        <c:forEach items="${listeEtudiants}" var="etudiant">
            <c:out value="${etudiant.toString()}"/><br/>
        </c:forEach>
    </body>
</html>
