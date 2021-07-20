package Map.Exemplos.OrdenacaoMap;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Livros extends ExemploOrdenacaoMap{
    private String nome;
    private int paginas;

    public Livros(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return paginas == livros.paginas && nome.equals(livros.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
