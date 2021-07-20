package ExemploListGato;

import java.util.Comparator;

public class ComparatorCor extends ExemploOrdenacaoList implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
