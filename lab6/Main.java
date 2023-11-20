package lab6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        /*Triangle triangle = new Triangle(5);
        Square square = new Square(6);

        triangle.desen();
        square.desen();
        Shape.afisazaCeva();*/

        List<Book> listeCarti = new ArrayList<>();
        List<String> listaDeStrings = new ArrayList();

        listeCarti.add(new Book("ProstiaOmului" ,"Dancila","184856" ));
        listeCarti.add(new Book("Baltagu" ,"Seboi","157093 kdog4859 39845" ));

        Book book1 = listeCarti.get(1);
        listeCarti.contains(book1);

        listeCarti.forEach(element ->{
            System.out.println(element.getName());
            System.out.println(listeCarti.indexOf(element));
        });

        listeCarti.stream()
                .filter(e -> e.getISPN().length() > 10)
                .map(e -> e.getAuthor())
                .toList();
    }
}
