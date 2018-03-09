package login;


import java.sql.*;
import java.io.*;
import java.util.*;


public class ConnexioMesProves {



    public static String obtenirConnexio() throws SQLException, IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("C:\\Users\\Chema\\IdeaProjects\\Ejercicios_Java\\untitled01\\WEB-INF\\database.properties");
        props.load(in);
        in.close();

        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
        String url = props.getProperty("jdbc.url");
        String usuari = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return usuari;
    }
}