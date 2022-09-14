import java.util.Arrays;
//example of a generic class stack

public class StackGeneric <T>{  //<T> is a template object
    private int count;
    private T[] data;
 
    public StackGeneric() {
        data = (T[]) new Object[8];
        count = 0;
    }
 
    void expandCapacity() {
     data = Arrays.copyOf(data, data.length * 2);    }
 
    void push(T e)     {  //e will be a template object
        if (count == data.length)
            expandCapacity();
        data[count++] = e;
    }
 
    T pop() throws Exception {
        if (count <= 0)  {
            throw new Exception("stack empty");
        }
        count--;
        return data[count];
    }
 
    boolean isEmpty() { return count == 0; }
 
    int size() {  return count;  }
 
    public static void main(String[] args) throws Exception {
        // s for String
    	StackGeneric<String> s = new StackGeneric<String>();
        
        s.push("Alice");
        // d for Double
        StackGeneric<Double> d = new StackGeneric<Double>();
        d.push(2000.0);

        while (!s.isEmpty())
            System.out.println(s.pop() + " " + d.pop());
    }
}
