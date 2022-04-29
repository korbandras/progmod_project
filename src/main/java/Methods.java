/*
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Methods {

    private ArrayList<Object> list = new ArrayList();
    private static final Scanner be = new Scanner(System.in);

    private static void menuProcessing(ArrayList<> list) {
        int choice = -1;
        while (choice != 5) {
            System.out.println("1 - Average\n2 - KKI\n3 - Modify grade\n4 - Delete grade\n5 - Exit");
            try {
                choice = be.nextInt();
            } catch (Exception e) {
                System.out.println("Not valid option.");
            }
            be.nextLine();
            switch (choice) {
                case 1 -> out.printf("The average is %.2f", avg());
                case 2 -> out.println("kki");
                case 3 -> out.println("modify");
                case 4 -> out.println("delete");
            }
        }
    }
    public static double avg(){
        Scanner be = new Scanner(System.in);
        double average;
        int grade;
        double sum = 0, howmany;
        String sub;
        ArrayList<String> list = new ArrayList<>();
        //DocumentBuilderFactory build = DocumentBuilderFactory.newInstance();
        out.println("How many grades you have?");
        howmany = be.nextInt();
        for(int i = 0; i < howmany; i++){
            out.printf("Insert your %d. grade: ", i+1);
            grade = be.nextInt();

            if(grade >= 1 && grade <= 5){
                String thingy = String.valueOf(grade);
                //String thingy = grade + sub + crd;
                list.add(thingy);
                sum = sum + grade;
            }
            else{
                out.println("Given number not a grade.");
            }

            String thingy = String.valueOf(grade);
            //String thingy = grade + sub + crd;
            list.add(thingy);
            sum = sum + grade;

            out.printf("%d. subject:", i+1);
            sub = be.nextLine();
            out.println();
            out.print("Credit:");
            int crd = be.nextInt();

        }
        //list0.add(list);
        average = sum / howmany;
        return average;
    }
    public void kki(){
        out.println(list0);
    }
}
*/