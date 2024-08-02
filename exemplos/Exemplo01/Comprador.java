public class Comprador {
    
        private Mercado mercado;
    
        public Comprador(Mercado mercado) {
            this.mercado = mercado;
        }
    
        public void visualizarProdutos() {
            mercado.mostrarProdutos();
        }
    
        public ProdutoVendedor comprar(String id) {
            return mercado.comprar(id);
        }
    }

