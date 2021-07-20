package ExemploOrdenacaoSet;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Getter
@Setter
public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Series> minhasSeries = new HashSet<>(){{
           add(new Series("got", "fantasia", 60));
           add(new Series("dark", "drama", 60));
           add(new Series("that 70s show", "comédia", 25));
        }};
        for(Series serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
        serie.getTempoEpisodio());

        System.out.println("--\tOrdem inserção\t--");
        Set<Series> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that 70s show", "comédia", 25));
        }};

        System.out.println("Ordem natural (TempoEpisódio)");
        Set<Series> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for(Series serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());
    }
}
