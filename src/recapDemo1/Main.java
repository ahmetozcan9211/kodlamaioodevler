package recapDemo1;

public class Main {
    public static void main ( String [] args){
        int sayi1 = 20;
        int sayi2 = 23;
        int sayi3= 12;
        int sayi4 =41;
        int enBuyukSayi= sayi1;

        if(enBuyukSayi<sayi2){
            enBuyukSayi=sayi2;
        }
        if(enBuyukSayi<sayi3){
            enBuyukSayi=sayi3;
        }
        if (enBuyukSayi<sayi4){
            enBuyukSayi=sayi4;
        }
        System.out.println("En Büyük Sayı = " + enBuyukSayi);

    }
}
