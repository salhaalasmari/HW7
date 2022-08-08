public abstract class EmployeeOfPayAble implements PayAble{
    private String name ;
    private int id ;

    public EmployeeOfPayAble(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeOfPayAble{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
