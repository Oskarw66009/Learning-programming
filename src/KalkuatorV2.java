import java.util.Scanner;

public class KalkuatorV2 {
        static int x = 0;
        static int y = 0;
        private int z = 1;
        static int number = 0;
        static int wynik = 0;
        private void dodawanie(){
            System.out.println("Wybrałeś dodawanie!\nWybierz liczbę pierwszą: ");
            KalkuatorV2 test = new KalkuatorV2();
            test.zast_scaner();
            wynik = x + y;
            System.out.println("Dodajemy: "+ x +" + "+ y +" = "+ wynik );
        }
        private void odejmowanie(){
            System.out.println("Wybrałeś odejmowanie!\nWybierz liczbę pierwszą: ");
            KalkuatorV2 test = new KalkuatorV2();
            test.zast_scaner();
            wynik = x - y;
            System.out.println("Odejmujemy: "+ x +" - "+ y +" = "+ wynik );
        }
        private void dzielenie(){
            System.out.println("Wybrałeś dzielenie!\nWybierz liczbę pierwszą: ");
            KalkuatorV2 test = new KalkuatorV2();
            test.zast_scaner();
            wynik = x / y;
            System.out.println("Dzielimy: "+ x +" : "+ y +" = "+ wynik );
        }
        private void mnozenie(){
            System.out.println("Wybrałeś mnożenie!\nWybierz liczbę pierwszą: ");
            KalkuatorV2 test = new KalkuatorV2();
            test.zast_scaner();
            wynik = x * y;
            System.out.println("Mnożymy: "+ x +" * "+ y +" = "+ wynik);
        }
        int getz(){
            return z;
        }
        void setz(){
            System.out.println("Czy chcesz coś policzyć jeszcze?\nJeśli tak wpisz liczbę większą od 0!");
            Scanner all3 = new Scanner(System.in);
            z = all3.nextInt();
        }

        private void getnumber(){
            System.out.println("Witam w prostym kalkulatorze, co chcesz zrobić?");
            System.out.println("1. Dodawanie\n2. Odejmowanie\n3. Dzielenie\n4. Mnożenie\n");

            Scanner wybierz_opcje = new Scanner(System.in); //  czyta daane które poda użytkownik
            number = wybierz_opcje.nextInt();           // to jest jedność
        }
        private void zast_scaner(){
            Scanner all = new Scanner(System.in);
            x = all.nextInt();

            System.out.println("Pierwsza liczba: "+ x);

            System.out.println("Wybierz drugą liczbę! ");
            Scanner all2 = new Scanner(System.in);
            y = all2.nextInt();

            System.out.println("Druga liczba: "+ y);
        }
        public static void main(String[] args){
            KalkuatorV2 jaka_operacja = new KalkuatorV2();
            KalkuatorV2 ile_operacji = new KalkuatorV2();
            jaka_operacja.getnumber();


            while(ile_operacji.getz() > 0) {
                switch (number) {
                    case 1 -> jaka_operacja.dodawanie();
                    case 2 -> jaka_operacja.odejmowanie();
                    case 3 -> jaka_operacja.dzielenie();
                    case 4 -> jaka_operacja.mnozenie();
                    default -> System.out.println("\n--------WPROWADZIŁEŚ ZŁĄ LICZBĘ!--------");
                }
                ile_operacji.setz();
                if(ile_operacji.getz() > 0){
                    jaka_operacja.getnumber();

                }
            }
        }
    }
