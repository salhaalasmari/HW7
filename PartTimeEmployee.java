public  class PartTimeEmployee extends EmployeeOfPayAble{
    private int worlHours;
    private int wage;

    public PartTimeEmployee(String name, int id, int worlHours, int wage) {
        super(name, id);
        this.worlHours = worlHours;
        this.wage = wage;
    }


    @Override
    public double computeAmount() {
        return worlHours*wage;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "worlHours=" + worlHours +
                ", wage=" + wage +
                '}';
    }

    public int getWorlHours() {
        return worlHours;
    }

    public void setWorlHours(int worlHours) {
        this.worlHours = worlHours;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
