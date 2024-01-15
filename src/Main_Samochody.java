import java.util.Random;
import java.util.Scanner;
interface Samochody{ //robisz interface

    int ile_samochodow(int ile); //to tez jest wymagane podczas tworzenia klasy która extends Rodzaj_auta
}
abstract class Rodzaj_auta implements Samochody{ //robisz abstrakcyjna klase co implementuje interface
    String Rodzaj;
    private int ilosc;
    public Rodzaj_auta(int ile) { // robisz podstawowy konstruktor w abstrakt klasie
        this.ilosc = ile;
    }
    abstract void koszt_samochodu(int cena); // dodajesz abstrakt voida
}
class Samochod_osobowy extends Rodzaj_auta{


    public Samochod_osobowy(int ile) { // i w kazdej nowej klasie robisz tego supera kóry jest tak jakby konstruktorem nowej klasy
        super(ile);
    }

    @Override
    void koszt_samochodu(int cena) {
        System.out.println("Aktualna cena samochodu: "+ cena);
    }

    @Override
    public int ile_samochodow(int ile) {
        return ile;
    }
}
class Autobus extends Rodzaj_auta{


    public Autobus(int ile) {
        super(ile);
    }

    @Override
    public int ile_samochodow(int ile) {
        return ile;
    }

    @Override
     void koszt_samochodu(int cena) {
        System.out.println("Aktualna cena samochodu: "+ cena);
    }
}



public class Main_Samochody {
        public static void main(String[] args){

        Samochod_osobowy S = new Samochod_osobowy(5);
        S.koszt_samochodu(2500);
        int iloscS = S.ile_samochodow(4);
        System.out.println("Ile Samochodow: "+ iloscS);

        Autobus A = new Autobus(2);
        A.koszt_samochodu(400);
        int iloscA = A.ile_samochodow(5);
        System.out.println("Ile Samochodow: "+ iloscA);



        }
}
