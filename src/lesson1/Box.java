package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<E extends Fruit> {
    private ArrayList<E> fruits;

    public Box(E... fruits) {
        this.fruits = new ArrayList<E>(Arrays.asList(fruits));
    }

    public void addFruit(E... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void removeFruit(E... fruits) {
        for (E fruit : fruits) {
            this.fruits.remove(fruit);

        }
    }

    public ArrayList<E> getFruits() {
        return new ArrayList<E>(fruits);
    }

    public void clearFruits() {
        fruits.clear();
    }

    public float getWeight() {
        if (fruits.size() == 0) {
            return 0;
        }
        float weight = 0;
        for (E fruit : fruits) weight += fruit.getWeight();
        return weight;

    }

    public void compare(Box box) {
        System.out.println("Вес первой коробки: " + box.getWeight());
        System.out.println("Вес второй коробки: " + this.getWeight());

        if (this.getWeight() == box.getWeight()) {
            System.out.println("Коробки весят одинаково");
        } else {
            System.out.println("Коробки не равны по весу");
        }

    }


    public void pourOwer(Box<? super E> box) {
        box.fruits.addAll(this.fruits);
        clearFruits();
        System.out.println("Фрукты пересыпаны");

    }
}
