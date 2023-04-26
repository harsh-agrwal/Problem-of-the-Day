class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here
    for(int i = 0; i < m; i++) {
        if(seats[i] == 1) {  
            if(i - 1 >= 0) {  
                seats[i - 1] = 2;
            }
            if(i + 1 < m) {  
                if(seats[i + 1] == 0) {
                    seats[i + 1] = 2;
                }
            }
        }
    }
    int cnt = 0;
    for(int i = 0; i < m; i++) {
        if(seats[i] == 0) { 
            cnt++; 
            if(i - 1 >= 0) { 
                seats[i - 1] = 2;
            }
            if(i + 1 < m) {  
                seats[i + 1] = 2;
            }
        }
    }
    return cnt >= n;
    }
}
