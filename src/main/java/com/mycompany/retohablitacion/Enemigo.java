
package com.mycompany.retohablitacion;

public class Enemigo extends Personaje{
    //Atributos
    private double vida;
    private int capacidadDeDano;
    private String especieMutante;

    public Enemigo(String identificador, String apodo, String rol, double posicionX, double posicionY, double velocidad, int nivel,double vida, int capacidadDeDano, String especieMutante) {
        super(identificador, apodo, rol, posicionX, posicionY, velocidad, nivel);
        this.vida = vida;
        this.capacidadDeDano = capacidadDeDano;
        this.especieMutante = especieMutante;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getCapacidadDeDano() {
        return capacidadDeDano;
    }

    public void setCapacidadDeDano(int capacidadDeDano) {
        this.capacidadDeDano = capacidadDeDano;
    }

    public String getEspecieMutante() {
        return especieMutante;
    }

    public void setEspecieMutante(String especieMutante) {
        this.especieMutante = especieMutante;
    }
    
    
 
    
}
