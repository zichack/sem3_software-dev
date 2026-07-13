package model;

import java.io.Serializable; // Importa a interface que permite salvar o objeto em um arquivo físico

public class Produto implements Serializable { // Declara a classe Produto indicando que ela pode ser serializada (salva
                                               // em disco)
    private static final long serialVersionUID = 1L; // Identificador único da versão da classe para garantir segurança
                                                     // na serialização
    private String nome; // Atributo privado para armazenar o nome do produto
    private double preco; // Atributo privado para armazenar o preço do produto

    public Produto(String nome, double preco) { // Construtor da classe que é chamado sempre que usamos 'new Produto()'
        this.nome = nome; // Atribui o nome recebido pelo construtor ao atributo da classe
        this.preco = preco; // Atribui o preço recebido pelo construtor ao atributo da classe
    } // Fim do construtor

    public String getNome() { // Método público para permitir que outras classes acessem o nome do produto
        return nome; // Retorna o valor atual do atributo nome
    } // Fim do método getNome

    public double getPreco() { // Método público para permitir que outras classes acessem o preço do produto
        return preco; // Retorna o valor atual do atributo preco
    } // Fim do método getPreco

    @Override // Anotação que indica que estamos substituindo o método toString original do
              // Java
    public String toString() { // Método que define como o objeto será transformado em texto quando quisermos
                               // imprimi-lo
        return "Produto: " + nome + " | Preço: R$ " + preco; // Monta e retorna uma string formatada com os dados
    } // Fim do método toString
} // Fim da classe Produto