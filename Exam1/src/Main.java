import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("名前：");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.next();

        System.out.print("年齢：");
        Scanner scanAge = new Scanner(System.in);
        int age = scanAge.nextInt() + 10;

        System.out.println(name + "さんの10年後は" + age + "歳です！");
    }
}