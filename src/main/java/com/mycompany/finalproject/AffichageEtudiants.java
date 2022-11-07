package com.mycompany.finalproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/affichage-etudiants")
public class AffichageEtudiants extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String sort = (String)request.getSession().getAttribute("order");
        if(sort==null) {
            sort="";
        }
        if(sort.equals("asc")) {
            Collections.sort(GestionEtudiants.getListeEtudiants());
        }
        if(sort.equals("desc")) {
            Collections.sort(GestionEtudiants.getListeEtudiants(), Collections.reverseOrder());
        }
        request.setAttribute("listeEtudiants",GestionEtudiants.getListeEtudiants());
        request.setAttribute("order", sort);
        request.getRequestDispatcher("WEB-INF/affichage-etudiants.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    { 
        String sort = (String)request.getParameter("order");
        request.getSession().setAttribute("order", sort);
        doGet(request, response);
    }
}
