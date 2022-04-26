package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class ShelterError {

    public static void main(String[] args){
        CatShelter catShelter = new CatShelter();
        Dog badBoyRex = new Dog();

        // TODO task 2a: It should not be possible to inser a dog into a cat
        //  shelter. The line below should give a STATIC type error (i.e. in
        //  IntelliJ a red squiggly line under the argument badBoyRex). You
        //  should *not* edit this line though - the edits should be done to
        //  the underlying classes used, such that the static error occurs.
        catShelter.putAnimal(badBoyRex);
        System.out.println("Who let the dogs out?!?");
    }
}
