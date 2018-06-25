package OdczytZapisPliku;

import java.io.IOException;

import static OdczytZapisPliku.CzyIstnieje.czyPlikIstnieje;
import static OdczytZapisPliku.Odczyt.odczytPlikuTekstowego;
import static OdczytZapisPliku.OdczytFormatowany.odczytFormatowany;
import static OdczytZapisPliku.Zapis.zapisPliku;

public class PlikiMain {


    public static void main(String[] args) throws IOException {

        String nazwaPliku = "test.txt";

        if (czyPlikIstnieje(nazwaPliku)) {
            System.out.println("Plik " + nazwaPliku + " istnieje");
        } else {
            System.out.println("Nie ma pliku o nazwie " + nazwaPliku);
        }

        zapisPliku(nazwaPliku);
        odczytPlikuTekstowego(nazwaPliku);
        odczytFormatowany(nazwaPliku);
    }
}
