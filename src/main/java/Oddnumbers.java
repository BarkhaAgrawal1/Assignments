public class Oddnumbers {
    public static void main(String[] args) {


        int low = 1;
        int high = 19;
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
