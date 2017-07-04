package com.github.seeb73.JakZostacPrograsmista;

/**
 * Created by Sebastian on 04.07.2017.
 */

public class Przelew {

    // definicje typów danych
    private double kwotaPrzelewu;
    private String przelewTytulem;
    private String nazwaOdbiorcy;
    private String rachunekOdbiorcy;
    private String rachunekNadawcy = "78 1240 0001 3684 0110 7766 8444";
    private String walutaPrzelewu = "PLN";

    public Przelew(String tytulem, double kwota,String odbiorca, String odbiorcaRachunek) {
        przelewTytulem = tytulem;
        kwotaPrzelewu = kwota;
        nazwaOdbiorcy = odbiorca;
        rachunekOdbiorcy = odbiorcaRachunek;
    }

    public void wypiszDanePrzelewu()
    {
        System.out.println("Odbiorca: " + nazwaOdbiorcy );
        System.out.println("Tytułem: " + przelewTytulem +" Kwota: " + kwotaPrzelewu + " " + walutaPrzelewu );
        System.out.println("Z rachunku: " + rachunekNadawcy + ", Na rachunek: " + rachunekOdbiorcy );
    }
}