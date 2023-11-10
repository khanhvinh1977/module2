// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Animal.Animal;
import Animal.Tiger;
import Animal.Chicken;
import edible.Edible;
import Fruit.fruit;
import Fruit.apple;
import Fruit.orange;

public class Main {
    public static void main(String[] args) {
    Animal[] animals =new Animal[2];
    animals[0]=new Tiger();
    animals[1]=new Chicken();
    for (Animal animal:animals){
        System.out.println(animal.makeSound());

        if (animal instanceof Chicken) {
            Edible edible = (Chicken) animal;
            System.out.println(edible.howtoEat());
        }
    }
    fruit[] fruits = new fruit[2];
    fruits[0] = new apple();
    fruits[1] = new orange();
        for (fruit fruit: fruits) {
            System.out.println(fruit.howtoEat());
        }




    }
}