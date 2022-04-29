
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class Main1 {

    private static final Scanner be = new Scanner(System.in);

    public static void main(String[] args) {
        String filepath = "src/main/resources/grades.xml";
        ArrayList<Grades> grades = readGradesFromXML(filepath);
        menu(grades);
        saveGradestoXML(grades, filepath);
    }

    private static void menu(ArrayList<Grades> grades) {
        int choice = -1;
        while(choice != 7){
            out.println("1 - List Grades\r\n2 - Add New Grade\r\n3 - Modify Grade\r\n4 - Delete Grade\r\n5 - Average Calculator\r\n6 - KKI Calculator\r\n7 - Exit");
            try{
                choice = be.nextInt();
            }
            catch (InputMismatchException e){
                out.println("Not a number.");
            }
            be.nextLine();
            switch (choice){
                case 1 -> listGrades(grades);
                case 2 -> addNewGrade(grades);
                case 3 -> modifyGrade(grades);
                case 4 -> deleteGrade(grades);
                case 5 -> avg(grades);
                case 6 -> kki(grades);
            }
        }
    }

    private static void kki(ArrayList<Grades> grades) {

    }

    private static void avg(ArrayList<Grades> grades) {

    }

    private static void deleteGrade(ArrayList<Grades> grades) {

    }

    private static void modifyGrade(ArrayList<Grades> grades) {

    }

    private static void addNewGrade(ArrayList<Grades> grades) {
        grades.add(new Grades(inputSub(), inputCrd(), inputGrd()));
    }

    private static int inputGrd() {
        int grd = 1;
        while(grd >= 1 && grd <= 5) {
            out.print("Enter the grade of the new subject:");
            try {
                grd = be.nextInt();
                if(grd > 5 || grd < 1){
                    out.println("Grade must be 1-5.");
                }
            } catch (Exception e) {
                out.println("Grade must be a number (1-5).");
            }
            be.nextLine();
        }
        return grd;
    }

    private static int inputCrd() {
        int crd;
        out.print("Enter the credit value of new subject:");
        return be.nextInt();
    }

    private static String inputSub() {
        out.print("Enter new subject:");
        return be.nextLine();
    }

    private static void listGrades(ArrayList<Grades> grades) {
        out.println(grades);
    }

    private static ArrayList<Grades> readGradesFromXML(String filepath){
        ArrayList<Grades> grade = new ArrayList<>();
        try{
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(filepath);

            Element rootElement = document.getDocumentElement();
            NodeList childNodeList = rootElement.getChildNodes();
            Node node;
            for(int i = 0; i < childNodeList.getLength(); i++){
                node = childNodeList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    NodeList childNodesOfGradesTag = node.getChildNodes();
                    String sub = "", crd = "", grd = "";
                    for(int j = 0; j < childNodesOfGradesTag.getLength(); j++){
                        Node childNodeOfGradesTag = childNodesOfGradesTag.item(j);
                        if(childNodeOfGradesTag.getNodeType() == Node.ELEMENT_NODE){
                            switch (childNodeOfGradesTag.getNodeName()){
                                case "Subject" -> sub = childNodeOfGradesTag.getTextContent();
                                case "Credit" -> crd = childNodeOfGradesTag.getTextContent();
                                case "Grade" -> grd = childNodeOfGradesTag.getTextContent();
                            }
                        }
                    }
                    grade.add(new Grades(sub, Integer.parseInt(crd), Integer.parseInt(grd)));
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return grade;
    }

    private static void saveGradestoXML(ArrayList<Grades> grade, String filepath){
        try{
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element root = document.createElement("Semester");
            document.appendChild(root);
            for(Grades grades : grade){
                Element gradeElement = document.createElement("Sub");
                root.appendChild(gradeElement);
                childElement(document, gradeElement, "Subject", grades.getSubject());
                childElement(document, gradeElement, "Credit", String.valueOf(grades.getCredit()));
                childElement(document, gradeElement, "Grade", String.valueOf(grades.getGrade()));
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileOutputStream(filepath));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void childElement(Document document, Element par, String tag, String text){
        Element element = document.createElement(tag);
        element.setTextContent(text);
        par.appendChild(element);
    }
}