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


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Window> windows = new ArrayList<>();
        ArrayList<Bed> beds = new ArrayList<>();

        System.out.println("Windows: ");
        Window windows1 = new Window(false);
        Window windows2 = new Window(false);
        Window windows3 = new Window(false);
        Window windows4 = new Window(false);
        windows.add(windows1);
        windows.add(windows2);
        windows.add(windows3);
        windows.add(windows4);
        for (Window window: windows) {
            window.isOpen();
            System.out.println(window);

        }
        System.out.println();
        System.out.println("Beds: ");
        Bed bed1 = new Bed(2);
        Bed bed2 = new Bed(45);
        Bed bed3 = new Bed(65);
        beds.add(bed1);
        beds.add(bed2);
        beds.add(bed3);
        for (Bed bed : beds) {
            System.out.println(bed);

        }
        Room room = new Room(bed1, windows);
       // room.changeBedSheet();
        System.out.println(room);


    }
}