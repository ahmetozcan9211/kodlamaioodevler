package mukemmelSayi;

public class Main {
    public static void main(String[] args) {
        int number = 6;
        int toplam=0;

        for (int i = 1 ;i<number;i++){
            if (number %i==0){
                toplam = toplam + i;

            }
        }
        if (toplam == number){
            System.out.println("bu sayı mukemmel sayidir");
        } else{
            System.out.println("mukemmel sayi değil");
        }
    }
}
