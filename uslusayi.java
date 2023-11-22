
package patikaodevleri;
import java.util.Scanner;
public class uslusayi {
    public static void main(String[] args) {
        int taban,us;
        Scanner input=new Scanner(System.in);
        System.out.println("Taban giriniz:");
        taban=input.nextInt();
        System.out.println("Üs giriniz:");
        us=input.nextInt();
        int ushesabi=1,i=1;
        while (i<=us){
            ushesabi=ushesabi*taban;
            i++;

        }
        System.out.println("üs hesbaınız:"+ushesabi);


    }
}
