package software_dev.aula_6.exercicio3;

public class exercicio3 {
    String estado;
    String cidade;

    void exibirInformacoes(){
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
    }

    public void main(String[] args) {
        exercicio3 pessoa = new exercicio3();
        pessoa.estado = "Paraná";
        pessoa.cidade = "Londrina";

        pessoa.exibirInformacoes();
    }

}