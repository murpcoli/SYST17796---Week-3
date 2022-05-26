package studentinfo;

/**
 * This class +++ Insert class description here +++
 *
 * @author Colin Murphy
 */
import java.util.Scanner;
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Student s = new Student();
        Student[] studList = new Student[5];
        
        for (int i = 0; i < studList.length; i++)
        {
            studList[i] = new Student();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studList[i].setName(sc.nextLine());
            System.out.print("Enter program for student " + (i + 1) + ": ");
            studList[i].setProgName(sc.nextLine());
            System.out.print("Enter address for student " + (i + 1) + ": ");
            studList[i].setAddress(sc.nextLine());
        }
        
        for (Student s1:studList)
        {
            System.out.print("Student Name: " + s1.getName() + "\t\t");
            System.out.print("Program Name: " + s1.getProgName() + "\t\t");
            System.out.print("Address: " + s1.getAddress() + "\n");
        }
        //test comment
    }

}
//test comment
