package managementsystem;

public class Employee {
    int id;
    String job;
    String name;
    String gender;
    int age;
    Long salary;

    public Employee() {

    }

    public Employee(int id, String job, String name, String gender, int age, Long salary) {
        this.id = id;
        this.job = job;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + " " + job + " " + name + " " + gender + " " + age + " " + salary;
    }
}


