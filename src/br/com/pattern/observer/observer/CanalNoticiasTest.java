package br.com.pattern.observer.observer;

import br.com.pattern.observer.observable.AgenciaNoticias;

public class CanalNoticiasTest {
	
	public static void main(String[] args) {
		AgenciaNoticias observable = new AgenciaNoticias();
		CanalNoticias observer = new CanalNoticias();
		
		observable.adicionarObservador(observer);
		observable.setNoticia("Noticia");
		
		System.out.println("Os dados são iguais -> Noticia  com -> " + observer.getNoticia());
	}

}
