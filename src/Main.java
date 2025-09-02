import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        boolean running = true;
        boolean loggedIn = false;

        //---- Object Info ----//

        Student student1 = new Student("Kevin", 16, 1250, "B");
        String student1Info = student1.getListInfo();

        Student student2 = new Student("\nLiam", 17, 1250, "C");
        String student2Info = student2.getListInfo();

        Student student3 = new Student("\nIris", 18, 1250, "A");
        String student3Info = student3.getListInfo();

        //---- ----------- ----//

        Teacher teacher1 = new Teacher("\nAnders", 67, 35000, "Physical Education");
        String teacher1Info = teacher1.getListInfo();

        Teacher teacher2 = new Teacher("\nMikael", 37, 45000, "History");
        String teacher2Info = teacher2.getListInfo();

        Teacher teacher3 = new Teacher("\nJosefin", 26, 40000, "Swedish");
        String teacher3Info = teacher3.getListInfo();

        //---- ........... ----//

        clearScreen();

        System.out.println("Welcome to the School Database Management System (SDMS)\nPlease chose a command from the list:\n");

        while (!loggedIn){
            System.out.println("Enter the correct password to continue:");

            String passwordInput = scan.next();
        }

        while (running && loggedIn) {
            System.out.println("1. List"
                    + "\n2. Edit"
                    + "\n3. Exit");
            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    clearScreen();
                    System.out.println("----Students----\n" + (String)student1Info + (String)student2Info + (String)student3Info);
                    System.out.println("\n----Teachers----" + (String)teacher1Info + (String)teacher2Info + (String)teacher3Info + "\n");
                    break;
                case "2":
                    clearScreen();
                    System.out.println("Enter new name: ");
                    student1.name = scan.nextLine();
                    student1.getListInfo();
                    break;
                case "3":
                    clearScreen();
                    System.out.println("Thank you for using SDMS!");
                    Thread.sleep(2000);
                    System.exit(0);
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
