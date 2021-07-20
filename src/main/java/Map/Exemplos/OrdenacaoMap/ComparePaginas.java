package Map.Exemplos.OrdenacaoMap;

import java.util.Comparator;
import java.util.Map;

class ComparePaginas extends ExemploOrdenacaoMap implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> livro1, Map.Entry<String, Livros> livro2) {
        return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
    }
}
