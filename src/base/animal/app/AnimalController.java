package base.animal.app;

import base.animal.data.Animal;

import java.util.*;

public class AnimalController{
    private int lastId = 0;
    private final Map<Integer, Animal> mapOfAnimals = new HashMap<>();
    public Animal createAnimal(Animal receivedAnimal){
        lastId++;
        Animal animal = new Animal(receivedAnimal);
        animal.setId(lastId);
        mapOfAnimals.put(animal.getId(), animal);
        return animal;
    }

    public Collection<Animal> getAllAnimals() {
        return new ArrayList<>(mapOfAnimals.values());
    }

    //public Collection<Animal> getAllAnimalsSorted(){
        //SortedSet sortedSet = new TreeSet(mapOfAnimals.values());
       // return sortedSet;
    //}
    public Collection<Animal> getAllAnimalsSorted(){
        return new TreeSet(mapOfAnimals.values());
    }

    public List<Animal> getAllAnimalsSorted(Comparator<Animal> comparator){
        List<Animal> list = new ArrayList<Animal>(mapOfAnimals.values());
        list.sort(comparator);
        return list;
    }


    public int getLastId() {
        return lastId;
    }

    public void setLastId(int lastId) {
        this.lastId = lastId;
    }


}

