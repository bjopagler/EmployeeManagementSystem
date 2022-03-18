package managementsystem;

public class OfficeWorker extends Employee{

    boolean healthInsurance;

    public OfficeWorker(int id, String job, String name, String gender, int age, Long salary, boolean healthInsurance){
        super(id, job, name, gender, age, salary);
        this.healthInsurance = healthInsurance;
    }

    public OfficeWorker() {
    }

    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(boolean healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis worker has insurance: "+healthInsurance;
    }
}
