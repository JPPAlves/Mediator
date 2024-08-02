
import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Vendedor> vendedores = new ArrayList<>();

    public void adicionarVendedor(Vendedor... vendedores) {
        for (Vendedor vendedor : vendedores) {
            this.vendedores.add(vendedor);
            vendedor.setMercado(this);
        }
    }

    public ProdutoVendedor comprar(String id) {
        ProdutoVendedor produto;
        for (Vendedor vendedor : vendedores) {
            produto = vendedor.vender(id);

            if (produto != null) {
                System.out.println("Aqui esta " + produto.getId() + " " + produto.getNome() + " " + produto.getPreco());
                return produto;
            }
        }

        System.out.println("Nao foi encontrado nenhum produto com o ID " + id);
        return null;
    }


    public void mostrarProdutos() {
        for (Vendedor vendedor : vendedores) {
            vendedor.mostrarProdutos();
        }
    }
}
