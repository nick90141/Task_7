import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class AnimalHelper {

    private EntityManagerFactory emf;

    public AnimalHelper() {
        emf = Persistence.createEntityManagerFactory("Mykyta");
    }

    public void addAnimal(Animal animal) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(animal);
        em.getTransaction().commit();
        em.close();
    }

    public Animal getAnimalById(Long id) {
        EntityManager em = emf.createEntityManager();
        Animal animal = em.find(Animal.class, id);
        em.close();
        return animal;
    }

    public List<Animal> getAllAnimals() {
        EntityManager em = emf.createEntityManager();
        List<Animal> animals = em.createQuery("SELECT a FROM Animal a", Animal.class).getResultList();
        em.close();
        return animals;
    }

    public void updateAnimal(Animal animal) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(animal);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteAnimal(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Animal animal = em.find(Animal.class, id);
        if (animal != null) {
            em.remove(animal);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void close() {
        emf.close();
    }
}
