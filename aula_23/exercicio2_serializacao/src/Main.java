import controller.ProdutoController; // <-- Importa o Controller
import view.ProdutoView;             // <-- Importa a View

public class Main {
    public static void main(String[] args) {
        ProdutoView view = new ProdutoView();
        ProdutoController controller = new ProdutoController(view);

        controller.cadastrar();
        controller.exibir();
    }
}