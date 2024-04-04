import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("年齢を入力してください：");
        Scanner scan = new Scanner(System.in);
        int age = 0;

        try {
            age = scan.nextInt();
            if (age < 0 || age >= 131) {
                System.out.println("0以上130以下で入力してください");
            } else {
                System.out.println(age + "歳で登録しました");
            }
            scan.close();
        } catch (Exception ex) {
            System.out.println("整数で入力してください。");
        }
    }
}