package OdczytZapisPliku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OdczytFormatowany {

    public static void odczytFormatowany(String nazwa) throws IOException {
        Scanner plikWe = null;
        try {
            // "cebulkowy" sposób tworzenia obiektu klasy Scanner
            // BufferedReader zapewnia efektywny odczyt pliku dzięki
            // odczytowi blokowemu a nie znak po znaku
            plikWe = new Scanner(new BufferedReader(new FileReader(nazwa)));
            // sposób mniej efektywny też działa
            // plikWe = new Scanner(new FileReader(nazwa));

            // wczytaj kolejno wszystkie wyrazy (tokeny) z pliku, zsumuj te które
            // są liczbami całkowitymi
            int suma = 0;
            while (plikWe.hasNext()) { // czy jest coś do odczytu?
                if (plikWe.hasNextInt()) {
                    int l = plikWe.nextInt();
                    suma += l;
                } else {
                    plikWe.next(); // wczytaj kolejny "wyraz", ale nie rób z nim nic
                }
            }
            System.out.format("Suma wczytanych liczb wynosi: %d\n", suma);
        } finally {
            if (plikWe != null) {
                plikWe.close();
            }
        }
    }
}
