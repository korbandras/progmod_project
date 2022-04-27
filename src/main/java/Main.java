
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.err;
import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        Methods meth = new Methods();
        Scanner be = new Scanner(System.in);
        try {
            out.println("1 - Average\n2 - KKI\n3 - Modify grade\n4 - Calculate\n5 - Exit");
            out.println("Choose from the options above:");
            int valaszt = be.nextInt();
            while (valaszt != 5 || valaszt >= 6 || valaszt <= 0) {
                if (valaszt == 1) {
                    out.printf("The average of the given grades: %.2f\n", meth.avg());
                    out.println("Choose from the previous options above:");
                    valaszt = be.nextInt();
                }
                if (valaszt == 2) {
                    meth.kki();
                    out.println("Choose from the previous options above:");
                    valaszt = be.nextInt();
                }
                if (valaszt == 3) {
                    out.println("3");
                }
                if (valaszt == 4) {
                    out.println("4");
                }
            }
        }
        catch(InputMismatchException e){
            err.println("Not a number.");
        }
        finally{
            out.println("End of program - Exiting");
        }
    }
}