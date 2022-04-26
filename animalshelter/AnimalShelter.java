package animalshelter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-07.
 */
public class AnimalShelter {
    // TODO task 2b: This is the class you primarily need to update, using
    //  parametric polymorphism, to ensure that shelters can be specialised
    //  to specific animals, with complete static type guarantees.
    //  .
    //  Hint: the subclasses CatShelter and DogShelter should become obsolete.
    private List<Animal> animalsInShelter = new ArrayList<>(20);

    Animal adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(Animal animal){
        animalsInShelter.add(animal);
    }

}
