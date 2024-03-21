package com.address.model;

public class Utilisateur {
    /*--------------------------------------------------
                    mODEL
     */



    private int id;
    private String name;
    private String firstaname;
    private String email;
    private String password;

    /*--------------------------------------------------
                Constructeur
     */
    public Utilisateur(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstaname() {
        return firstaname;
    }

    public void setFirstaname(String firstaname) {
        this.firstaname = firstaname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilisateur(String name, String firstaname, String email, String password){
        this.name = name;
        this.firstaname =firstaname;
        this.email =email;
        this.password =password;

    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                ", name='" + name + '\'' +
                ", firstaname='" + firstaname + '\'' +
                '}';
    }
}
