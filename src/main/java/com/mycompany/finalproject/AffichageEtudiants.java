package com.mycompany.finalproject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/affichage-etudiants")
public class AffichageEtudiants extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        if(GestionEtudiants.getListeEtudiants() == null) {
            GestionEtudiants.initiateList();   
        }
        request.setAttribute("listeEtudiants",GestionEtudiants.getListeEtudiants());
        request.getRequestDispatcher("WEB-INF/affichage-etudiants.jsp").forward(request, response);
    }
}
