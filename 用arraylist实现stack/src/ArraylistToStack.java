public class ArraylistToStack {
    public static void main(String[] args) {
        NewStack a = new NewStack();
        a.push(1);
        a.push("b");
        a.push("c");
        a.push(4);
        System.out.println(a.toString());
        System.out.println(a.peek());
        a.pop();
        System.out.println(a.toString());

    }

}
