class aluno{
    String nome; //atributo ou característica do objeto
    int idade; //atributo ou característica do objeto
    String curso; //atributo ou característica do objeto
    String cpf; //atributo ou característica do objeto

    void apresentar(){ //método ou comportamento do objeto
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Meu curso é: " + curso);
        System.out.println("Meu CPF é: " + cpf);

    }

    void estudar(){ //método ou comportamento do objeto
        System.out.println("O aluno está estudando!");
    }
    public static void main(String[] args) { //método principal, ponto de entrada do programa
        aluno aluno1 = new aluno(); //criando um objeto do tipo aluno, utilizando a classe aluno como molde para criar o objeto
        aluno1.nome = "Mateus";
        aluno1.idade = 27;
        aluno1.curso = "Análise e Desenvolvimento de Sistemas";
        aluno1.cpf = "123.456.789-00";

        aluno1.apresentar(); //chamando o método apresentar para exibir as informações do aluno
        aluno1.estudar(); //chamando o método estudar para exibir a mensagem de que o aluno está estudando

        }
    }
  