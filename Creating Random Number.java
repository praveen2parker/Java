import java.lang.Math;
class RandomNumber {
    public static void main(String[] args) {
        int min=100000, max=999999;
        int a=(int)(Math.random()*(max-min)-min);
        System.out.println(a);
    }
}
