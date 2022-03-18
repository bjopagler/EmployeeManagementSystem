package managementsystem;

import static managementsystem.Main.sc;
import static managementsystem.UI.*;
import java.util.ArrayList;

public class EmployeeManagement {
    private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
    static int nextFreePosition = 0;

    public static void addEmployee() {
        System.out.println("What job does the new employee have? Choose from Janitor, OfficeWorker, or Executive?");
        String newJob = sc.nextLine();
        if(newJob.equals("Janitor")){
            Janitor j = (Janitor) createJanitor();
            employeeList.add(j);
            nextFreePosition++;
        }
        if(newJob.equals("OfficeWorker")){
            OfficeWorker o = (OfficeWorker) createOfficeWorker();
            employeeList.add(o);
            nextFreePosition++;
        }
        if(newJob.equals("Executive")){
            Executive ex = (Executive) createExecutive();
            employeeList.add(ex);
            nextFreePosition++;
        }
    }

    public static void showEmployee() {
        System.out.println("Id:");
        int id = sc.nextInt();
        for (int i = 0; i < nextFreePosition; i++) {
            if (employeeList.get(i).id == id) {
                System.out.println(employeeList.get(i));
            }
        }
    }

    public static void showAllEmployees() {
        for (int i = 0; i < nextFreePosition; i++) {
            System.out.println(employeeList.get(i));
        }
    }

    public static void updateEmployee() {
        showAllEmployees();
        System.out.println("Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("update what?");
        int choice = updateMenu();
        if (choice == 1) {
            System.out.println("New name:");
            String name = sc.nextLine();
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).id == id) {
                    employeeList.get(i).name = name;
                    System.out.println(employeeList.get(i));
                }
            }
        } else if (choice == 2) {
            System.out.println("New gender:");
            String gender = sc.nextLine();
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).id == id) {
                    employeeList.get(i).gender = gender;
                    System.out.println(employeeList.get(i));
                }
            }
        } else if (choice == 3) {
            System.out.println("New age:");
            int age = sc.nextInt();
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).id == id) {
                    employeeList.get(i).age = age;
                    System.out.println(employeeList.get(i));
                }
            }
        } else if (choice == 4) {
            System.out.println("New salary:");
            long salary = sc.nextLong();
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).id == id) {
                    employeeList.get(i).salary = salary;
                    System.out.println(employeeList.get(i));
                }
            }
        }
    }

    public static void removeEmployee() {
        showAllEmployees();
        System.out.println("Id:");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nextFreePosition; i++) {
            if (employeeList.get(i).id == id) {
                System.out.println(employeeList.get(i).name + " will be removed.");
                employeeList.remove(i);
                nextFreePosition--;
            }
        }
    }

    public static void avgAgeAll() {
        double sum = 0;
        for (int i = 0; i < nextFreePosition; i++) {
            sum = sum + employeeList.get(i).age;
        }
        System.out.println("Average age is " + (sum / nextFreePosition) + " years.");
    }

    public static void avgSalary() {
        double sum = 0;
        for (int i = 0; i < nextFreePosition; i++) {
            sum = sum + employeeList.get(i).salary;
        }
        System.out.println("Average Salary is " + (sum / nextFreePosition));
    }

    public static void minEmployee() {
        int choice = idAgeMenu();
        int min = 0;
        if (choice == 1) {
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).id < employeeList.get(min).id) {
                    min = i;
                }
            }
            System.out.println("Minimum id is: " + employeeList.get(min).id);
        } else if (choice == 2) {
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).age < employeeList.get(min).age) {
                    min = i;
                }
            }
            System.out.println("Minimum age is: " + employeeList.get(min).age);
        } else if (choice == 3) {
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).age > employeeList.get(min).salary) {
                    min = i;
                }
            }
            System.out.println("Minimum salary is: " + employeeList.get(min).salary);
        }
    }

    public static void maxEmployee() {
        int choice = idAgeMenu();
        int max = 0;
        if (choice == 1) {
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).id > employeeList.get(max).id) {
                    max = i;
                }
            }
            System.out.println("Maximum id is: " + employeeList.get(max).id);
        } else if (choice == 2) {
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).age > employeeList.get(max).age) {
                    max = i;
                }
            }
            System.out.println("Maximum salary is: " + employeeList.get(max).age);
        } else if (choice == 3) {
            for (int i = 0; i < nextFreePosition; i++) {
                if (employeeList.get(i).age < employeeList.get(max).salary) {
                    max = i;
                }
            }
            System.out.println("Maximum salary is: " + employeeList.get(max).salary);
        }
    }

    public static void sortEmployee() {
        int choice = idAgeMenu();
        if (choice == 1) {
            for (int i = 0; i < nextFreePosition; i++) {
                for (int j = i + 1; j < nextFreePosition; j++) {
                    Employee tmp;
                    if (employeeList.get(i).id > employeeList.get(j).id) {
                        tmp = employeeList.get(i);
                        employeeList.set(i, employeeList.get(j));
                        employeeList.set(j, tmp);
                    }
                }
                System.out.println(employeeList.get(i));
            }
        }
        else if (choice == 2) {
            for (int i = 0; i < nextFreePosition; i++) {
                for (int j = i + 1; j < nextFreePosition; j++) {
                    Employee tmp;
                    if (employeeList.get(i).age > employeeList.get(j).age) {
                        tmp = employeeList.get(i);
                        employeeList.set(i, employeeList.get(j));
                        employeeList.set(j, tmp);
                    }
                }
                System.out.println(employeeList.get(i));
            }
        }
        else if (choice == 3) {
            for (int i = 0; i < nextFreePosition; i++) {
                for (int j = i + 1; j < nextFreePosition; j++) {
                    Employee tmp;
                    if (employeeList.get(i).salary > employeeList.get(j).salary) {
                        tmp = employeeList.get(i);
                        employeeList.set(i, employeeList.get(j));
                        employeeList.set(j, tmp);
                    }
                }
                System.out.println(employeeList.get(i));
            }
        }
    }

    public static void addDb(Employee e) {
        employeeList.add(e);
        nextFreePosition++;
    }
}