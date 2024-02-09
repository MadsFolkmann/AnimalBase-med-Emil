package base.animal.app;

import base.animal.data.Animal;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

public class Application {
    private AnimalController controller;
    public void start() {
        controller = new AnimalController();
        InitData initData = new InitData(controller);
        initData.InitData();



        //SortedSet<Animal> animalList = (SortedSet<Animal>) controller.getAllAnimalsSorted();
       // Collection<Animal> animalList = controller.getAllAnimalsSorted(new AnimalNameComparator());
        //Collection<Animal> animalList = controller.getAllAnimalsSorted(new AnimalAgeComparator());
        //Collection<Animal> animalList = controller.getAllAnimalsSorted(a ,b ->a.getName().compareTo(b.getName());
        Collection<Animal> animalList = controller.getAllAnimalsSorted(Comparator.comparing(Animal::getName));

        for(Animal Animal : animalList) {
            System.out.println(Animal);
        }
    }
    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }


}