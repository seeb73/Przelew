package com.github.seeb73.JakZostacPrograsmista;

/**
 * Created by Sebastian on 04.07.2017.
 */

public class Przelew {

    // definicje typów danych
    public  double amount;
    public  String title;
    public  String nazwaOdbiorcy;
    public  String rachunekOdbiorcy;
    private String rachunekNadawcy = "78 1240 0001 3684 0110 7766 8444";
    private String walutaPrzelewu = "PLN";

    public Przelew(String title, double amount,String nazwaOdbiorcy, String rachunekOdbiorcy) {
        this.rachunekNadawcy = rachunekNadawcy;
        this.title = title;
        this.amount = amount;
        this.nazwaOdbiorcy = nazwaOdbiorcy;
        this.rachunekOdbiorcy = rachunekOdbiorcy;
    }

    public void wypiszDanePrzelewu()
    {
        System.out.println("Odbiorca: " + this.nazwaOdbiorcy );
        System.out.println("Tytułem: " + this.title +" Kwota: " + this.amount + " " + walutaPrzelewu );
        System.out.println("Z rachunku: " + rachunekNadawcy + ", Na rachunek: " + this.rachunekOdbiorcy );
    }

}
