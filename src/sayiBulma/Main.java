package sayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1,2,3,4,5,6,7,8,9,0};
        int aranacaksayi = 12;
        boolean varmi= false;

        for (int sayi:sayilar){
            if (sayi==aranacaksayi){
                varmi = true;
                break;

            }
        }
        if (varmi){
            System.out.println("bulundu");

        }else {
            System.out.println("bulunamadı");
        }
    }
}
