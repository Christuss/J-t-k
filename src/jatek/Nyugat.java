/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szendefi.k.daniel
 */
public class Nyugat extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "ez nyugat";
    }

    @Override
    public Helyszin egyikIrany() {
        return new ny2();
    }

    @Override
    public String egyikBtnFelirat() {
        return "ny2";
    }

    @Override
    public Helyszin masikIrany() {
        return new ny1();
    }

    @Override
    public String masikBtnFelirat() {
        return "ny1";
    }
    
}
