
package jatek;

public class Jatek {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Karakter k1 = new Karakter();
        System.out.println(k1);
        Targy t = new Targy("valami", "");
        
        k1.felvesz(t, 5);
        System.out.println(k1);
        k1.hasznal("valami");
        System.out.println(k1);
        k1.hasznal("valami", 2);
        System.out.println(k1);
        k1.hasznal("valami", 3, false);
        System.out.println(k1);
    }
    
    
}
