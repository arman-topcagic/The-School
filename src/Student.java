import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public int income;
    public String avgGrade;

    public String getListInfo() {
        return (name + " | " + age + " years old | " + "Average grade: " + avgGrade + " | " + income + "kr monthly income");
    }

    public Student(String name, int age, int income, String avgGrade) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.avgGrade = avgGrade;
    }

    Scanner scan = new Scanner(System.in);

    public void changeName(String name) {
        this.name = name;
    }
    public void changeAge(int age) {
        this.age = age;
    }

}
