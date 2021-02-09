package lesson1;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

                                                                    // Задание 1

        Integer[] data = new Integer[3];

        data[0] = 1;
        data[1] = 2;

        System.out.println(Arrays.deepToString(data));

        exchange(data, 1, 2);
        System.out.println(Arrays.deepToString(data) + "\n");

                                                                    // Задание 2
        ArrayList<Integer> arrList = toArrayList(data);


                                                                    // Задание 3

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Box<Orange> box1 = new Box<Orange>(orange1, orange2);
        Box<Apple> box2 = new Box<Apple>(apple1, apple2, apple3);

        box1.compare(box2);                                         //Сравнение веса коробок


        Box<Apple> box3 = new Box<Apple>();
        box2.pourOwer(box3);                                        //Пересыпание фруктов


/*
        Box<Apple> box4 = new Box<Apple>();                         //Тут с пересыпанием фруктов выйдет ошибка: incompatible types
        box1.pourOwer(box4);
*/


    }

    public static <T> void exchange(T[] data, int i, int j) {       //Метод меняющий местами два элемента массива
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static <N> ArrayList<N> toArrayList(N[] data) {          //Метод преобразующий массив в ArrayList
        return new ArrayList<N>(Arrays.asList(data));
    }


}
