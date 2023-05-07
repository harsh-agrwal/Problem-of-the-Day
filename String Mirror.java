class Solution {
    public static String stringMirror(String str) {
        // code here
        StringBuilder str1=new StringBuilder();
        str1.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)<str.charAt(i-1)){ 
                str1.append(str.charAt(i));
            }else if(str.charAt(i)==str.charAt(i-1) && i!=1){ 
                str1.append(str.charAt(i));
            }else{
                break;
            }
        }
        StringBuilder rev=new StringBuilder(str1);
        rev.reverse();
        str1.append(rev);
        return str1.toString();
    }
}
