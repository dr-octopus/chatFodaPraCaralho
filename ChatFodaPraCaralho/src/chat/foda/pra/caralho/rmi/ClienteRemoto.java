package chat.foda.pra.caralho.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import chat.foda.pra.caralho.modelo.Chat;

/**
 * Declara��o de todos os m�todos executados no Cliente vis�veis para o Servidor
 * 
 * @author luiznazari
 */
public interface ClienteRemoto extends Remote {

	public void enviarMensagem(Integer chatCodigo, String mensagem) throws RemoteException;
	
	public void enviarParaTodos(String mensagem) throws RemoteException;
	
	public void abrirChat(Chat chat, String nomeAmigo) throws RemoteException;
	
	public void desativarChat(Integer chatCodigo) throws RemoteException;
	
	public void desativarTodosChats() throws RemoteException;
	
}
