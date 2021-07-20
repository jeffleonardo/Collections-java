package ExemploOrdenacaoSet;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter @Setter
class Series extends OrdenacaoSet implements Comparable<Series>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(nome, series.nome) && Objects.equals(genero, series.genero) && Objects.equals(tempoEpisodio, series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series series) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(series.getGenero());
    }
}
