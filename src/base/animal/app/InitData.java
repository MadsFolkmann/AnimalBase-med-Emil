package base.animal.app;

import base.animal.data.Animal;

public class InitData {
    private AnimalController controller;

    public InitData(AnimalController controller) {
        this.controller = controller;
    }

    public void InitData(){
        Animal animal1 = new Animal("Horsey the horsing horse", 99);
        Animal animal2 = new Animal("Mads the rotting rotte", 1);
        Animal animal3 = new Animal("Ching the chonging nudler", 1337);

        controller.createAnimal(animal1);
        controller.createAnimal(animal2);
        controller.createAnimal(animal3);

    }
}
