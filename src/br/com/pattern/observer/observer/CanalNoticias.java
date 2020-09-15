package br.com.pattern.observer.observer;

import br.com.pattern.observer.interfaces.Canal;

public class CanalNoticias implements Canal {

	private String noticia;

	@Override
	public void update(Object o) {
		this.setNoticia((String) o);
	}

	public String getNoticia() {
		return noticia;
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}

}
