public class Employee {

    private String name;
    private int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String introduce(){
        return name + "さんは" + age + "歳です。";
    }
}
