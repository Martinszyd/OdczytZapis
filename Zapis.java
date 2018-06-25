package OdczytZapisPliku;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zapis {

    public static void zapisPliku(String nazwa) throws IOException {
        FileWriter plikWy = null;
        try {
            // tworzy nowy plik jeżeli nie istnieje, w przeciwnym przypadku
            // usuwa zawartość pliku i nadpisuje od początku
            plikWy = new FileWriter(nazwa);
            // zapis łańcucha
            String tekst = "Dziś jest piękny dzień\nna egzamin z programowania.\n";
            plikWy.write(tekst);
            // zapis po znaku
            for (char z = 'a'; z <= 'z'; z++) {
                plikWy.write(z);
                plikWy.write('\n');
            }

        } finally {
            if (plikWy != null) {
                plikWy.close();
            }
        }
        // teraz zapis przy użyciu klasy PrintWriter, która ma metody znane z
        // System.out
        PrintWriter plik2 = null;
        try {
            // true w konstruktorze FileWriter otwiera plik w trybie dopisywania
            // na końcu
            plik2 = new PrintWriter(new FileWriter(nazwa, true));
            plik2.println("Potęgi liczby 2 <= 1 mln");
            for (int i = 1; i <= 1000000; i *= 2) {
                plik2.format("%6d%n", i);
            }
        } finally {
            if (plik2 != null) {
                plik2.close();
            }
        }
    }
}
