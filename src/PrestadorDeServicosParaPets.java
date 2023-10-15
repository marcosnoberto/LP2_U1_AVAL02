public class PrestadorDeServicosParaPets extends Usuario {
    private String especialidade;

    PrestadorDeServicosParaPets(String nome, int id) {
        super(nome, id);
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    @Override
    public String toString() {
        return "Tipo de Usuario: Prestador de Servicos para Pets";
    }
}
