package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratorMapOfList {
    public static void main(String[] args) {

        // create hashmap of category and list of animals under the category
        Map<String, List<String>> listOfAnimals = new HashMap<>();

        // creating list of animals in mammals category
        List<String> listOfMammals = Arrays.asList("Dog", "Cat", "Monkey", "Cow");
        // adding list of mammals into mammals category
        listOfAnimals.put("Mammals", listOfMammals);

        // creating list of animals in birds category
        List<String> listOfBirds = Arrays.asList("Crow", "Parrot", "Peacock", "Flamingo");
        // adding list of birds into birds category
        listOfAnimals.put("Birds", listOfBirds);

        // creating list of animals in reptiles category
        List<String> listOfReptiles = Arrays.asList("Lizard", "Turtle", "Crocodile", "Python");
        // adding list of reptiles into reptiles category
        listOfAnimals.put("Reptiles", listOfReptiles);

        // Iterating map using forEach() in java 8
        listOfAnimals.forEach((key, value) -> System.out
                .println("Categoty name: " + key + "\t\t" + "List of animals under the category: " + value));
    }
}
