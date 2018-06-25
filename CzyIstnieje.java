package OdczytZapisPliku;

import java.io.File;

public class CzyIstnieje {

    public static boolean czyPlikIstnieje(String nazwa) {
        // Klasa File w Javie służy do reprezentacji i zarządzania ścieżkami do
        // plików i folderów, można jej użyć np. do sprawdzenia, czy dany plik
        // istnieje, jak pokazano poniżej.
        File f = new File(nazwa);
        return f.exists() && f.isFile();
    }
}
