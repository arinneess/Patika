import java.util.Scanner;
public class ManavProgramı {
    public static void main(String[] args){
        // armut 2,14 elma 3,67 domates 1,11 muz 0,95  patlıcan 0,5 tl
        Scanner input= new Scanner(System.in);
        double a=2.14;
        double e=3.67;
        double d= 1.11;
        double m=0.95;
        double p=0.5;
        double ak,ek,dk,mk,pk;
        System.out.println("Armut kaç kilo:");
        ak=input.nextDouble();
        System.out.println("Elma kaç kilo:");
        ek=input.nextDouble();
        System.out.println("Domates kaç kilo:");
        dk=input.nextDouble();
        System.out.println("Muz kaç kilo:");
        mk=input.nextDouble();
        System.out.println("Patlıcan kaç kilo:");
        pk=input.nextDouble();
        double ucret=(a*ak)+(e*ek)+(d*dk)+(m*mk)+(p*pk);
        System.out.println("Toplam ücretiniz:"+ucret);


    }
}
