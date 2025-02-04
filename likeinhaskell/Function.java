package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 3: For more challenge!
//  Implement this interface. An object of this type should represent a
//  function with some arbitrary parameter type T and arbitrary return type R.
//  The interface should have the methods apply(), which applies the
//  represented function to an argument of the correct type;
//  and compose(), which takes another Function as argument, and composes
//  "this" function with that other function. Make sure that the return type
//  of the other function matches the expected argument type of this function.
//  .
//  Hint: To solve this task, you need to use type parameters on both the
//  interface itself, *and* on one of its methods.
public interface Function<T,R> {
    public R apply(T t);

    // TODO task 5: For even more challenge, really tricky!
    //  Give the compose() function a default implementation.
    default <A> Function<A,R> compose(Function<A,T> other) {
        return (a) -> this.apply(other.apply(a));
    }

    public static void main(String[] args) {
        PlusOne plus1 = new PlusOne();
        Integer i = 5;
        System.out.println(i);
        System.out.println(plus1.apply(i));
        System.out.println(plus1.compose(plus1).apply(i));
    }
}

class PlusOne implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer x) {
        return x + 1;
    }
}
