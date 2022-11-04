<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste Etudiants</title>
        <style>
            table, td {
                border: 1px solid #333;
            }

            thead, tfoot {
                background-color: #333;
                color: #fff;
            }
         </style>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th colspan="3">Liste des étudiants</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>ID</td>
                    <td>Nom</td>
                    <td>Moyenne</td>
                </tr>
                <c:forEach items="${listeEtudiants}" var="etudiant">
                    <tr>
                        <td><c:out value="${etudiant.getId()}"/></td>
                        <td><c:out value="${etudiant.getNom()}"/></td>
                        <td><c:out value="${etudiant.getMoyenne()}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
