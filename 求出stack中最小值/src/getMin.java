import java.util.Stack;

public class getMin {

    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> sMin = new Stack<Integer>();

    public getMin(){
        this.s = new Stack<Integer>();
        this.sMin = new Stack<Integer>();
    }

    @Override
    public String toString() {
        return "getMin{" +
                "s=" + s +
                ", sMin=" + sMin +
                '}';
    }

    public void push(int element){
        s.push(element);
        if(sMin.empty() || element < sMin.peek()){
            sMin.push(element);
        }
    }

    public void pop(){
        if(s.peek() == sMin.peek()){
            sMin.pop();
        }
        s.pop();

    }

    public int min(){
        return sMin.peek();
    }

    public boolean empty(){
        if(s.empty()){
            return true;
        }
        else return false;
    }

    public int peek(){
        s.peek();
        return s.peek();
    }


}
