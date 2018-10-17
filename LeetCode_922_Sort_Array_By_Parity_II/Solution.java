//link: https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int even = 0, odd = 1;
        while(even < A.length && odd < A.length){
            if(A[even] % 2 == 0){
                even += 2;
            }else{
                int temp = A[even];
                A[even] = A[odd];
                A[odd] = temp;
                odd +=2;
            }
        }
        return A;
    }
}


    
    