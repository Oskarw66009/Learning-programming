class obiekty {
    int dlugosc = 5;
    int wysokosc = 6;
    //String teskt;

   void pole(){
        int wynik;

        wynik = wysokosc * dlugosc / 2;
        System.out.println("wielkość pola wynosi: " + wynik);
    }
    public static void main(String[] args){
    obiekty[] obiekt1 = new obiekty[5];
    int x = 0;
    while(x < 5){

        obiekt1[x] = new obiekty();
        obiekt1[x].wysokosc = obiekt1[x].wysokosc + x; //właśnie tak odnosi się do zmiennych obiekt tak zwana zmienna referencyjna
        obiekt1[x].pole();

    x = x + 1;
    }
    System.out.println("Koniec pętli, wszystkie obiekty zostały utworzone.");

    }
}
