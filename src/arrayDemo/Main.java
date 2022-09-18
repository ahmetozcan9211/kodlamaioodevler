package arrayDemo;

public class Main {
    public static void main (String [] args){
        String ogrenci1="Engin";
        String ogrenci2 = "Deniz";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------------");
        String [] ogrenciler= new String[3];
        ogrenciler[0]="ahmet";
        ogrenciler[1]="deniz";
        ogrenciler[2]="engin";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
