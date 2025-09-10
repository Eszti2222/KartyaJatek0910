package kartyajatek;

public class KartyaJatek {

    String[] szinek = {"P", "T", "Z", "M"};
    String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
    static String[] pakli = new String[24];  
    static String[] oszlop1 = new String[8];  
    static String[] oszlop2 = new String[8];  
    static String[] oszlop3 = new String[8];

    public static void main(String[] args) {
        osszeallit();
        kirak();
    }

}
