package managementsystem;

public class Executive extends Employee{

    boolean embezzlesMoney;

    public Executive(int id, String job, String name, String gender, int age, Long salary, boolean embezzlesMoney){
        super(id, job, name, gender, age, salary);
        this.embezzlesMoney = embezzlesMoney;
    }

    public Executive() {
    }

    public boolean isEmbezzlesMoney() {
        return embezzlesMoney;
    }

    public void setEmbezzlesMoney(boolean embezzlesMoney) {
        this.embezzlesMoney = embezzlesMoney;
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis executive embezzles money: "+embezzlesMoney;
    }
}
