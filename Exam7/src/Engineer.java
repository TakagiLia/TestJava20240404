public class Engineer extends Employee{

    private String skill;

    Engineer(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    public String getSkill(){
        return this.skill;
    }

    public void setSkill(String skill){
        this.skill = skill;
    }
    @Override
    public String introduce(){
        String info = super.introduce();
        return info + "\n" + skill + "エンジニアです。";
    }

}
