package leetcode66;

public class Problem66 {
    public int[] plusOne(int[] digits) {
        int [] tmpDigits = digits;
        boolean carryOver = false;
        if(tmpDigits[tmpDigits.length-1] == 9){
            tmpDigits[tmpDigits.length-1] = 0;
            carryOver = true;
        } else {
            tmpDigits[tmpDigits.length-1] = tmpDigits[tmpDigits.length-1]+1;
        }

        for(int i = tmpDigits.length-1; i> -1; i--){
            if(!carryOver){
                break;
            }

            if(i == tmpDigits.length-1){
                continue;
            }

            //
            if (tmpDigits[i] == 9){
                tmpDigits[i] = 0;
            } else {
                tmpDigits[i] = tmpDigits[i] +1;
                carryOver = false;
            }

        }

        if(carryOver){
            int [] tmpDigits2 = new int[tmpDigits.length+1];
            tmpDigits2 [0] = 1;
            for(int i = 0; i<tmpDigits.length ; i++){
                tmpDigits2[i+1] = tmpDigits[i];
            }
            return tmpDigits2;
        }
        return tmpDigits;
    }
}
