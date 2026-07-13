package controller;

import model.Produto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private List<Produto> produtos;
    private final String ARQUIVO = "produtos.dat";

    public ProdutoController(){
        this.produtos = new ArrayList<>();
        carregarDados();
    }

    public void cadastrarProduto(String nome, double preco){
        Produto novoProduto = new Produto(nome, preco);
        produtos.add(novoProduto);
        salvarDados();
    }

    public List<Produto> listarProdutos(){
        return produtos;
    }

    private void salvarDados(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))){
            oos.writeObject(produtos);
        }catch (IOException e){
            System.out.println("Erro ao salvar os produtos: " + e.getMessage());
        }

    @SupressedWarnings("unchecked")
    private void carregarDados(){
        File arquivo = new File(ARQUIVO);
        if (arquivo.exists()){
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO))){
                produtos = (List<Produto>) ois.readObject();
            }catch (IOException | ClassNotFoundException e){
                System.out.println("Erro ao carregar os produtos: " + e.getMessage());
            }
        }
    }
    }
    
}
