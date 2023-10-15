public class Vendedor extends Usuario{
    
    Vendedor(String nome, int id){
        super(nome, id);
    }

    @Override
    public String toString() {
        return "Tipo de usuario: Vendedor da ILovePets";
    }
}