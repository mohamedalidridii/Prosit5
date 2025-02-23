package main;


import entities.Animal;
import entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new entities.Animal();
        lion.setName("Symbol");
        lion.setAge(5);
        lion.setFamily("Lion");
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo("RRRRR", "Sousse");
        Zoo notMyZoo = new Zoo("Gym Park", "New York");


        Animal dog = new Animal("Rajhi", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));

        Animal dog2 = new Animal("Canine", "lll", 2, true);

        System.out.println(myZoo.searchAnimal(dog2));

        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog2);
        myZoo.addAnimal(dog);

        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        Aquatic aqua = new Aquatic("Fish", 2, false, "sea");
        Terrestrial terr = new Terrestrial("Insects","Ant",1,false,6);
        Dolphin dolphin = new Dolphin("DOF",3,true,"Iceland",15);
        Penguin penguin = new Penguin("Pen",5,false,"Iceland",10);

        System.out.println(aqua);
        System.out.println(terr);
        System.out.println(dolphin);
        System.out.println(penguin);

        aqua.swim();
        dolphin.swim();
        penguin.swim();
    }
}
