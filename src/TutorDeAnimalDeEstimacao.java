import java.util.ArrayList;

public class TutorDeAnimalDeEstimacao extends Usuario{

    private ArrayList<Animal> animais;

    TutorDeAnimalDeEstimacao(String nome, int id){
        super(nome, id);
        animais = new ArrayList<Animal>();
    }

    void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    @Override
    public String toString() {
        return "Tipo de Usuario: Tutor de Animais de Estimação";
    }
}
