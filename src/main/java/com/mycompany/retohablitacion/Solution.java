
package com.mycompany.retohablitacion;

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
        public static Object[] statisticsGame(ArrayList <Enemigo> enemies){
        //EN ESTE ESPACIO PONER SU LÓGICA
        //creo arralist para guardar la vida
        ArrayList<Double> vida = new ArrayList<>();
        

        double promedioVida=0;
        double promedioCapacidad =0;
        double promedioVelocidad = 0;
        for (int i = 0; i < enemies.size(); i++) {
            //llena array vida y realiza suma iterativa  de vida de los anemigos
            vida.add(enemies.get(i).getVida());
            promedioVida += enemies.get(i).getVida();

            //suma iterativa de la variable capacidad de daño de los enemigos
            promedioCapacidad += enemies.get(i).getCapacidadDeDano();

            //suma iterativa de la variable velocidad de los enemigos
            promedioVelocidad = enemies.get(i).getVelocidad();
            System.out.println("este es el valor de la velocidad :: "+i+" "+ promedioVelocidad);

        }

        //calcula promedio de las variables vida, capacidad de daño, velocidad
        promedioVida /= enemies.size();
        promedioCapacidad /= enemies.size();
        promedioVelocidad = promedioVelocidad/enemies.size();
        System.out.println("promedio = "+promedioVelocidad);
        
        //crea array de tipo objetc con tamaño 5 que se llama retorno1 para retornar resultados que necesito
        Object[] informacion = new Object[5];

        informacion[0] = promedioVida;  //en la posicion cero del array informacion guardo promedio de vida
        informacion[1] = promedioCapacidad;  //en la posicion uno del array informacion guardo promedio cantidad de daño
        informacion[2] = enemies.get(vida.indexOf(Collections.max(vida))).getVida();
        informacion[3] = enemies.get(vida.indexOf(Collections.min(vida))).getVida();
        informacion[4] = promedioVelocidad;


        return informacion;
    }
    
}
