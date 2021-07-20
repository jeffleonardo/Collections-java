package Map.Exemplos.OrdenacaoMap;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");

        Map<String, Livros> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o século 21", 432));
        }};

        for (Map.Entry<String, Livros> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem de inserção\t--");
        Map<String, Livros> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o século 21", 432));
        }};

        for (Map.Entry<String, Livros> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética dos autores\t--");
        Map<String, Livros> meusLivros3 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livros> livro : meusLivros3.entrySet())
            System.out.println(livro.getKey());

        System.out.println("--\tOrdem alfabética dos livros\t--");
        Set<Map.Entry<String, Livros>> meusLivros5 = new TreeSet<>(new ComparatorNome());
        meusLivros5.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros5)
            System.out.println(livro.getValue().getNome());

        System.out.println("--\tNúmero de páginas\t--");
        Set<Map.Entry<String, Livros>> meusLivros6 = new TreeSet<>(new ComparePaginas());
        meusLivros6.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros6)
            System.out.println(livro.getValue().getPaginas());
    }
}
