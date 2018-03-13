
package com.login;

import java.io.Serializable;
import java.util.ArrayList;


public class JugadorBean implements Serializable{
    private String nom;
    private String password;
    private ArrayList peces;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JugadorBean(String nom, String password) {
        this.nom = nom;
        this.password = password;
    }

    public JugadorBean(){

    }

}