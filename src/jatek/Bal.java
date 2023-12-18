
package jatek;

public class Bal extends Helyszin{

    @Override
    public Helyszin egyikIrany() {
        return new Del();
    }

    @Override
    public String leiras() {
        return "Ez a bal.";
    }

    @Override
    public String egyikBtnFelirat() {
        return "Délre";
    }

}
