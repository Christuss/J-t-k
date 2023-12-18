/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szendefi.k.daniel
 */
public class Jobbra extends Helyszin{

    @Override
    public String leiras() {
        return "Ez jobbra";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Del();
    }

   @Override
    public String egyikBtnFelirat() {
        return "Délre";
    }
    
}
