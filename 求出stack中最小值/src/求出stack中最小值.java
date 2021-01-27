import java.util.Stack;

public class 求出stack中最小值 {
    public static void main(String[] args) {
        getMin a = new getMin();
        int[] array = new int[]{3,8,12,10,2,3};
        for(int i = 0; i < array.length; i++){
            a.push(array[i]);
        }

        System.out.println(a.min());

        a.pop();
        a.pop();
        System.out.println(a.peek());

        System.out.println(a.s);
        System.out.println(a.toString());

        Stack b = new Stack();





    }


}


