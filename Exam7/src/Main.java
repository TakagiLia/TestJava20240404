import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList= new ArrayList<>();

        employeeList.add(new Employee("田中太郎",20));
        employeeList.add(new Engineer("鈴木一郎",25,"Java"));
        employeeList.add(new Employee("佐藤花子",30));

        for(Employee emp : employeeList){
            System.out.println(emp.introduce());
        }


    }
}