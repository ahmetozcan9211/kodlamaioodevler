package recapDemo2;

public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 9.4, 6.7, 7.2};
        double total = 0;
        double biggest = myList[0];

        for (double sayi : myList) {
            total = total + sayi;

            System.out.println(sayi);


        }
        System.out.println("Toplam = " + total);

        for (double number : myList) {
            if (biggest < number) {
                biggest = number;
            }
        }
        System.out.println("En büyük sayi = " + biggest);
        System.out.println("En büyük sayi = " + biggest);

    }
}
