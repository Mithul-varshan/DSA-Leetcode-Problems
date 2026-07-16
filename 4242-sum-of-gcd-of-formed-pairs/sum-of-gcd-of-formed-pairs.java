
// TLE because of gcd method
// class Solution {
//     public int gcd(int n1, int n2){
//         int gcd = 1;
//         int min = Math.min(n1,n2);
//         for(int i=1;i<=min;i++){
//             if(n1%i == 0 && n2%i == 0){
//                 if(i > gcd) gcd = i;
//             }
//         }
//         return gcd;
//     }
//     public long gcdSum(int[] nums) {
//         int max =0;
//         for(int i=0;i<nums.length;i++){
//             max = Math.max(max, nums[i]);
//             nums[i] = gcd(nums[i],max);
//         }
//         Arrays.sort(nums);
//         int i=0;
//         int j=nums.length-1;
//         int sum=0;
//         while( i<j ){
//             sum+=gcd(nums[i],nums[j]);
//             i++;
//             j--;
//         }
//         return sum;
//     }
// }

//GCD with Euclid's algo
class Solution {
    public int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max =0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            nums[i] = gcd(nums[i],max);
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        long sum=0;
        while( i<j ){
            sum+=gcd(nums[i],nums[j]);
            i++;
            j--;
        }
        return sum;
    }
}