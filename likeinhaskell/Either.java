package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 4: For even more of a challenge!
//  Implement this class, to behave like the Either type in Haskell, defined
//  like this:
//      data Either a b = Left a | Right b
//  An object of this type should be *either* a Left, *or* a Right, with the
//  appropriate associated type for its value.
//  There should be three functions in this type:
//  isLeft() :: Either a b -> Bool
//    should return true if the object represents a Left value,
//    otherwise it should return false.
//  isRight() :: Either a b -> Bool
//    should work directly like the complement of isLeft().
//  either() :: Either a b -> (a -> t) -> (b -> t) -> t
//    should take two functions as arguments (see the Function type), one to
//    apply if the value is a Left, the other to apply if the value is a Right,
//    and return the result of applying the correct function.
//  .
//  Hint: Where Haskell creates a data type by listing constructors, an
//     OO language like Java would use subclassing.
//  Hint: The most elegant solution uses inner classes (look them up).
public class Either<A,B> {
    private final A a;
    private final B b;

    public static <A,B> Either<A,B> Left(A a) {
        return new Either(a, null);
    }

    public static <A,B> Either<A,B> Right(B b) {
        return new Either(null, b);
    }

    private Either(A a, B b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean isLeft() {
        return b == null;
    }
    
    public boolean isRight() {
        return a == null;
    }
    
    public <T> T either(Function<A,T> left, Function<B,T> right) {
        if (this.isLeft()) {
            return left.apply(this.a);
        } else {
            return right.apply(this.b);
        }
    }

    public static void main(String[] args) {
        Either<String,Integer> e1 = Either.Left("Hello");
        Either<String,Integer> e2 = Either.Right(123);

        System.out.println(e1.isLeft());
        System.out.println(e1.isRight());
        System.out.println(e2.isLeft());
        System.out.println(e2.isRight());

        class PrintString implements Function<String,Void> {
            @Override
            public Void apply(String s) {
                System.out.println("#" + s + "#");
                return null;
            }
        }

        class PrintInteger implements Function<Integer,Void> {
            @Override
            public Void apply(Integer i) {
                System.out.println("$" + i.toString() + "$");
                return null;
            }
        }

        e1.either(new PrintString(), new PrintInteger());
        e2.either(new PrintString(), new PrintInteger());
    }
}
