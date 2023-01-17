public class Palindrome {
    public static void main(String[] args)
    {
        int num=101;
        int remainder=0;
        int sum=0;
        int temp=0;
        temp=num;
        while(num!=0)
        {
            remainder=num%10;
            sum=(sum*10)+remainder;
            num=num/10;
        }
        if(temp!=sum)
        {
            System.out.println("It is not a Palindrome");
        }
        else
        {
            System.out.println("It is a palindrome");
        }
    }
}
