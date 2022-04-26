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
public class Either {
    // public boolean isLeft(){...}
    // public boolean isRight(){...}
    // public T either((L->T)->(R->T)->T) func){...}
}
