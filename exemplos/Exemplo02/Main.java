
// Classe principal que contém o método main para testar o funcionamento do chat
public class Main {
    public static void main(String[] args) {
        // Criação do mediador
        ChatMediator chat = new ChatMediator();

        // Criação dos usuários
        UsuarioChat usuario1 = new UsuarioChat("Alice", chat);
        UsuarioChat usuario2 = new UsuarioChat("Bob", chat);
        UsuarioChat usuario3 = new UsuarioChat("Carlos", chat);     

        // Adiciona os usuários ao chat
        chat.adicionarUsuario(usuario1);
        chat.adicionarUsuario(usuario2);
        chat.adicionarUsuario(usuario3);

        // Envio de mensagens pelos usuários
        usuario1.enviarMensagem("Ola a todos!");
        usuario2.enviarMensagem("Oi, Alice!");
        usuario3.enviarMensagem("E ai, pessoal!");
    }
}
