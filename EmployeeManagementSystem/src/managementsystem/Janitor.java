package managementsystem;

public class Janitor extends Employee{

    boolean mopsFloors;

    public Janitor(int id, String job, String name, String gender, int age, Long salary, boolean mopsFloors){
        super(id, job, name, gender, age, salary);
        this.mopsFloors = mopsFloors;
    }

    public Janitor() {
    }

    public boolean isMopsFloors() {
        return mopsFloors;
    }

    public void setMopsFloors(boolean mopsFloors) {
        this.mopsFloors = mopsFloors;
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis janitor mops floors: "+mopsFloors;
    }
}
