class Solution{
    static int setSetBit(int x, int y, int l, int r){
        for(int i=l-1; i<r; i++) {
            if((y&(1<<i)) == (1<<i)) {
                x|=(1<<i);
            }
        }
    return x;
    }
}
