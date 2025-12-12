import java.util.Random;

public class Student extends Person {

    protected String major, classRank, email;

    public String goToClass(String className){
        String message = "";
        message += firstName + " is now going to " + className + ".";
        return message;
    }

    @Override
    public String eatSomething(){
        Random random = new Random();
        String message;
        String [] food = {"Ramen Noodles", "Instant Oatmeal", "Home-made meal"};
        int randomNumber = random.nextInt(3);

        message = switch (food[randomNumber]) {
            case "Ramen Noodles" -> "It's 10:00 pm I think I'll grab some " + food[randomNumber] + " for dinner before I finish this assignment.";
            case "Instant Oatmeal" -> "I'm gonna grab some " + food[randomNumber] + " for breakfast before heading to class.";
            default -> "I love breaks. I'm super hungry for this " + food[randomNumber] + ".";
        };


        return message;
    }

    // Here are the get methods for the variables unique to the student subclass.
    public String getMajor(){
        String studentMajor = this.major;
        return studentMajor;
    }

    public String getClassRank(){
        String studentClassRank = this.classRank;
        return studentClassRank;
    }

    public String getEmail(){
        String studentEmail = this.email;
        return studentEmail;
    }

    // These are the set methods for the variables unique to the student subclass.
    public void setMajor(String major){
        this.major = major;
    }

    public void setClassRank(String classRank){
        this.classRank = classRank;
    }

    public void setEmail(String email){
        this.email = email;
    }
}