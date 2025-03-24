class stringpool
{
    public static void main(String args[])
    {
        String s1="Hello";
        String s2="Welcome";
        String s3="Hello";

        String s4=new String("Bsc");
        String s5=new String("Bsc");
        String s6=new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s6);
        System.out.println(s4==s5);
    }
}