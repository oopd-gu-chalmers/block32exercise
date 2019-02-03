package animalshelter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-07.
 */
public class AnimalShelter {

    private List<Animal> animalsInShelter = new ArrayList<>(20);

    Animal adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(Animal animal){
        animalsInShelter.add(animal);
    }

}
