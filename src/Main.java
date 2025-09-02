import java.util.Objects;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        clearScreen();

        boolean running = true;
        boolean loggedIn = false;

        //---- Object Info ----//

        Student student1 = new Student("Kevin", 16, 1250, "B");
        Student student2 = new Student("Liam", 17, 1250, "C");
        Student student3 = new Student("Iris", 18, 1250, "A");

        //---- ----------- ----//

        Teacher teacher1 = new Teacher("Anders", 67, 35000, "Physical Education");
        Teacher teacher2 = new Teacher("Mikael", 37, 45000, "History");
        Teacher teacher3 = new Teacher("Josefin", 26, 40000, "Swedish");

        //---- ........... ----//

        while (!loggedIn){
            System.out.println("Enter the correct password to continue:");

            String passwordInput = scan.next();
            if (Objects.equals(passwordInput, "123")){
                loggedIn = true;
                clearScreen();
                System.out.println("Welcome to the School Database Management System (SDMS)\nPlease chose a command from the list:\n");
            }
        }

        while (running && loggedIn) {
            System.out.println("1. List"
                    + "\n2. Edit"
                    + "\n3. Exit");
            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    clearScreen();
                    System.out.println("----Students----");
                    System.out.println(student1.getListInfo());
                    System.out.println(student2.getListInfo());
                    System.out.println(student3.getListInfo());

                    System.out.println("\n----Teachers----");
                    System.out.println(teacher1.getListInfo());
                    System.out.println(teacher2.getListInfo());
                    System.out.println(teacher3.getListInfo() + "\n");
                    break;

                case "2":
                    clearScreen();
                    System.out.println("Edit Menu:");
                    System.out.println("1. Edit Student");
                    System.out.println("2. Edit Teacher");
                    String editChoice = scan.nextLine();

                    if (editChoice.equals("1")) {
                        System.out.println("\nChoose student to edit:");
                        System.out.println("1. " + student1.name);
                        System.out.println("2. " + student2.name);
                        System.out.println("3. " + student3.name);
                        String studentChoice = scan.nextLine();

                        Student selectedStudent = null;

                        switch (studentChoice) {
                            case "1": selectedStudent = student1; break;
                            case "2": selectedStudent = student2; break;
                            case "3": selectedStudent = student3; break;
                            default: System.out.println("Invalid choice."); continue;
                        }

                        System.out.println("\nEnter new name: ");
                        String newStudentName = scan.nextLine();
                        selectedStudent.changeName(newStudentName);

                        System.out.println("\nEnter new age: ");
                        int newStudentAge = Integer.parseInt(scan.nextLine());
                        selectedStudent.changeAge(newStudentAge);

                        clearScreen();
                        System.out.println("Student updated!\n");

                    } else if (editChoice.equals("2")) {
                        System.out.println("\nChoose teacher to edit:");
                        System.out.println("1. " + teacher1.name);
                        System.out.println("2. " + teacher2.name);
                        System.out.println("3. " + teacher3.name);
                        String teacherChoice = scan.nextLine();

                        Teacher selectedTeacher = null;

                        switch (teacherChoice) {
                            case "1": selectedTeacher = teacher1; break;
                            case "2": selectedTeacher = teacher2; break;
                            case "3": selectedTeacher = teacher3; break;
                            default: System.out.println("Invalid choice."); continue;
                        }

                        System.out.println("\nEnter new name: ");
                        String newTeacherName = scan.nextLine();
                        selectedTeacher.changeName(newTeacherName);

                        System.out.println("\nEnter new age: ");
                        int newTeacherAge = Integer.parseInt(scan.nextLine());
                        selectedTeacher.changeAge(newTeacherAge);

                        clearScreen();
                        System.out.println("Teacher updated!\n");

                    } else {
                        System.out.println("Invalid option.\n");

                    }
                    break;
                case "3":
                    clearScreen();
                    System.out.println("Thank you for using SDMS!");
                    Thread.sleep(2000);
                    System.exit(0);
                    break;
                default:
                    clearScreen();
                    System.out.println("Error; please choose a valid option.\n");
                    break;
            }

        }

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
