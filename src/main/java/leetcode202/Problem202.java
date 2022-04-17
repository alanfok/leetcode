package leetcode202;

import java.util.HashSet;
import java.util.Set;

public class Problem202 {

    /*
     *  if n = 19 . then 1^2 + 9^2 =82, then 8^2 + 2^2 = 68, then 6^2 + 8^2 = 1^2 + 0^2 + 0^2 =1,
     *  so it is happy number
     *
     * if n =2, then 2^2 = 4, then 4^2 = 16, then 1^2 + 6^2 =37, 3^2 + 7^2 =58, 5^2 + 8^2 = 89 , then
     * 8^2 + 9^2 = 145,then 1^2 +4^2 + 5^2 =42 , then 4^2 + 2^2 = 20 , then 2^2 +0^2 =4, which we see before
     * */
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        int sum = n;

        while (sum != 1) {
            sum = getSum(sum);
            if (!visited.add(sum)) {
                break;
            }
        }
        return sum == 1;
    }

    public int getSum(int n){
        int sum = 0;
        int num = n;

        while(num != 0) {
            int digit = num % 10;
            num = num / 10;
            sum += digit * digit;
        }
        return sum;
    }

}
