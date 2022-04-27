import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Methods {

    private ArrayList<Object> list0 = new ArrayList();

    public double avg(){
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
            /*
            if(grade >= 1 && grade <= 5){
                String thingy = String.valueOf(grade);
                //String thingy = grade + sub + crd;
                list.add(thingy);
                sum = sum + grade;
            }
            else{
                out.println("Given number not a grade.");
            }
             */
            String thingy = String.valueOf(grade);
            //String thingy = grade + sub + crd;
            list.add(thingy);
            sum = sum + grade;
            /*
            out.printf("%d. subject:", i+1);
            sub = be.nextLine();
            out.println();
            out.print("Credit:");
            int crd = be.nextInt();
            */
        }
        list0.add(list);
        average = sum / howmany;
        return average;
    }
    public void kki(){
        out.println(list0);
    }
}
