// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import animal.animal;
import animal.tiger;

public class Main {
    public static void main(String[] args) {
       animal[] animals = new animal[2];
       animals[0]=new tiger();
       animals[1]=new chicken();

       for (animal animal:animals) {
           System.out.println(animal.makeSound());
       }



    }
}