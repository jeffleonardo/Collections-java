package ExerciciosPropostos.Exercicio1;

/*1-Crie um conjunto contendo as cores do arco-íris e:
Exiba todas as cores uma abaixo da outra
A quantidade de cores que o arco-íris tem
Exiba as cores em ordem alfabética
Exiba as cores na ordem inversa da que foi informada
Exiba todas as cores que começam com a letra ”v”
Remova todas as cores que não começam com a letra “v”
Limpe o conjunto
Confira se o conjunto está vazio*/

import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.*;

public class arcoIris {
    public static void main(String[] args) {
        System.out.println("Cores do arco íris.");

        Set<String> coresArcoIris = new HashSet<>();
            coresArcoIris.add("violeta");
            coresArcoIris.add("anil");
            coresArcoIris.add("azul");
            coresArcoIris.add("verde");
            coresArcoIris.add("amarelo");
            coresArcoIris.add("laranja");
            coresArcoIris.add("vermelho");


        System.out.println(coresArcoIris);


        System.out.println("Exibir a cores uma abaixo da outra:");
                for(String cor : coresArcoIris){
                    System.out.println(cor);
                }

        System.out.println("O arco íris tem " + coresArcoIris.size() + " cores.");

        System.out.println("Cores do arco íris em ordem alfabética:");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa que foram informadas:");

        Set<String> cores3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(cores3);

        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("Exiba todas as cores que começam com a letra 'v' ");

        for (String cores : coresArcoIris){
            if (cores.startsWith("v")) System.out.println(cores);
        }

        System.out.println("Remova todas as cores que começam com a letra 'v' ");
        Iterator<String> cores = coresArcoIris.iterator();
        while (cores.hasNext()){
            if (cores.next().startsWith("v")) cores.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Apague o conjunto de cores do arco íris: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("Verifique se o conjunto esta vazio: ");
        boolean vazio = coresArcoIris.isEmpty();
        if (vazio){
            System.out.println("Não há cores nesse arco íris!");
        }else{
            System.out.println("Existem essas cores nesse arco íris: " + coresArcoIris);
        }
    }
}
