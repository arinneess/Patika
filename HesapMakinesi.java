import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("1. SAYI:");
        a=input.nextInt();
        System.out.println("2. SAYI:");
        b= input.nextInt();
        int islem;
        System.out.println("1-top\n 2-çıkar\n3-çarp\n4-bölme\nYapmak istediğiniz işlemi girin: ");
        islem= input.nextInt();
        switch (islem){
            case 1:
                System.out.println("toplam:"+(a+b));
                break;
            case 2:
                System.out.println("çıkarma:"+(a-b));
                break;
            case 3:
                System.out.println("çarpma:"+(a*b));
                break;
            case 4:
                System.out.println("bölme "+ (a/b));
                break;
        }
        System.out.println("PROGRAM BİTTİ.");



    }

}
