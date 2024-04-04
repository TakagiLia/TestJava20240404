public class Main {
    public static void main(String[] args) {

        //長方形
        int a1 = getSquareArea(3, 3);
        System.out.println(a1);

        //三角形
        double a2 = getTriangleArea(3, 3);
        System.out.println(a2);
    }

    //長方形計算メソッド
    private static int getSquareArea(int weight, int height) {
        return weight * height;
    }

    //三角形計算メソッド
    private static double getTriangleArea(int weight, int height) {
        return ((double) weight * (double)height) / 2;
    }

}