import java.util.Scanner;
public class HipotenusveAlanhesaplayanProgram {
    public static void main(String[]args){
        /*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.*/
        int bkenar,ikenar;
        double hipo;
        Scanner input= new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz:");
        bkenar=input.nextInt();
        System.out.print("İkinci Kenarı Giriniz:");
        ikenar=input.nextInt();
        hipo =Math.sqrt((bkenar*bkenar)+(ikenar*ikenar));
        System.out.println("Üçgenin hipotenüsü"+hipo);
        double cevre=bkenar+ikenar+hipo;
        double alan=bkenar*ikenar/2;
        System.out.println("Üçgenin çevresi:"+cevre+" Üçgenin alanı:"+alan);
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        int a,b,c;
        System.out.print("Üçgenin birinci kenarını giriniz:");
        a=input.nextInt();
        System.out.print("Üçgenin birinci kenarını giriniz:");
        b=input.nextInt();
        System.out.print("Üçgenin birinci kenarını giriniz:");
        c=input.nextInt();
        double u=(a+b+c)/2;
        double ucgenalan;
        ucgenalan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin çevresi:"+2*u+ " Üçgenin alanı:"+ucgenalan);







    }




}

