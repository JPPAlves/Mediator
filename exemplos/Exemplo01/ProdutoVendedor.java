public class ProdutoVendedor {

        private String id;
        private String nome;
        private double preco;
    
        public ProdutoVendedor(String id, String nome, double preco) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
        }
    
        public String getId() {
            return id;
        }
    
        public String getNome() {
            return nome;
        }
    
        public double getPreco() {
            return preco;
        }
    }

