class dodawanie {
    int x = 0;
    int y = 0;
    String yogurt = "Wynik się zgadza!";
    int q;
    void Ldodawanie(){
        x = 5;
        y = 7;
        System.out.println("Następuje procedura dodawania: " + x + " + " + y);

        q = x + y;
        System.out.println("Wynik to: " + q);
        System.out.println(yogurt);
    }
    void Ldzielenie(){
        if(q == 12){
            int b;
            b = q/2;
            System.out.println("Wynik dzielenia to: " + b);
        }
        else{
            System.out.println("q nie jest równe 12!");
        }

    }

}
class dodawanieTester{
    public static void  main(String[] args){
        dodawanie obiekt1 = new dodawanie();
        obiekt1.Ldodawanie();
        obiekt1.Ldzielenie();


    }
}
