public class Swap {
    public static void main(String[]args)
    {
        int first_num=10;
        int second_num=20;
        first_num=first_num+second_num;
        second_num=first_num-second_num;
        first_num=first_num-second_num;
        System.out.println(first_num);
        System.out.println(second_num);
    }
}
