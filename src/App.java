public class App {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.cadastrarUsuario("mauricio", "vendedor");
        sistema.cadastrarUsuario("joão", "prestador");
        sistema.cadastrarUsuario("carla", "tutor");

        sistema.definirEspecialidade(2, "coelho");

        sistema.cadastrarAnimais("hades", "cao");
        sistema.cadastrarAnimais("atena", "rato");

        sistema.definirAnimalParaTutor("princesa", "gato", 3);
        sistema.definirAnimalParaTutor("horus", "cao", 3);
        sistema.definirAnimalParaTutor("preciosa", "gato", 3);

        sistema.listarAnimaisDoSistema();
        sistema.listarUsuarios();
        sistema.listarAnimaisDeTutor(3);
    }
}
