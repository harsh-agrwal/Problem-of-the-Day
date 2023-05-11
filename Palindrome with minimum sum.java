class Solution {
    public static int minimumSum(String s) {
        // code here
        int n=s.length();
        int left=0;int right=n-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)&&s.charAt(left)!='?'&&s.charAt(right)!='?')
                return -1;
                left++;
                right--;
        }
        left=0;right=n-1;
        StringBuffer str=new StringBuffer();
        while(left<=right){
            if(s.charAt(left)!='?')str.append(s.charAt(left));
            else if(s.charAt(right)!='?')str.append(s.charAt(right));
            left++;
            right--;
        }
        int res=0;
        for(int i=1;i<str.length();i++){
            res+=Math.abs(str.charAt(i)-str.charAt(i-1));
        }
        return res*2;
    }
}
