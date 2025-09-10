package kartyajatek;

import java.util.Scanner;

public class KartyaJatek {




    static String[] pakli = new String[24];
    static String[] oszlop1 = new String[8];
    static String[] oszlop2 = new String[8];
    static String[] oszlop3 = new String[8];

    public static void main(String[] args) {
        indito();
  

    }

    private static void indito() {
        osszeallit();
        kirak();
    }
    public static void kirak(){
        for(int i =1; i< pakli.length; i++){
            System.out.printf("%-7s".formatted(pakli[i]));
            if(i%3==0){
                System.out.println("\n");
            }
        }
    }
    public static void osszeallit(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db= 1;
        for (int i=0; i<szinek.length-1;i++){
            for(int j =0; j< ertekek.length;j++){
                pakli[db++] = szinek[3] + "_" + ertekek[j];
            }
        }
        for (int i =0; i <3 ; i++){
        pakli[db++] = szinek[3] + "_" + ertekek[i];
        }
    }
}
