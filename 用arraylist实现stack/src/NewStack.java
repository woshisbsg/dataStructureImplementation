import java.util.ArrayList;

public class NewStack <T> {

    ArrayList<T> list = new ArrayList<T>();

    public NewStack(){
        this.list = new ArrayList<T>();
    }
    public boolean empty(){
        return list.isEmpty();
    }

    public T peek(){
        if(!list.isEmpty()){
            return(list.get(list.size() - 1));
        }
        else{
            System.out.println("empty arraylist");
            return null;
        }
    }

    public T pop(){
        if(!list.isEmpty()){
            //T data = list.get(list.size() - 1);
            //list.remove(list.size() - 1);
            return(list.remove(list.size() - 1));

        }
        else{
            System.out.println("empty arraylist");
            return null;
        }
    }

    public void push(T data){
        list.add(data);
    }

    public int search(T data){
        return list.indexOf(data) + 1;
    }

    @Override
    public String toString() {
        return "NewStack{" +
                "list=" + list +
                '}';
    }

    public int size(){
        return list.size();
    }
}
