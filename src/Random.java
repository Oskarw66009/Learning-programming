public class Random {

    private static final int y = 4;
    private static final int z = 5;
    static int numeracja = 0;
    void count(){
        numeracja++;
        System.out.println("\nNumer stworzonego obiektu: " + numeracja);

    }
    void dodawanie(){
        System.out.println("Dodajemy 2 liczby x: "+ z + "+ y: "+ y);
        int wynik;
        wynik = y + z;
        System.out.println("Wynik dodawania to: "+ wynik);
    }
    private static void  dane(String imie,int wiek, int waga){
        System.out.println("\nPodane imie: "+ imie + " Wiek: "+ wiek + " Waga: "+ waga);
        System.out.println("Aktualna numeracja obiektów: "+ numeracja);

    }

    private static void numeracja1(){
        if(numeracja < 2) {
            System.out.println("\n--------NUMERACJA JEST MNIEJSZA OD 2!!--------");
        }
        else if(numeracja == 2){
            System.out.println("\n--------NUMERACJA JEST RÓWNA 2!!--------");
        }
        else if(numeracja > 2){
            System.out.println("\n--------NUMERACJA JEST WIĘKSZA OD 2!!--------");
        }else{
            System.out.println("\n--------BŁĄD!--------");
        }
    }
    private static void numeracja2(){
        switch (numeracja){
            case 0: case 1:
                {System.out.println("\n--------NUMERACJA JEST MNIEJSZA OD 2!!--------");}
                break;
            case 2:
                if(numeracja == 2){System.out.println("\n--------NUMERACJA JEST RÓWNA 2!!--------");}
                break;
            case 3:
                if(numeracja > 2){System.out.println("\n--------NUMERACJA JEST WIĘKSZA OD 2!!--------");}
                break;
            default:
                System.out.println("\n--------LECI DALEJ!--------");
                break;
        }
    }


    public static void main(String[] args){

        Random[] Obiekt = new Random[5];
        int x = 0;
        while(x < 5){
        Obiekt[x] = new Random();
        Obiekt[x].numeracja2();
        Obiekt[x].count();
        x++;
        }

        Random Obiket1 = new Random();
        Obiket1.count();
        Obiket1.dodawanie();

        Random Obiekt2 = new Random();
        Obiekt2.count();
        Obiekt2.dane("Bartek", 56, 18 );

        /*--------------------------------------------------------------------------
        new Random();

        try {
            Random.dane(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2])); // pobieranie parametrów z programu
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        --------------------------------------------------------------------------*/

        System.out.println("\n----Koniec zadania!----");
        System.out.println("Podana ilość parametrów: "+args.length+"."); // ciekawostka ilość parametrów
    }
}
