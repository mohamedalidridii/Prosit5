package main;

import entities.*;
import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        entities.Animal lion = new entities.Animal();
        lion.setName("Simba");
        try {
            lion.setAge(8);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        lion.setFamily("Cats");
        lion.setMammal(true);

        entities.Zoo myZoo = new entities.Zoo("Wildlife Park", "Ariana");
        entities.Zoo notMyZoo = new entities.Zoo("WaterPark", "Siliana");


        entities.Animal dog = new entities.Animal("Canine", "Snoopy", 2, true);


        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }
        try {
            myZoo.addAnimal(dog);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        entities.Animal dog2 = new entities.Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        myZoo.displayAnimals();

        entities.Dolphin d = new entities.Dolphin();
        d.setSwimmingSpeed(24.5f);
        entities.Dolphin d1 = new entities.Dolphin();
        d1.setSwimmingSpeed(21.8f);
        entities.Dolphin d2 = new entities.Dolphin();
        d2.setSwimmingSpeed(20.3f);
        entities.Dolphin d3 = new entities.Dolphin();
        d3.setSwimmingSpeed(22.6f);


        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        entities.Penguin p = new entities.Penguin();
        p.setSwimmingDepth(24.6f);
        entities.Penguin p1 = new entities.Penguin();
        p1.setSwimmingDepth(29.6f);
        entities.Penguin p2 = new entities.Penguin();
        p2.setSwimmingDepth(219.6f);
        entities.Penguin p3 = new entities.Penguin();
        p1.setSwimmingDepth(2.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        myZoo.addAquaticAnimal(new entities.Penguin());

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            entities.Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        myZoo.displayNumberOfAquaticsByType();

        System.out.println(myZoo.maxPenguinSwimmingDepth());

    }

}
