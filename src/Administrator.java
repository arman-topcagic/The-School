import java.util.Scanner;

public class Administrator {
    public String name;
    public int age;
    public int income;
    public String profession;

    public String getListInfo() {
        return (name + " | " + age + " years old | " + "Profession: " + profession + " | " + income + "kr monthly income");
    }

    public Administrator(String name, int age, int income, String profession) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.profession = profession;
    }

    Scanner scan = new Scanner(System.in);

    public void changeName(String name) {
        this.name = name;
    }
    public void changeAge(int age) {
        this.age = age;
    }

}
