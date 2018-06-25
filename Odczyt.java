package OdczytZapisPliku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt {

    // pliki tekstowe

    // dodanie throws IOException do nagłówka funkcji jest konieczne, ponieważ
    // wewnątrz tej funkcji nie zamierzamy obsługiwać ewentualnych wyjątków,
    // ale przekazać je dalej
    public static void odczytPlikuTekstowego(String nazwa) throws IOException {
        // klasa FileReader służy do odczytu plików tekstowych
        // następuje automatyczna konwersja odczytanych bajtów na znaki
        // unicode (16 bitowe)
        FileReader plikWe = null;
        try {
            plikWe = new FileReader(nazwa);
            System.out.println("Odczyt znak po znaku:\n");
            int c;
            // odczyt pliku znak po znaku i wyświetlenie na ekranie monitora
            while ((c = plikWe.read()) != -1) { // jeżeli c = -1 to koniec pliku
                System.out.print((char)c);
            }
        } finally { // klauzula finally służy do wykonania instrukcji
            // niezależnie od tego kiedy i w jaki sposób (normalnie lub
            // przez wyjątek) zostało zakończone wykonywanie bloku try
            if (plikWe != null) {
                plikWe.close(); // zamknięcie pliku
            }
        }
        // odczyt wiersz po wierszu
        BufferedReader plik2 = null;
        try {
            plik2 = new BufferedReader(new FileReader(nazwa));
            System.out.println("\n\nOdczyt buforowany:\n");
            String l = plik2.readLine();
            while (l != null) {
                System.out.println(l);
                l = plik2.readLine();
            }
        } finally {
            if (plik2 != null) {
                plik2.close();
            }
        }
    }
}
