
package jatek;

public class Bal extends Helyszin{

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("nincs");
    }

    @Override
    public String leiras() {
        return "Ez a bal.";
    }

    @Override
    public String egyikBtnFelirat() {
        return "egyik";
    }

}
