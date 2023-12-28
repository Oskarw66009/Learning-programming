import java.util.Random;
class obiekty_test {
    int x = 5;
    int y = 7;
    String tekst = "Koniec zadania!";
    private static int numer_dodawania = 0; // private static oznaczanie metody jako prywatnej dzięki temu zlicza z różnych obiektów
 //   int test;

    void dodawanie(){
        System.out.println("Rozpoczynamy dodawanie 2 liczb! ");
        x = x + y;
        System.out.println("Wynik dodawania to:" + x);

    }
    void losowanie(){
        System.out.println("Rozpoczynamy losowanie 2 liczb! ");
        Random random = new Random();
        int losowa = random.nextInt();
        System.out.println("Losowa liczba to: " + losowa);
    }
    void ile_razy_dodac(int dodawanko, int ile){
        while(dodawanko > 0) {
            ile = ile + 3;
            dodawanko = dodawanko -1;
            System.out.println("Wynik dodawania: " + ile);
            numer_dodawania = numer_dodawania +1;
            System.out.println("Jest to dodawanie numer: " + numer_dodawania);
        }
    }
/*
   int gettest(){
        return test;
    }
    void settest(int testustaw){
        test = testustaw;
    }
*/
    public static void main(String[] args){
    obiekty_test[] obiekt = new obiekty_test[4];
    int z = 0;
    while(z<4){
    obiekt[z] = new obiekty_test();
    obiekt[z].x = obiekt[z].x + z;
    obiekt[z].dodawanie();
    obiekt[z].losowanie();

    z = z + 1;
    }
    obiekty_test obiekt2 = new obiekty_test();
    obiekt2.ile_razy_dodac(2,4);

        obiekty_test obiekt3 = new obiekty_test();
        obiekt3.ile_razy_dodac(3,5);

        //obiekty_test obiekt4 = new obiekty_test();




    obiekty_test obiekt1 = new obiekty_test();
    System.out.println("--- "+ obiekt1.tekst +" ---");
    }
}
