package switchDemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'f';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("Güzel : Geçtiniz");
                break;
            case 'D':
                System.out.println("idare eder : Geçtiniz");
                break;
            case 'E':
                System.out.println("Kaldınız : Başarısız");
            default:
                System.out.println("geçersiz not");
        }


    }
}
