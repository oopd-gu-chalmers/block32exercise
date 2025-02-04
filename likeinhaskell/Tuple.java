package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 1: Implement this class. It should act like a tuple in e.g.
//  Haskell or Python. An object of this type should hold two values of
//  (possibly) different (arbitrary) types, and have the methods fst()
//  and snd() to return the respective components.
//  NOTE: The class should be read-only after initial construction.
public class Tuple<A,B> {
    private final A a;
    private final B b;

    public Tuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A fst() {
        return a;
    }
    
    public B snd() {
        return b;
    }

    public static void main(String[] args) {
        Tuple<Integer,String> tuple = new Tuple(45, "yes");
        System.out.println(tuple.fst() / 5);
        System.out.println(tuple.snd() + " ok");
    }
}
