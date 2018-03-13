package com.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*RequestDispatcher rd = request.getRequestDispatcher("index");
        rd.forward(request, response);*/

        System.out.println("entrada");
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        //coger usuario y password del .properties
        ConnexioMesProves tc = new ConnexioMesProves();
        String usuari = tc.obtenirUsuari();
        String password = tc.obtenirPassword();


        System.out.println(uname);
        System.out.println(usuari);

        System.out.println(pass);
        System.out.println(password);


        //si usuario y password ok, hace session y redirije
        if(uname.equals(usuari.trim()) && pass.equals(password.trim())){
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }
        else
        {
            System.out.println("error");
            response.sendRedirect("/");
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}



/* if (session.getAttribute("nom")==null){
            response.sendRedirect("/login");*/
/*
    JugadorBean j = new JugadorBean(request.getParameter("nom"),
            request.getParameter("password"));



        request.setAttribute("jugador", j);
                RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                rd.forward(request, response);
 */



  /*  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        Registre_Func tc = new Registre_Func();
        if(uname.equals(tc.obtenirUsuari()) && pass.equals(tc.obtenirPassword())){
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }
        else
        {
            response.sendRedirect("index.jsp");
        }
    }
*/

/*

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request,response);
        }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JugadorBean j = new JugadorBean(request.getParameter("nom"),
        request.getParameter("password"));

        request.setAttribute("jugador",j);
        RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
        rd.forward(request,response);

        }*/


/*

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");


        if(uname.equals("chema") && pass.equals("chema123")){
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }
        else
        {
            response.sendRedirect("/index.jsp");
        }
    }
 */