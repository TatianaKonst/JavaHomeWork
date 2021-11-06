package com.pb.konstantinova.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal[] animals = {horse, cat, dog};
        Class c = Class.forName("com.pb.konstantinova.hw6.Veterinarian");
        Constructor<Object> constr = c.getConstructor(new Class[] {String.class});
        Object obj = constr.newInstance("Ветеринар");
        if (obj instanceof Veterinarian) {
            for ((Animal animal : animals) {
                System.out.print(Veterinarian.treatAnimal(Animal animal));
            }
        }
    }
}
