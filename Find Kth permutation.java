class Solution
{
public:
    string kthPermutation(int n, int k)
    {
        // code here
        string s="";
        for(int i=1; i<=n; i++)
            s+= to_string(i);
        
        for(int i=1; i<k; i++)
            next_permutation(s.begin(), s.end());
        return s;

    }
};
