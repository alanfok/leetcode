package leetcode567;

import java.text.Collator;
import java.util.*;

public class Problem567 {
    public boolean checkInclusion(String s1, String s2) {
        String s1Sort = sort(s1);
        for( int i = 0 ; i < s1.length() ; i++){
            if(i+s1.length() <= s2.length()){
                if(s1Sort.equals(sort(s2.substring(i,i+s1.length())))){
                    return true;
                };
            }
        }

        return false;
    }

    public String sort(String s){
        char [] temp = s.toCharArray();
        Arrays.sort(temp);
        return  new String(temp);
    }


    public int[] sortedSquares(int[] nums) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i] * nums[i];
            results.add(tmp);
        }

        int resultsArr[] = new int[nums.length];

        Collections.sort(results);

        int index = 0;

        for (Integer num : results) {
            resultsArr[index] = num;
            index++;
        }
        return resultsArr;
    }
}
