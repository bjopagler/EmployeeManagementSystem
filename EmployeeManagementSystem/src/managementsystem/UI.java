package managementsystem;

import static managementsystem.Main.sc;
public class UI {
    public static int menu() {
        System.out.println("""
        1. Add employee
        2. Show employee
        3. Show all employees
        4. Update employee
        5. Remove employee
        6. Average age of employees
        7. Average Salary of employees
        8. Show minimum id/age/salary
        9. Show maximum id/age/salary
        10. Sort employees
        0. Exit program""");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static int idAgeMenu() {
        System.out.println("""
        1. Id
        2. Age
        3. Salary""");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static int updateMenu() {
        System.out.println("""
        1. Name
        2. Gender
        3. Age
        4. Salary""");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static Employee createJanitor() {
        Janitor j = new Janitor();
        System.out.println("ID:");
        j.id = sc.nextInt();
        sc.nextLine();
        j.job = "Janitor";
        System.out.println("Does this Janitor mop floors? true/false");
        j.mopsFloors = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Name:");
        j.name = sc.nextLine();
        System.out.println("Gender:");
        j.gender = sc.nextLine();
        System.out.println("Age:");
        j.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Salary:");
        j.salary = sc.nextLong();
        return j;
    }
    public static Employee createOfficeWorker() {
        OfficeWorker o = new OfficeWorker();
        System.out.println("ID:");
        o.id = sc.nextInt();
        sc.nextLine();
        o.job = "OfficeWorker";
        System.out.println("Does this worker have insurance? true/false");
        o.healthInsurance = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Name:");
        o.name = sc.nextLine();
        System.out.println("Gender:");
        o.gender = sc.nextLine();
        System.out.println("Age:");
        o.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Salary:");
        o.salary = sc.nextLong();
        return o;
    }
    public static Employee createExecutive() {
        Executive ex = new Executive();
        System.out.println("ID:");
        ex.id = sc.nextInt();
        sc.nextLine();
        ex.job = "Executive";
        System.out.println("Does this Executive embezzle money? true/false");
        ex.embezzlesMoney = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Name:");
        ex.name = sc.nextLine();
        System.out.println("Gender:");
        ex.gender = sc.nextLine();
        System.out.println("Age:");
        ex.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Salary:");
        ex.salary = sc.nextLong();
        return ex;
    }
}
