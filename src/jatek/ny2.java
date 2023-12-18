/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szendefi.k.daniel
 */
public class ny2 extends Helyszin{

    @Override
    public String leiras() {
        return "ny2";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Nyugat();
    }

    @Override
    public String egyikBtnFelirat() {
        return "nyugat";
    }
    
}
