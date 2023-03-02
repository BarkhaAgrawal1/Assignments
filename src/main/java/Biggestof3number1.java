public class Biggestof3number1 {
    public int biggest(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println("a is the biggest");
        } else if (b > c && b > a) {
            System.out.println("b is the biggest");

        } else {
            System.out.println(" c is the biggest");
        }
        return 0;
    }

    public static void main(String[] args) {
        Biggestof3number1 obj = new Biggestof3number1();
        int res = obj.biggest(10,20,30);{
            System.out.println(res);
        }
    }



}
