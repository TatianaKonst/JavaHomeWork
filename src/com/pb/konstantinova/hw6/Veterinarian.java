package com.pb.konstantinova.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getName() + "; Еда: " + animal.getFood() + "; Среда обитания: " + animal.getLocation());
    }
}
