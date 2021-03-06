package chat.foda.pra.caralho.clienteServidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import chat.foda.pra.caralho.jdbc.QueryUtil;
import chat.foda.pra.caralho.rmi.ServidorRemotoImpl;

/**
 * @author Luiz Felipe Nazari
 */
public class ServidorRmi {
	
	/*
	 * Para rodar o server RMI precisa dar o comando "rmiregistry" na classe de
	 * implementação: rmiregistry 5000 chat.foda.pra.caralho.ClienteRemotoImpl
	 * Para gerar um novo STUB: rmic chat.foda.pra.caralho.ClienteRemotoImpl
	 */
	
	private ServidorRemotoImpl service;
	
	public ServidorRmi(String ip, Integer porta) {
		QueryUtil.criaBaseSeNaoExiste();
		
		try {
			LocateRegistry.createRegistry(porta);
			
			service = new ServidorRemotoImpl();
			Naming.rebind("rmi://" + ip + ":" + porta + "/remoto", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ServidorRemotoImpl getService() {
		return service;
	}
}