/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szendefi.k.daniel
 */
public class Del extends Helyszin{

    @Override
    public String egyikBtnFelirat() {
        return "Kezdés";
    }

    @Override
    public String leiras() {
        return "Ez dél.";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }
    
}
