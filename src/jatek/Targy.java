/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.UUID;

/**
 *
 * @author szendefi.k.daniel
 */
public class Targy {
    String nev, leiras;
    UUID uuid;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        uuid = UUID.randomUUID();
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public UUID getUuid() {
        return uuid;
    }
    
    
}
