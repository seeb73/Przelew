/**
 * Created by Sebastian on 04.07.2017.
 */
import com.github.seeb73.JakZostacPrograsmista.Przelew;

public class Test {
    public static void main(String[] args) {
        double amount = 199;
        String title = "Przelew do ZUSu";
        String nazwaOdbiorcy = "Zakład Ubezpieczeń Społecznych";
        String rachunekOdbiorcy ="78 1010 1023 0000 2613 9520 0000"; // zdrowotne ;)

        Przelew przelew = new Przelew(title, amount, nazwaOdbiorcy, rachunekOdbiorcy); // dodaj więcej pól do konstruktora
        przelew.wypiszDanePrzelewu();
    }
}
