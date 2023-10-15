import java.util.List;

public class Main {
        public static void main(String[] args) {
            AnimalHelper animalHelper = new AnimalHelper();


            Animal newAnimal = new Animal(null, 3, "Fluffy", true);
            animalHelper.addAnimal(newAnimal);


            List<Animal> animals = animalHelper.getAllAnimals();
            for (Animal animal : animals) {
                System.out.println(animal);
            }

            animalHelper.close();

        }
    }
