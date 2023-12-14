package Exercicio02.teste;

import Exercicio02.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime=new Anime();
        anime.setNome("Dragon ball z");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.imprime();
    }
}
