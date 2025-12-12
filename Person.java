//This code is from an assignment a few weeks ago.
import java.util.Scanner;

public class Person {
    static Scanner userinput = new Scanner(System.in);

        protected String firstName;
        protected String lastName;
        protected String gender;
        protected int age;
        protected Double weight;
        protected Double height;
        protected String ethnicGroup;
        protected String religion;

    public void sayGreeting() {
        System.out.println("\n");
        System.out.println("Hello! My name is " + this.firstName + ".");
        System.out.println("\n");
   }

    public void takeNap() throws InterruptedException {
        System.out.print("For how many seconds do you want me to be napping --> ");
        Double var1 = userinput.nextDouble();
        userinput.nextLine();
        System.out.println("\n");
        System.out.println("See you in " + var1 + " seconds...zzzz");
        Thread.sleep((long)(var1 * 1000.0));
        System.out.println("Ok, I'm up and awake.");
        System.out.println("\n");
   }

    public void sayPrayer() {
        System.out.print("Enter the prayer you want me to say --> ");
        String var1 = userinput.nextLine();
        System.out.println("\n");
        System.out.println(var1);
        System.out.println("\n");
   }

    public String eatSomething() {
        System.out.print("What food do you want the person to eat --> ");
        String food = userinput.nextLine();
        String message = "Mmm, " + food + " was delicious.";

        return message;
   }


   // Here are the get methods I added.

    public String getGender(){
        String personGender = this.gender;
        return personGender;
   }

    public int getAge(){
        int personAge = this.age;
        return personAge;
   }

    public Double getWeight(){
        Double personWeight = this.weight;
        return personWeight;
   }

    public Double getHeight(){
        Double personHeight = this.height;
        return personHeight;
   }

    public String getEthnicGroup(){
        String personEthnicGroup = this.ethnicGroup;
        return personEthnicGroup;
   }

    public String getReligion(){
        String personReligion = this.religion;
        return personReligion;
   }

    public String getName() {
        String var1 = this.firstName + " " + this.lastName;
        return var1;
   }


   // These are the set methods I added.

    public void setFirstName(String firstName){
        this.firstName = firstName;
   }

    public void setLastName(String lastName){
        this.lastName = lastName;
   }

   public void setGender(String gender){
        this.gender = gender;
   }

   public void setAge(int age){
        this.age = age;
   }

   public void setWeight(Double weight){
        this.weight = weight;
   }

   public void setHeight(Double height){
        this.height = height;
   }

   public void setEthnicGroup(String ethnicGroup){
        this.ethnicGroup = ethnicGroup;
   }

   public void setReligion(String religion) {
        this.religion = religion;
   }

}
