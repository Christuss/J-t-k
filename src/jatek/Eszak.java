/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szendefi.k.daniel
 */
public class Eszak extends Helyszin{

    @Override
    public String leiras() {
        return "észak";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Eszak();
    }

    @Override
    public String egyikBtnFelirat() {
        return "button";
    }
    
}
