
// Interface Mediator define o contrato para o mediador
interface Mediator {
    // Método para enviar uma mensagem para todos os usuários, exceto o remetente
    void enviarMensagem(String mensagem, Usuario usuario);
}
