public class Naturalnumber1 {

    public int natural(int first,int last){
        for (int i = first; i<=last;i++){
            System.out.println("all natural numbers are" +" "+ i);
        }
        return 0;

    }

    public static void main(String[] args) {
        Naturalnumber1 obj = new Naturalnumber1();
        int result = obj.natural(1 ,99);
        System.out.println("all natural no are from 1 to 99");
    }

}
