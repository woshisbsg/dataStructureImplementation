import java.util.Arrays;
import java.util.Scanner;

public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String a = "alqe";
        System.out.println(lengthOfLongestSubstring(a));
    }
    public static int lengthOfLongestSubstring(String s) {
        String temp = "";
        int result = 0;
        int[] result1 = new int[s.length()];

        if(s.equals("")){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        for(int i = 0; i < s.length(); i++){
            temp = String.valueOf(s.charAt(i));
            for(int j = i+1; j < s.length(); j++){

                String s1 = String.valueOf(s.charAt(j));
                if(!temp.contains(s1)){
                    temp = temp + s1;

                }
                else{
                    result = temp.length();
                    result1[i] = result;
                    break;
                }
                result = temp.length();
                result1[i] = result;
            }
        }

        Arrays.sort(result1);

        return result1[result1.length -1];

    }


}
