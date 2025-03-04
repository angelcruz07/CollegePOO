package com.miapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="MiServrlet", urlPatterns={"/MiServlet"})
public class MiServlet extends HttpServlet {
    @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out= response.getWriter()){
                out.println("<html>");
                out.println("<head><title> Mi Primer Serverlet </title><head>");
                out.println("<body>");
                out.println("<h1> Hola mundo </h1>");
                out.println("</body>");
                out.println("</html>");
            }  
    }
}
