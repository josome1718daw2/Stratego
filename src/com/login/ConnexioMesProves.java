package com.login;

import java.io.*;
import java.util.*;


public class ConnexioMesProves {


    public String obtenirUsuari() throws IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("C:\\xampp\\htdocs\\Repositorio\\Stratego\\WEB-INF\\database.properties");
        props.load(in);
        in.close();

        String usuari = props.getProperty("username");
        return usuari;


    }
    public String obtenirPassword() throws IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("C:\\xampp\\htdocs\\Repositorio\\Stratego\\WEB-INF\\database.properties");
        props.load(in);
        in.close();


        String password = props.getProperty("password");

        return password;

    }
}