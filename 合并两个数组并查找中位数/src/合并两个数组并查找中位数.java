import java.util.ArrayList;
import java.util.Collections;

public class 合并两个数组并查找中位数 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = 0;
        double zhongweishu = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            a.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            a.add(nums2[i]);
        }

        Collections.sort(a);

        //System.out.println(a);

        if(isodd(a.size())){
            mid = a.size() / 2 ;
            zhongweishu = a.get(mid);
            // System.out.println("zhongweishu shi:   " + zhongweishu);
            return zhongweishu;
        }
        else{
            mid = a.size() / 2;

            zhongweishu = (double)(a.get(mid - 1) + a.get(mid)) / 2;
            //System.out.println("zhongweishu shi:   "+ zhongweishu);
            return zhongweishu;
        }





    }

    public static boolean isodd(int a){
        if(a > 0){
            if((a & 1) != 0){
                //System.out.println("odd");
                return true;
            }
            else{
                //System.out.println("even");
                return false;
            }
        }
        return true;
    }
}
