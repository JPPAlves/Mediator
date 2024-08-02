
    public class Main {
        public static void main(String[] args) {
            
            // Criando um mercado
            Mercado mercado = new Mercado();
            
            // Criando vendedores
            Vendedor vendedor1 = new Vendedor();    
            Vendedor vendedor2 = new Vendedor();
            
            // Adicionando produtos aos vendedores
            vendedor1.adicionarProduto(new ProdutoVendedor("1", "Produto A:", 10.0));
            vendedor1.adicionarProduto(new ProdutoVendedor("2", "Produto B:", 20.0));
            vendedor2.adicionarProduto(new ProdutoVendedor("3", "Produto C:", 30.0));
            vendedor2.adicionarProduto(new ProdutoVendedor("4", "Produto D:", 40.0));
            
            // Adicionando vendedores ao mercado
            mercado.adicionarVendedor(vendedor1, vendedor2);
            
            // Criando um comprador com acesso ao mercado
            Comprador comprador = new Comprador(mercado);
            
            // Visualizando os produtos disponíveis no mercado
            System.out.println("Produtos disponiveis no mercado:");
            comprador.visualizarProdutos();
            System.out.println("=================================");
            
            //Comprando um produto com ID "1"
            System.out.println("\nComprando o produto com ID \"1\":");
            comprador.comprar("1");
            System.out.println("=================================\n");

            //Visualizado oss podutos1
            System.out.println("Produtos disponiveis no mercado:");
            comprador.visualizarProdutos();
            System.out.println("=================================");
           
            // Tentando comprar um produto com ID inexistente
            System.out.println("\nTentando comprar um produto com ID inexistente:");
            comprador.comprar("1");
            
        }
    }
    

