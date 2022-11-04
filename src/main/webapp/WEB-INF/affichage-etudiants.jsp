<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste Etudiants</title>
        <style>
            .styled-table {
                border-collapse: collapse;
                margin: 25px 0;
                font-size: 0.9em;
                font-family: sans-serif;
                min-width: 400px;
                box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
            }
            .styled-table thead tr {
                background-color: #009879;
                color: #ffffff;
                text-align: left;
            }
            .styled-table th,
            .styled-table td {
                padding: 12px 15px;
            }
            .styled-table tbody tr {
                border-bottom: 1px solid #dddddd;
            }

            .styled-table tbody tr:nth-of-type(even) {
                background-color: #f3f3f3;
            }

            .styled-table tbody tr:last-of-type {
                border-bottom: 2px solid #009879;
            }
            .etudiant-picture {
                height: 80px;
                width: auto;
            }
            h1 {
                color: #089c7c;
                font-family: verdana;
                font-size: 300%;
            }
            button {
                background-color: #089c7c;
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
              }
         </style>
    </head>
    <body>
        <div class="Content" align="Center">
        <h1>Liste des étudiants</h1>
            <table class="styled-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nom</th>
                        <th>Moyenne</th>
                        <th>Photo</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listeEtudiants}" var="etudiant">
                        <tr>
                            <td><c:out value="${etudiant.getId()}"/></td>
                            <td><c:out value="${etudiant.getNom()}"/></td>
                            <td><c:out value="${etudiant.getMoyenne()}"/></td>
                            <td><img class="etudiant-picture" src="./images/${etudiant.getImage()}" alt="${etudiant.getImage()}"/>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <form action="affichage-etudiants" method="POST">
                <button type="submit" name="order" value="asc"/>Croissant</button>
                <button type="submit" name="order" value="desc">Décroissant</button>
            </form>
        </div>
    </body>
</html>
