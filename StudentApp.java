import java.util.Scanner;

public class StudentApp {

    //This is the main method.
    public static void main(String[] args) throws InterruptedException {
        Scanner userinput = new Scanner(System.in);

        //Initiate all the necessary variables.
        String firstName, lastName, gender, ethnicGroup, religion = "", major, classRank, email;
        int age;
        Double weight, height;

        System.out.println("\n");

        //Prompt the user for all the information.
        System.out.print("Enter the student's first name --> ");
        firstName = userinput.nextLine();

        System.out.print("Enter the student's last name --> ");
        lastName = userinput.nextLine();

        System.out.print("Enter the student's gender --> ");
        gender = userinput.nextLine();

        System.out.print("Enter the student's ethnic group --> ");
        ethnicGroup = userinput.nextLine();

        System.out.print("Enter the student's religion --> ");
        religion = userinput.nextLine();

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

        //Initiate a student with the attributes entered by the user.
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

        System.out.println("\n");

        //Display the information about the student.
        System.out.println("Here is the information about the student:");
        System.out.println("Name: " + userStudent.getName());
        System.out.println("Gender: " + userStudent.getGender());
        System.out.println("Age: " + userStudent.getAge());
        System.out.println("Weight: " + userStudent.getWeight());
        System.out.println("Height: " + userStudent.getHeight());
        System.out.println("Ethnic Group: " + userStudent.getEthnicGroup());
        System.out.println("Religion: " + userStudent.getReligion());
        System.out.println("Major: " + userStudent.getMajor());
        System.out.println("Class Rank: " + userStudent.getClassRank());
        System.out.println("Email: " + userStudent.getEmail());

        System.out.println("\n");

        //Ask the user if they want to change the information.
        System.out.print("Would you like to change the student's info? Enter y for yes anything else for no --> ");
        String intent = userinput.nextLine();

        //This loop will run as long as the user still wants to make changes.
        while (intent.equalsIgnoreCase("y")){

            System.out.println("\n");

            //Ask the user which attribute they want to change.
            System.out.print("Enter the attribute you would like to change --> ");
            String att = userinput.nextLine();

            //Test if the user wants to change the name.
            if(att.equalsIgnoreCase("name")){

                System.out.println("\n");
                
                //Prompt the user for the new first name.
                System.out.print("Enter the student's first name --> ");
                firstName = userinput.nextLine();

                //Prompt the user for the last name.
                System.out.print("Enter the student's last name --> ");
                lastName = userinput.nextLine();

                //Update the students attributes.
                userStudent.setFirstName(firstName);
                userStudent.setLastName(lastName);

                //Show the user the new name.
                System.out.println("The changed name is: " + userStudent.getName());
            }
            //This will change the gender.
            else if(att.equalsIgnoreCase("gender")){

                System.out.println("\n");

                System.out.print("Enter the student's gender --> ");
                gender = userinput.nextLine();

                userStudent.setGender(gender);

                System.out.println("The student's gender is: " + userStudent.getGender());
            }
            //This will change the age.
            else if(att.equalsIgnoreCase("age")){

                System.out.println("\n");

                System.out.print("Enter the student's age --> ");
                age = userinput.nextInt();
                userinput.nextLine();

                userStudent.setAge(age);

                System.out.println("The student's new age is " + userStudent.getAge() + " years.");
            }
            //This will change the weight.
            else if(att.equalsIgnoreCase("weight")){

                System.out.println("\n");

                System.out.print("Enter the student's new weight --> ");
                weight = userinput.nextDouble();
                userinput.nextLine();

                userStudent.setWeight(weight);

                System.out.println("The student's changed weight is " + userStudent.getWeight());
            }
            //This will change the height.
            else if(att.equalsIgnoreCase("height")){

                System.out.println("\n");

                System.out.print("Enter the student's new height --> ");
                height = userinput.nextDouble();
                userinput.nextLine();

                userStudent.setHeight(height);

                System.out.println("The student's changed height is " + userStudent.getHeight());
            }
            //This will change the ethnic group.
            else if(att.equalsIgnoreCase("ethnic group")){

                System.out.println("\n");

                System.out.print("Enter the student's ethnic group --> ");
                ethnicGroup = userinput.nextLine();

                userStudent.setEthnicGroup(ethnicGroup);

                System.out.println("The student's ethnic group is: " + userStudent.getEthnicGroup());
            }
            //This will change the religion.
            else if(att.equalsIgnoreCase("religion")){

                System.out.println("\n");

                System.out.print("Enter the student's religion --> ");
                religion = userinput.nextLine();

                userStudent.setReligion(religion);

                System.out.println("The student's religion is: " + userStudent.getReligion());
            }
            //This will change the major.
            else if(att.equalsIgnoreCase("major")){

                System.out.println("\n");

                System.out.print("Enter the student's major --> ");
                major = userinput.nextLine();

                userStudent.setMajor(major);

                System.out.println("The student's major is: " + userStudent.getMajor());
            }
            //This will change the class rank.
            else if(att.equalsIgnoreCase("class rank")){

                System.out.println("\n");

                System.out.print("Enter the student's class rank --> ");
                classRank = userinput.nextLine();

                userStudent.setClassRank(classRank);

                System.out.println("The student's class rank is: " + userStudent.getClassRank());
            }
            //This will change the email.
            else if(att.equalsIgnoreCase("email")){

                System.out.println("\n");

                System.out.print("Enter the student's new email --> ");
                email = userinput.nextLine();

                userStudent.setEmail(email);

                System.out.println("The student's updated email is: " + userStudent.getEmail());
            }
            //This will let the user know that they entered something incorrectly.
            else{

                System.out.println("\n");

                System.out.println("The value you entered was not one of the attributes that the student has. Check your spelling and make sure you entered a valid attribute name.");
            }

            System.out.println("\n");

            //Display the updated information about the student.
            System.out.println("Here is the updated information about the student:");
            System.out.println("Name: " + userStudent.getName());
            System.out.println("Gender: " + userStudent.getGender());
            System.out.println("Age: " + userStudent.getAge());
            System.out.println("Weight: " + userStudent.getWeight());
            System.out.println("Height: " + userStudent.getHeight());
            System.out.println("Ethnic Group: " + userStudent.getEthnicGroup());
            System.out.println("Religion: " + userStudent.getReligion());
            System.out.println("Major: " + userStudent.getMajor());
            System.out.println("Class Rank: " + userStudent.getClassRank());
            System.out.println("Email: " + userStudent.getEmail());

            System.out.println("\n");

            //Ask the user if they want to keep changing values.
            System.out.print("Do you still want to change the information about the student? Enter y for yes anything else for no --> ");
            intent = userinput.nextLine();
        }

        System.out.println("\n");
        
        //Display the actions the student can perform.
        System.out.println("Here are the actions the student can perform:");
        System.out.println("1) Say a greeting");
        System.out.println("2) Take a nap");
        System.out.println("3) Say a prayer");
        System.out.println("4) Eat something");

        System.out.println("\n");

        //Ask the user if they want to do one of these tasks.
        System.out.print("Would you like the student to perform one of these tasks? Enter y for yes or anything else for no --> ");
        intent = userinput.nextLine();

        //This code will run as long as the user wants the student to continue doing tasks.
        while(intent.equalsIgnoreCase("y")){

            System.out.println("\n");

            //Prompt the user for the task they want to perform.
            System.out.print("Enter the number for the task you want the student to perform --> ");
            int task = userinput.nextInt();
            userinput.nextLine();

            System.out.println("\n");

            //Call the task the user choose.
            switch (task) {
                case 1 -> userStudent.sayGreeting();
                case 2 -> userStudent.takeNap();
                case 3 -> userStudent.sayPrayer();
                case 4 -> System.out.println(userStudent.eatSomething());
                //If none of the tasks are run, this will let the user know that there was a problem with the input.
                default -> System.out.println("Your input was invalid. You must enter an integer between 1 and 4.");
            }

            System.out.println("\n");

            //Ask the user if they want to continue doing tasks.
            System.out.print("Would you like the student to perform another task? Enter y for yes or anything else for no --> ");
            intent = userinput.nextLine();
        }

        System.out.println("\n");

        //Let the user know that the program is ending.
        System.out.println("Program is ending...");

        System.out.println("\n");

        //Close the scanner.
        userinput.close();
    }

}
