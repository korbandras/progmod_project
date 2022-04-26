import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {
        Methods meth = new Methods();
        Scanner be = new Scanner(System.in);
        out.println("Válassz:\n1 - Average\n2 - Delete grade\n3 - Modify grade\n4 - Calculate\n5 - Exit");
        int valaszt = 0;
        while(valaszt != 5){
            out.println("Válaszz");
            valaszt = be.nextInt();
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