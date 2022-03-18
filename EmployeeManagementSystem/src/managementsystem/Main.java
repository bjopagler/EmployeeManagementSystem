package managementsystem;

import java.util.Scanner;
import static managementsystem.UI.*;
import static managementsystem.EmployeeManagement.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        dB();
        boolean loop = true;
        while (loop) {
            int choice = menu();
            if (choice == 1) {
                addEmployee();
            } else if (choice == 2) {
                showEmployee();
            } else if (choice == 3) {
                showAllEmployees();
            } else if (choice == 4) {
                updateEmployee();
            } else if (choice == 5) {
                removeEmployee();
            } else if (choice == 6) {
                avgAgeAll();
            } else if (choice == 7) {
                avgSalary();
            } else if (choice == 8) {
                minEmployee();
            } else if (choice == 9) {
                maxEmployee();
            } else if (choice == 10) {
                sortEmployee();
            }
            else if (choice == 0) {
                loop = false;
            } else {
                System.out.println("Incorrect input!");
            }
        }
    }

    private static void dB() {
        Janitor j1 = new Janitor(1, "Janitor", "Gus", "male", 43, 10000L, true);
        OfficeWorker o1 = new OfficeWorker(2, "OfficeWorker", "Anne", "female", 43, 30000L, true);
        OfficeWorker o2 = new OfficeWorker(3, "OfficeWorker", "Frank", "male", 24, 30000L, false);
        Executive e1 = new Executive(4, "Executive", "Jane", "female", 30, 60000L, true);

        addDb(j1);
        addDb(o1);
        addDb(o2);
        addDb(e1);
    }
}
