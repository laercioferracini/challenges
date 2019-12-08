package object_oriented_programming.inheritance;

class  Arithmetic{
    int add(int a, int b){
        return a + b;
    }
}
class Adder extends Arithmetic{

}

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>08/12/2019</pre>
 */
public class Heranca2 {

    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
