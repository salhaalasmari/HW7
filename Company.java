import java.util.ArrayList;

public class Company {
    private String name;
    ArrayList<PayAble> list;

    public Company(String name, ArrayList<EmployeeOfPayAble> list) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public Company(String name) {
        this.name = name;
    }

    public boolean add(PayAble p){
        try{
            list.add(p);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public double computeAmount() {
       double count=0;
        for (int i = 0; i <list.size() ; i++) {
            count+=list.get(i).computeAmount();

        }
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<PayAble> getList() {
        return list;
    }

    public void setList(ArrayList<PayAble> list) {
        this.list = list;
    }
}
