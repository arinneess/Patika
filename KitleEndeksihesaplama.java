import java.util.Scanner;
public class KitleEndeksihesaplama {
    public static void main(String[] args){

    //"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    //Kilo (kg) / Boy(m) * Boy(m)
    double kilo, boy;
    Scanner input = new Scanner(System.in);
    double endeks;
    System.out.print("Lütfen boy (1,62 gibi) giriniz:");
    boy=input.nextDouble();
    System.out.print("Lütfen kilo giriniz:");
    kilo=input.nextDouble();
    endeks=kilo/(boy*boy);
    System.out.println("Vücut kitle endeksiniz:"+endeks+"dir.");


    }
}
