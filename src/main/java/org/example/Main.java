package org.example;
//W tym zadaniu trzeba będzie stworzyć kilka obiektów,
// nadać im odpowiednie cechy(pola), przygotować konstruktory
// narzucające odpowiedni sposób uzupełniania tych cech oraz po
// jednym zachowaniu (metoda). Po stworzeniu każdego z obiektów
// przygotuj dla niego metodę toString i przetestuj w main czy
// budowanie go oraz metoda działa poprawnie tzn. cechy obiektu
// mają odpowiednie wartości.
//
// Zrób osobny pakiet, w którym zrealizujesz następujące założenia
// Obiekty typu Okno mogą być otwarte lub zamknięte
// Nowo stworzone okno jest zamknięte ale można je później otworzyć
// Przygotuj w programie tablicę 4 okien i otwórz wszystkie okna
// Obiekty typu Lozko posiadają licznik, ile dni minęło od ostatniej wymiany pościeli
// Przy każdym tworzeniu łóżka trzeba przekazać ile dni temu miało przebieraną pościel (nie używaj Scannera tylko parametrów konstruktora)
// Obiekty typu Pokoj posiadają jedno łóżko oraz tablicę okien
// Są dwa sposoby stworzenia pokoju. Przekazując łóżko oraz tablice okien oraz drugi wykorzystujący bezparametrowy konstruktor
// Tworząc pokój drugim sposobem w pokoju ma stworzyć się tablica z 2 oknami oraz łóżko nie przebierane od 5 dni
// Pokój można posprzątać wywołując odpowiednią metodę. Ma ona przebrać pościel oraz pootwierać wszystkie okna
// Obiekty typu Dom posiadają tablicę pokojów
// Aby stworzyć dom należy przekazać pokoje przez konstruktor
// W programie stwórz dom z dwoma pokojami: jeden domyślny, a drugi, większy z czterema oknami


import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Windows windows1 = new Windows(false);
        Windows windows2 = new Windows(false);
        Windows windows3 = new Windows(false);
        Windows windows4 = new Windows(false);
        String s = windows1.toString();
        System.out.println(s);
        System.out.println();
        ArrayList<Windows> windows = new ArrayList<>();
        windows.add(windows1);
        windows.add(windows2);
        windows.add(windows3);
        windows.add(windows4);
        for (Windows window: windows) {
            window.isOpen();
            System.out.println(window);

        }


    }
}