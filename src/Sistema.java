import java.util.ArrayList;

public class Sistema {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Animal> animais;

    Sistema() {
        this.usuarios = new ArrayList<Usuario>();
        this.animais = new ArrayList<Animal>();
    }

    public void cadastrarUsuario(String nome, String tipo) {
        Usuario user = null;

        if (tipo.equals("tutor")) {
            user = new TutorDeAnimalDeEstimacao(nome, usuarios.size()+1);
        } else if (tipo.equals("prestador")) {
            user = new PrestadorDeServicosParaPets(nome, usuarios.size()+1);
        } else if (tipo.equals("vendedor")) {
            user = new Vendedor(nome, usuarios.size()+1);
        }

        usuarios.add(user);
    }

    public Animal cadastrarAnimais(String nome, String especie) {
        Animal animal = null;

        if ("cao".equals(especie)) {
            animal = new Cao(nome);
        } else if ("coelho".equals(especie)) {
            animal = new Coelho(nome);
        } else if ("gato".equals(especie)) {
            animal = new Gato(nome);
        } else if ("rato".equals(especie)) {
            animal = new Rato(nome);
        }

        if (animal != null) {
            animais.add(animal);
        }

        return animal;
    }

    public void definirAnimalParaTutor(String nomeAnimal, String especie, int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario && usuario instanceof TutorDeAnimalDeEstimacao) {
                    Animal animal = cadastrarAnimais(nomeAnimal, especie);
                    if (animal != null) {
                        ((TutorDeAnimalDeEstimacao) usuario).adicionarAnimal(animal);
                    }
            }
        }
    }

    public void definirEspecialidade(int idUsuario, String especialidade) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario && usuario instanceof PrestadorDeServicosParaPets) {
                ((PrestadorDeServicosParaPets) usuario).setEspecialidade(especialidade);
            }
        }
    }

    public void listarUsuarios() {
        System.out.println("--------------------------");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
            System.out.println(usuario.toString());
            if (usuario instanceof PrestadorDeServicosParaPets) {
                System.out.println("Especialidade: " + ((PrestadorDeServicosParaPets) usuario).getEspecialidade());
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    public void listarAnimaisDaLista(ArrayList<Animal> animais) {
        System.out.println("--------------------------");
        for (Animal animal : animais) {
            System.out.println(animal.getNome());
            System.out.println(animal.toString());
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    public void listarAnimaisDoSistema() {
        listarAnimaisDaLista(this.animais);
    }

    public void listarAnimaisDeTutor(int idUsuario) {
        System.out.println("--------------------------");
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario && usuario instanceof TutorDeAnimalDeEstimacao) {
                System.out.println(usuario.getNome() + ", animais:");
                ArrayList<Animal> animais = ((TutorDeAnimalDeEstimacao) usuario).getAnimais();
                listarAnimaisDaLista(animais);
            }
        }
        System.out.println("--------------------------");
    }

}
