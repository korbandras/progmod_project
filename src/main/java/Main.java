import java.util.Scanner;
import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        Methods meth = new Methods();
        Scanner be = new Scanner(System.in);
        out.println("1 - Average\n2 - Delete grade\n3 - Modify grade\n4 - Calculate\n5 - Exit");
        out.println("Choose from the options above:");
        int valaszt = be.nextInt();
        while(valaszt != 5 || valaszt >= 6 || valaszt <= 0){
            if(valaszt == 1){
                meth.avg();
            }
            if(valaszt == 2){
                out.println("2");
            }
            if(valaszt == 3){
                out.println("3");
            }
            if(valaszt == 4) {
                out.println("4");
            }
        }
    }
}