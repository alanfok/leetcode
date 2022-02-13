package leetcode14;

public class Problem14 {
    public String LongestCommonPrefix(String[] strs) {
        String match = "";
        int len = strs[0].length();
        boolean isEnd = false;

        for(int i = 0 ; i < len; i++) {
            String temp = strs[0].substring(i,i+1);
            if(isEnd){
                break;
            }
            for(int j = 1 ; j < strs.length ; j++) {
                if(strs[j].length() < i){
                    isEnd = true;
                    break;
                }
                if(!temp.equals(strs[j].substring(i,i+1))){
                    isEnd = true;
                    break;
                }
            }
            if(!isEnd){
                match = match + temp;
            }
        }
        return  match;
    }
}
