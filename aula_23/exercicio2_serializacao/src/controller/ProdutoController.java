package controller; // <-- Declara o pacote

import model.Produto;     // <-- Importa o Model
import view.ProdutoView;   // <-- Importa a View

public class ProdutoController {
    private Produto model;
    private ProdutoView view;

    public ProdutoController(ProdutoView view) {
        this.view = view;
    }

    public void cadastrar() {
        String nome = view.solicitarNome();
        double preco = view.solicitarPreco();
        this.model = new Produto(nome, preco);
    }

    public void exibir() {
        if (model != null) {
            view.exibirProduto(model.getNome(), model.getPreco());
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }
    }
}