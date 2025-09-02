import java.util.Scanner;

public class Teacher {
    public String name;
    public int age;
    public int income;
    public String subject;

    public String getListInfo() {
        return (name + " | " + age + " years old | " + "Teaches: " + subject + " | " + income + "kr monthly income");
    }

    public Teacher(String name, int age, int income, String subject) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.subject = subject;
    }

    Scanner scan = new Scanner(System.in);

    public void changeName() {

    }
    public void changeAge() {

    }

}
