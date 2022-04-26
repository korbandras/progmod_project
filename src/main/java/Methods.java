import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Methods {
    public double avg(){
        Scanner be = new Scanner(System.in);
        double avg;
        int grade, sum = 0, db = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        out.println("Insert grade:");
        grade = be.nextInt();
        boolean ok = true;
        while(ok){
            if(grade >= 1 && grade <= 5){
                list.add(grade);
                sum += grade;
                db++;
            }
            else{
                ok = false;
            }
        }
        avg = sum / db;
        return avg;
    }
}
