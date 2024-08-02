// Classe abstrata que define o contrato para os usuários do chat
abstract class Usuario {
        // Referência ao mediador para enviar mensagens
    protected Mediator mediator; 


    // Construtor para inicializar o mediador
    public Usuario(Mediator mediator) {
        this.mediator = mediator;
    }

    // Método abstrato para enviar mensagem
    public abstract void enviarMensagem(String mensagem);

    // Método abstrato para receber mensagem
    public abstract void receberMensagem(String mensagem);
}
