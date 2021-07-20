package Map.Exemplos.OrdenacaoMap;

import java.util.Comparator;
import java.util.Map;

class ComparatorNome extends ExemploOrdenacaoMap implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> livro1, Map.Entry<String, Livros> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}
