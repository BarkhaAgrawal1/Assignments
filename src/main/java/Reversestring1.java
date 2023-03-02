public class Reversestring1 {
    public int reverse( String name,String rev){

        for(int i = name.length()-1; i>=0;i--)
            rev = rev+ name.charAt(i);
        {
            System.out.println(" the reverse of the name is" + rev);
        }


        return 0;
    }

    public static void main(String[] args) {
        Reversestring1 obj =  new Reversestring1();
       int result =  obj.reverse("Barkha" , " ");
        System.out.println(result);
    }
}
