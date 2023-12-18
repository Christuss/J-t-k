/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szendefi.k.daniel
 */
public class Kezdes extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Jobbra, vagy balra?";
    }
    
    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }

    @Override
    public String egyikBtnFelirat() {
        return "menj jobbra";
    }

    @Override
    public Helyszin masikIrany() {
        return new Bal();
    }

    @Override
    public String masikBtnFelirat() {
        return "menj balra";
    }

}
