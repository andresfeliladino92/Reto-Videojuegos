
package com.mycompany.retohablitacion;

import java.util.ArrayList;
import java.util.Arrays;


public class Lanzadora {
    public static void main(String[] args) {
        ArrayList<Enemigo> t1;
        t1 = new ArrayList<>();
        t1.add(new Enemigo("1037543456","Zombiembobo","Enemigo",3,6,1,0,20,1,"basic zombie"));
        t1.add(new Enemigo("1037543457","Zombimax","Enemigo",4,6,1.5,1,30,2,"powered zombie"));
        t1.add(new Enemigo("1037543458","Zombiembobo","Enemigo",3,7,1,0,20,1,"basic zombie"));
        t1.add(new Enemigo("1037543410","Zombiembobo","Enemigo",4,7,1,0,20,1,"basic zombie"));
        t1.add(new Enemigo("1037543459","Zombisaurio","Enemigo",3,8,0.5,5,89.9,10,"super powered zombie"));
        t1.add(new Enemigo("1037543411","Zombimax","Enemigo",4,8,1.5,1,30,2,"powered zombie"));
        t1.add(new Enemigo("1037543412","Zombiembobo","Enemigo",3,9,1,0,20,1,"basic zombie"));
        t1.add(new Enemigo("1037543413","Zombimax","Enemigo",4,9,1.5,1,30,2,"powered zombie"));
        
        Object retorno[] = Solution.statisticsGame(t1);
        System.out.println(Arrays.toString(retorno));
        

    }
        
}
