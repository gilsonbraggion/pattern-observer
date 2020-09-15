package br.com.pattern.observer.observable;

import java.util.ArrayList;
import java.util.List;

import br.com.pattern.observer.interfaces.Canal;

public class AgenciaNoticias {
	
	private String noticia;
	private List<Canal> canais = new ArrayList<>();

	public void adicionarObservador(Canal canal) {
		this.canais.add(canal);
	}
	
	public void removerObservador(Canal canal) {
		this.canais.remove(canal);
	}
	
	public void setNoticia(String noticia) {
		this.noticia = noticia;
		for (Canal canal : canais) {
			canal.update(this.noticia);
		}
	}
	
}
