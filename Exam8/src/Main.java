import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1:グー、　2:チョキ、　3:パー　の中から選択してください");
        System.out.print("じゃん、けん、、、！：");

        int you = scan.nextInt();
        int com = random.nextInt(3) + 1;

        System.out.println("あなたは" + choiceToString(you) + "!");
        System.out.println("コンピュータは" + choiceToString(com) + "!");

        //判定するための結果算出
        int result = (you - com + 3) % 3;

        //勝ち負け判定
        switch (result) {
            case 0 -> System.out.println("引き分けでした");
            case 1 -> System.out.println("あなたの負け");
            case 2 -> System.out.println("あなたの勝ち");
        }
    }

    public static String choiceToString(int choice) {
        return switch (choice) {
            case 1 -> "グー";
            case 2 -> "チョキ";
            case 3 -> "パー";
            default -> "1~3以外の数字を入力してます";
        };
    }
}