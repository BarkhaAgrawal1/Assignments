public class Reversestring {
    public static void main(String[] args) {

        String name  = "Barkha";
        String rev = " ";
        for(int i = name.length()-1; i>=0;i--){
            rev = rev + name.charAt(i);

        }
        System.out.println(" the reverse of Barkha is" +" "+ rev);



    }
}
