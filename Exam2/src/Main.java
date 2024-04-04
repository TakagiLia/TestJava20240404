public class Main {
    public static void main(String[] args) {

        int[] numberArray = {1, 5, 4, 3, 2};

        for (int number :
                numberArray) {
            if(number%2 != 0){
                System.out.println(number);
            }
        }
    }
}