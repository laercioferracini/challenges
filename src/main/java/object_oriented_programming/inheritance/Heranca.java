package object_oriented_programming.inheritance;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>08/12/2019</pre>
 */
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}
public class Heranca {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
