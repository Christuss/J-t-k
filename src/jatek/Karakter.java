/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author szendefi.k.daniel
 */
public class Karakter {
    int eletero, ugyesseg, szerencse;
    ArrayList<Targy> felszereles;
    Random rnd = new Random();

    public Karakter() {
        this.eletero = 2*d6() +12;
        this.ugyesseg = d6() +6;
        this.szerencse = d6()+6;
    }
    
    int d6() {
        return rnd.nextInt(6)+1;
    }
    
    void felvesz(Targy targy) {
        felszereles.add(targy);
    }
    void felvesz(Targy targy, int darab) {
        for (int i = 0; i < darab; i++) {
            felszereles.add(targy);
        }
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszereles=" + felszereles + '}';
    }

    
    
    
}
