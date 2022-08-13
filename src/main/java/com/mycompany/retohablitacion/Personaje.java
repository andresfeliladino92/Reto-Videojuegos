
package com.mycompany.retohablitacion;

public class Personaje {
    //Atributos
    private String identificador;
    private String apodo;
    private String rol;
    private double posicionX;
    private double posicionY;
    private double velocidad;
    private int nivel;
    
    //Metodo contructor
    public Personaje(String identificador, String apodo, String rol, double posicionX, double posicionY,double velocidad , int nivel) {
        this.identificador = identificador;
        this.apodo = apodo;
        this.rol = rol;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.velocidad = velocidad;
        this.nivel = nivel;
    }
    
    //Metodos Getters and Setters 

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
    
    
}
