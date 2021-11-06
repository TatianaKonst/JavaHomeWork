package com.pb.konstantinova.hw6;

import java.util.Objects;

public class Cat extends Animal {
        public Cat() {
        super("Гарфилд", "Мышь", "Улица");
    }
    @Override
    public void eat() {
        System.out.printf("\nКот ест %s.", getFood());
    }
    @Override
    public void makeNoise() {
        System.out.printf("\n%s орет", getName())
    }
    @Override
    public String toString() {
        return "Cat{" + "name=" + getName() + '\'' + ", food=" + getFood() + '\'' + ", location=" + getLocation() + '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFood(), getLocation());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return
                Objects.equals(getName(), cat.getName()) && Objects.equals(getFood(), cat.getFood()) && Objects.equals(getLocation(), cat.getLocation());
    }
}
}
