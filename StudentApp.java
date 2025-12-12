import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        String firstName, lastName, gender, ethnicGroup, religion = "", major, classRank, email;
        int age;
        Double weight, height;

        System.out.print("Enter the student's first name --> ");
        firstName = userinput.nextLine();

        System.out.print("Enter the student's last name --> ");
        lastName = userinput.nextLine();

        System.out.print("Enter the student's gender --> ");
        gender = userinput.nextLine();

        System.out.print("Enter the student's ethnic group --> ");
        ethnicGroup = userinput.nextLine();

        System.out.print("Enter the student's age  --> ");
        age = userinput.nextInt();
        userinput.nextLine();

        System.out.print("Enter the student's weight --> ");
        weight = userinput.nextDouble();
        userinput.nextLine();

        System.out.print("Enter the student's height --> ");
        height =  userinput.nextDouble();
        userinput.nextLine();

        System.out.print("Enter the student's major --> ");
        major = userinput.nextLine();

        System.out.print("Enter the student's class rank --> ");
        classRank = userinput.nextLine();

        System.out.print("Enter the student'email --> ");
        email = userinput.nextLine();

        Student userStudent = new Student();
        
        userStudent.setFirstName(firstName);
        userStudent.setLastName(lastName);
        userStudent.setGender(gender);
        userStudent.setAge(age);
        userStudent.setWeight(weight);
        userStudent.setHeight(height);
        userStudent.setEthnicGroup(ethnicGroup);
        userStudent.setReligion(religion);
        userStudent.setMajor(major);
        userStudent.setClassRank(classRank);
        userStudent.setEmail(email);

        


        userinput.close();
    }

}
