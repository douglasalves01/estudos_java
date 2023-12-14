package Exercicio02.teste;

import Exercicio02.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon ball z", "TV", 12, "luta");
        anime.imprime();
    }
}
