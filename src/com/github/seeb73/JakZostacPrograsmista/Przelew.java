package com.github.seeb73.JakZostacPrograsmista;

/**
 * Created by Sebastian on 04.07.2017.
 */

public class Przelew {

    // definicje typów danych
    private double amount;
    private String title;
    private String nazwaOdbiorcy;
    private String rachunekOdbiorcy;
    private String rachunekNadawcy = "78 1240 0001 3684 0110 7766 8444";
    private String walutaPrzelewu = "PLN";

    public Przelew(String tytulem, double kwota,String odbiorca, String odbiorcaRachunek) {
        title = tytulem;
        amount = kwota;
        nazwaOdbiorcy = odbiorca;
        rachunekOdbiorcy = odbiorcaRachunek;
    }

    public void wypiszDanePrzelewu()
    {
        System.out.println("Odbiorca: " + nazwaOdbiorcy );
        System.out.println("Tytułem: " + title +" Kwota: " + amount + " " + walutaPrzelewu );
        System.out.println("Z rachunku: " + rachunekNadawcy + ", Na rachunek: " + rachunekOdbiorcy );
    }

}
