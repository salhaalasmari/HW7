public class FullTimeEmployee extends EmployeeOfPayAble{
    private int weeklySalary;

    public FullTimeEmployee(String name, int id, int weeklySalary) {
        super(name, id);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;

    }


    @Override
    public double computeAmount() {
        return 4*weeklySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
