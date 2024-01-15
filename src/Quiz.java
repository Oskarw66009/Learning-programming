import java.util.Random;
import java.util.Scanner;

public class Quiz {
    static int punkty = 0;
    static int x = 0;
    static int dobra_odpowiedz;
    static final Quiz Quiz1 = new Quiz();
    static int losowy;
    static int z =0;
    static int pytanie1, pytanie2, pytanie3 = 0;

    final void pula_pytan() {
        int i;
        for (i = 0; i < 3; i++) {
        Quiz1.losuj_numerypytan();
            switch (losowy) {
                case 0 -> {
                    System.out.println("Pytanie numer 1:\n Jakie zwierze jest na Logo marki Mustang?\n1) Żółw.\n2) Koń.\n3) Pies.");
                    Scanner wybrany_numer = new Scanner(System.in);
                    x = wybrany_numer.nextInt();
                    dobra_odpowiedz = 2;
                    Quiz1.sprawdz_odp();
                }
                case 1 -> {
                    System.out.println("Pytanie numer 2:\n Ile kół ma samochód?\n1) 5.\n2) 2.\n3) 4.");
                    Scanner wybrany_numer1 = new Scanner(System.in);
                    x = wybrany_numer1.nextInt();
                    dobra_odpowiedz = 3;
                    Quiz1.sprawdz_odp();
                }
                case 2 -> {
                    System.out.println("Pytanie numer 3:\n Ulubiony yogurt Łysego?\n1) Cebulowy.\n2) Bananowy.\n3) Orzechowy.");
                    Scanner wybrany_numer2 = new Scanner(System.in);
                    x = wybrany_numer2.nextInt();
                    dobra_odpowiedz = 1;
                    Quiz1.sprawdz_odp();
                }
                case 3 -> {
                    System.out.println("Pytanie numer 4:\n Ile ziemia ma lat?\n1) Około 4,6 mld lat.\n2) Około 2 mld lat.\n3) 5,4 mld lat.");
                    Scanner wybrany_numer3 = new Scanner(System.in);
                    x = wybrany_numer3.nextInt();
                    dobra_odpowiedz = 1;
                    Quiz1.sprawdz_odp();
                }
                case 4 -> {
                    System.out.println("Pytanie numer 5:\n Jaka jest nawiększa planeta w naszym układzie słonecznym?\n1) Ziemia.\n2) Saturn.\n3) Jowisz.");
                    Scanner wybrany_numer4 = new Scanner(System.in);
                    x = wybrany_numer4.nextInt();
                    dobra_odpowiedz = 3;
                    Quiz1.sprawdz_odp();
                }
                default -> System.out.println("\n--------BŁĄD!--------");
            }
        }
    }
    private void sprawdz_odp(){
        if(x == dobra_odpowiedz){
            System.out.println("Dobrze!\n");
            punkty++;
        }else{
            System.out.println("Zła odpowiedź!\n");
        }
    }
    private void losuj_numerypytan(){
        if(z == 0){
            Random losowy_numer = new Random();
            losowy = losowy_numer.nextInt(5);
            pytanie1 = losowy;
            z++;
        }else if(z == 1){
            Random losowy_numer = new Random();
            losowy = losowy_numer.nextInt(5);
            pytanie2 = losowy;
            while(pytanie1 == pytanie2) {
                Random losowy_numer1 = new Random();
                losowy = losowy_numer1.nextInt(5);
                pytanie2 = losowy;
            }
            z++;
        }else{
            Random losowy_numer = new Random();
            losowy = losowy_numer.nextInt(5);
            pytanie3 = losowy;
            while(pytanie1 == pytanie3 ||  pytanie2 == pytanie3) {
                Random losowy_numer1 = new Random();
                losowy = losowy_numer1.nextInt(5);
                pytanie3 = losowy;
            }
        }
    }

    public static void main(String[] args){
    System.out.println("Witam w Quizie 3 pytań, teraz wylosujesz 3 pytania! ");
    Quiz test = new Quiz();
        test.pula_pytan();
        System.out.println("Koniec!\nTwoja ilość punktów to: "+ punkty);

    }
}
