import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Methods {
    public double avg(){
        Scanner be = new Scanner(System.in);
        double average;
        int grade;
        double sum = 0, howmany;
        ArrayList<Integer> list = new ArrayList<>();
        out.println("How many grades you have?");
        howmany = be.nextInt();
        for(int i = 0; i < howmany; i++){
            out.printf("Insert your %d. grade: ", i+1);
            grade = be.nextInt();
            list.add(grade);
            sum = sum + grade;
        }
        average = sum / howmany;
        /*
        out.printf("Átlag: %.2f", average);
        out.println();
        out.println(list);
         */
        return average;
    }
}
