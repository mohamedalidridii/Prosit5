package main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal();
        lion.setName("Simba");
        try {
            lion.setAge(8);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        lion.setFamily("Cats");
        lion.setMammal(true);

        tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo("Wildlife Park", "Ariana");
        tn.esprit.gestionzoo.entities.Zoo notMyZoo = new tn.esprit.gestionzoo.entities.Zoo("WaterPark", "Siliana");


        tn.esprit.gestionzoo.entities.Animal dog = new tn.esprit.gestionzoo.entities.Animal("Canine", "Snoopy", 2, true);


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
        tn.esprit.gestionzoo.entities.Animal dog2 = new tn.esprit.gestionzoo.entities.Animal("Canine", "lll", 2, true);
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

        tn.esprit.gestionzoo.entities.Dolphin d = new tn.esprit.gestionzoo.entities.Dolphin();
        d.setSwimmingSpeed(24.5f);
        tn.esprit.gestionzoo.entities.Dolphin d1 = new tn.esprit.gestionzoo.entities.Dolphin();
        d1.setSwimmingSpeed(21.8f);
        tn.esprit.gestionzoo.entities.Dolphin d2 = new tn.esprit.gestionzoo.entities.Dolphin();
        d2.setSwimmingSpeed(20.3f);
        tn.esprit.gestionzoo.entities.Dolphin d3 = new tn.esprit.gestionzoo.entities.Dolphin();
        d3.setSwimmingSpeed(22.6f);


        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        tn.esprit.gestionzoo.entities.Penguin p = new tn.esprit.gestionzoo.entities.Penguin();
        p.setSwimmingDepth(24.6f);
        tn.esprit.gestionzoo.entities.Penguin p1 = new tn.esprit.gestionzoo.entities.Penguin();
        p1.setSwimmingDepth(29.6f);
        tn.esprit.gestionzoo.entities.Penguin p2 = new tn.esprit.gestionzoo.entities.Penguin();
        p2.setSwimmingDepth(219.6f);
        tn.esprit.gestionzoo.entities.Penguin p3 = new tn.esprit.gestionzoo.entities.Penguin();
        p1.setSwimmingDepth(2.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        myZoo.addAquaticAnimal(new tn.esprit.gestionzoo.entities.Penguin());

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            tn.esprit.gestionzoo.entities.Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        myZoo.displayNumberOfAquaticsByType();

        System.out.println(myZoo.maxPenguinSwimmingDepth());

    }

}
