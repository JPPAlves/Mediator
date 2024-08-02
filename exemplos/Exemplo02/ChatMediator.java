import java.util.ArrayList;
import java.util.List;

// Classe de Concrete Mediator que implementa a interface Mediator
class ChatMediator implements Mediator {
    private List<Usuario> usuarios; 

    // Construtor para inicializar a lista de usuários
    public ChatMediator() {
        this.usuarios = new ArrayList<>();
    }

    // Método para adicionar um usuário ao chat
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    // Implementação do método enviarMensagem da interface Mediator
    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {
        // Envia a mensagem para todos os usuários, exceto o remetente
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.receberMensagem(mensagem); 
            }
        }
    }
}     
