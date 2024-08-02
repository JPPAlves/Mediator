// Classe concreta que representa um usuário do chat
class UsuarioChat extends Usuario {
    private String nome; // Nome do usuário

    // Construtor para inicializar o nome e o mediador
    public UsuarioChat(String nome, Mediator mediator) {
        super(mediator);
        this.nome = nome;
    }

    // Implementação do método enviarMensagem da classe abstrata Usuario
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviou mensagem: " + mensagem);
        mediator.enviarMensagem(mensagem, this); // Envio da mensagem através do mediador
    }

    // Implementação do método receberMensagem da classe abstrata Usuario
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu mensagem: " + mensagem);
    }
}
