class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        return str1.toString();
    }
}
