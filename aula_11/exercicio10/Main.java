package software_dev.aula_11.exercicio10;

class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        setSenha(senha);;
    }

    public Usuario() {
        this.nome = "";
        this.email = "";
        this.senha = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("Senha inválida. Deve conter pelo menos 6 caracteres.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("Alice");
        usuario.setEmail("alice@example.com");
        usuario.setSenha("12345");
    }
}

