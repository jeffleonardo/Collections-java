package ExemploStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de Strings: ");
        numerosAleatorios.forEach(System.out::println); //reference method

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println); //set não aceita numeros repetidos

        System.out.println("Transforme esta lista de Strings em uma lista de Inteiros.");
        List<Integer> collectList = numerosAleatorios
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (Integer nums : collectList) System.out.println(nums);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> numsPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        for (Integer nums : numsPares) System.out.println(nums);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valroes impares: ");
        collectList.removeIf(integer -> integer % 2 != 0);
        System.out.println(collectList);
    }
}
