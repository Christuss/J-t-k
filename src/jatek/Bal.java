
package jatek;

public class Bal extends Helyszin implements MasikIrany{

    @Override
    public Helyszin egyikIrany() {
        return new Kelet();
    }

    @Override
    public String leiras() {
        return "Ez a bal.";
    }

    @Override
    public String egyikBtnFelirat() {
        return "Keletre";
    }

    @Override
    public Helyszin masikIrany() {
        return new Nyugat();
    }

    @Override
    public String masikBtnFelirat() {
        return "Nyugatra";
    }

}
