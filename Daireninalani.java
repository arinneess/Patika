import java.util.Scanner;
public class Daireninalani {
    public static void main(String[] args){
        /* Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;    Çevre Formülü : 2 * π * r;
*/
        double alan;
        double cevre;
        double yaricap;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen yarıçapını giriniz:");
        yaricap=input.nextDouble();
        double pi;
        System.out.print("Lütfen pi sayısının değerini giriniz:");
        pi=input.nextDouble();
        alan=pi*yaricap*yaricap;
        cevre= 2*yaricap*pi;
        System.out.println("Dairenin alanı:"+alan+"   Dairenin çevresi:"+cevre);
        /*
ödev: Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
       */
        double r;
        double derece;
        System.out.print("Lütfen yarıçapı giriniz:");
        r=input.nextDouble();
        System.out.print("Lütfen dereceyi giriniz:");
        derece=input.nextDouble();
        double dalan;
        dalan=(pi*(r*r)*derece)/360;
        System.out.println("Dilimin alanı:"+dalan);


    }



}
