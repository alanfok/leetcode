package leetcode9;

import java.util.ArrayList;
import java.util.List;

public class Problem9 {
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        boolean ret = false;
        List<Integer> numberList = new ArrayList<Integer>();
        int initNum  = x;

        while (initNum > 0){
            int y = initNum % 10;
            numberList.add(y);
            initNum = (initNum - y) / 10;
        }

        int arrayFinalIndex = numberList.size() -1;
        int arrayStartIndex = 0;

        boolean isOdd = numberList.size() % 2 != 0;

        boolean isFinish = false;

        while (!isFinish) {
            ret = true;
            if (isOdd) {
                while (arrayStartIndex != arrayFinalIndex) {
                    if (numberList.get(arrayStartIndex) != numberList.get(arrayFinalIndex)) {
                        ret = false;
                        break;
                    }
                    arrayStartIndex++;
                    arrayFinalIndex--;
                }
                isFinish = true;
            } else {
                while (arrayStartIndex  < arrayFinalIndex) {
                    if (numberList.get(arrayStartIndex) != numberList.get(arrayFinalIndex)) {
                        ret = false;
                        break;
                    }
                    arrayStartIndex++;
                    arrayFinalIndex--;
                }
                isFinish = true;
            }
        }
        return ret;
    }
}
