class Maximum
{
    public static void main(String[] args)
    {
        int first_num=50;
        int second_num=20;
        int third_num=30;
        int temp=first_num>second_num?first_num:second_num;
        temp=third_num>temp?third_num:temp;
        System.out.println(temp);
    }
}