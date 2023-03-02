public class Oddnumber1 {
    public int oddnumbercount( int low,int high){
        int count = 0;
        for( int i = low; i<=high;i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Oddnumber1  obj = new Oddnumber1();
       int result =  obj.oddnumbercount(1,20);
        System.out.println(result);
    }

}
