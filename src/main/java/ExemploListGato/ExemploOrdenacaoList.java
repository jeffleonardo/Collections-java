package ExemploListGato;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter @Setter
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18 , "preto"));
            add(new Gato("Simba", 6 , "tigrado"));
            add(new Gato("Jon", 18 , "amarelo"));
        }};
        System.out.println("Lista em ordem de inserção");
        System.out.println(meusGatos);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Lista em ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (Idade)");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem natural (Cor)");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem natural Nome/Cor/Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
