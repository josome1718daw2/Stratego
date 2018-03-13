package com.login;


import java.sql.*;
import java.io.*;
import java.util.*;


public class Registre_Func {


    public void registreUsuari( String uname) throws IOException {
        FileInputStream in = new FileInputStream("C:\\xampp\\htdocs\\Repositorio\\Stratego\\WEB-INF\\database.properties");
        Properties props = new Properties();
        props.load(in);
        in.close();

        FileOutputStream out = new FileOutputStream("C:\\xampp\\htdocs\\Repositorio\\Stratego\\WEB-INF\\database.properties");
        props.setProperty("username", uname);
        props.store(out, null);
        out.close();



    }
    public void registrePassword(String pass) throws IOException {
        FileInputStream in = new FileInputStream("C:\\xampp\\htdocs\\Repositorio\\Stratego\\WEB-INF\\database.properties");
        Properties props = new Properties();
        props.load(in);
        in.close();

        FileOutputStream out = new FileOutputStream("C:\\xampp\\htdocs\\Repositorio\\Stratego\\WEB-INF\\database.properties");
        props.setProperty("password", pass);
        props.store(out, null);
        out.close();

    }
}