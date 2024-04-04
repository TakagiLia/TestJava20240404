import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        boolean operationFlg = true;

        while (operationFlg) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1：登録 2：削除 3：一覧表示 9：終了");
            System.out.print("操作番号を入力してください：");
            int operationNumber = scanner.nextInt();

            switch (operationNumber) {
                case 1 -> {
                    //名前と電話番号の登録
                    String name = getValue("名前を入力してください：");
                    String phoneNumber = getValue("電話番号を入力してください：");
                    //重複キーの入力での書き換え防止
                    if (!phoneBook.containsKey(name)) {
                        phoneBook.put(name, phoneNumber);
                    }
                }
                case 2 -> {
                    //名前をキーに削除
                    String name = getValue("名前を入力してください：");
                    phoneBook.remove(name);
                }
                case 3 -> {
                    //一覧表示
                    System.out.println("名前" + "　　　　 " + "電話番号");
                    System.out.println("---------------------------");
                    for (String name : phoneBook.keySet()) {
                        System.out.println(name + "　　　" + phoneBook.get(name));
                    }
                }
                case 9 -> {
                    //操作の終了
                    operationFlg = false;
                    scanner.close();
                }
                default -> System.out.println("不正な操作");
            }
        }
    }

    //入力エリア表示メソッド
    public static String getValue(String outputLabel) {
        System.out.print(outputLabel);
        Scanner scanName = new Scanner(System.in);
        return scanName.next();
    }
}