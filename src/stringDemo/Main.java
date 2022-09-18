package stringDemo;

public class Main {
    public static void main(String[] args) {
        String mesaj = "bugun hava cok guzel";
        /*System.out.println(mesaj);
        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.printf("5. elaman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("a"));
        System.out.println(mesaj.endsWith("l"));
        char[] karakterler = new char[20];
        mesaj.getChars(0, 20, karakterler,0);
        System.out.println(karakterler);*/


        System.out.println(mesaj.replace("a","-"));
        System.out.println(mesaj.substring(2,4));

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);

        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());


    }
}
