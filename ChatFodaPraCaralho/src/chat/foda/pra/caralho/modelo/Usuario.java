package chat.foda.pra.caralho.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa implements Serializable {
	private static final long serialVersionUID = -5591108295576221784L;
	
	private Integer codigo;
	private String senha;
	private String nickName;
	private List<Usuario> amigos;

	public Usuario(){		
	}
	
	public Usuario(Integer codigo){
		this.codigo = codigo;
	}
	
	public Usuario(String nomeCompleto, String senha) {
		this.setNomeCompleto(nomeCompleto);
		this.setSenha(senha);
	}
	
	public void adicionaAmigo(Usuario usuario) {
		if (this.amigos == null) {
			amigos = new ArrayList<Usuario>();
		}
		
		amigos.add(usuario);
	}
	
	public boolean removeAmigo(Usuario usuario) {
		if (this.amigos == null) {
			return false;
		}
		
		amigos.remove(usuario);
		return true;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNickName() {
		if (this.nickName == null) {
			return super.getPrimeiroNome();
		}
		
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public List<Usuario> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Usuario> amigos) {
		this.amigos = amigos;
	}
}
