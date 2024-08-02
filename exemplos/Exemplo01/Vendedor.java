import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private List<ProdutoVendedor> produtos = new ArrayList<>();
    
    private Mercado mercado;

    public void mostrarProdutos() {
        for (ProdutoVendedor produto : produtos) {
            System.out.println(produto.getId() + " " + produto.getNome() + " " + produto.getPreco());
        }
    }

    public void adicionarProduto(ProdutoVendedor... produtos) {
        for (ProdutoVendedor produto : produtos) {
            this.produtos.add(produto);
        }
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }

    public ProdutoVendedor vender(String id) {
        for (int i = 0; i < produtos.size(); i++) {
            ProdutoVendedor produto = produtos.get(i);
            if (produto.getId().equals(id)) {
                return produtos.remove(i);
            }
        }
        return null;
    }
}
