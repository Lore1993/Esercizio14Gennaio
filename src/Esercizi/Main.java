package Esercizi;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(1L, "baby", "Carte Pokémon Base Set", 12.99),
                new Product(2L, "baby", "Carte Pokémon Evolutions", 15.50),
                new Product(3L, "baby", "Carte Pokémon Collezione Speciale", 29.99),
                new Product(4L, "books", "Alessandro Manfredi - Romanzo Storico", 18.00),
                new Product(5L, "books", "David Goggins - Can't Hurt Me", 21.90),
                new Product(6L, "books", "Traduttore Inglese - Manuale Pratico", 250.00),
                new Product(7L, "boys", "Fumetti Corto Maltese - Volume 1", 14.50),
                new Product(8L, "boys", "Scarpe da corsa", 89.99)
        );
        List<Customer> customers = List.of(
                new Customer(1L, "Luca Rossi", 1),
                new Customer(2L, "Anna Bianchi", 2),
                new Customer(3L, "Marco Verdi", 3),
                new Customer(4L, "Elisa Neri", 4),
                new Customer(5L, "Giovanni Moretti", 1),
                new Customer(6L, "Sara Ferri", 2),
                new Customer(7L, "Paolo Romano", 3),
                new Customer(8L, "Francesca Gallo", 4)
        );
        List<Order> orders = List.of(

                new Order(1L, "PENDING", LocalDate.of(2026, 1, 1), LocalDate.of(2026, 1, 5),
                        List.of(products.get(0)), customers.get(0)),

                new Order(2L, "DELIVERED", LocalDate.of(2026, 1, 2), LocalDate.of(2026, 1, 6),
                        List.of(products.get(1), products.get(3)), customers.get(1)),

                new Order(3L, "SHIPPED", LocalDate.of(2026, 1, 3), LocalDate.of(2026, 1, 7),
                        List.of(products.get(2)), customers.get(2)),

                new Order(4L, "PENDING", LocalDate.of(2026, 1, 4), LocalDate.of(2026, 1, 8),
                        List.of(products.get(4)), customers.get(3)),

                new Order(5L, "DELIVERED", LocalDate.of(2026, 1, 5), LocalDate.of(2026, 1, 9),
                        List.of(products.get(5), products.get(6)), customers.get(4)),

                new Order(6L, "SHIPPED", LocalDate.of(2026, 1, 6), LocalDate.of(2026, 1, 10),
                        List.of(products.get(7)), customers.get(5)),

                new Order(7L, "PENDING", LocalDate.of(2026, 1, 7), LocalDate.of(2026, 1, 11),
                        List.of(products.get(0), products.get(2), products.get(4)), customers.get(6)),

                new Order(8L, "DELIVERED", LocalDate.of(2026, 1, 8), LocalDate.of(2026, 1, 12),
                        List.of(products.get(3)), customers.get(7))
        );
//Es.1
        List<Product> BooksUnder100 = products.stream()
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());


        //Es.2
        List<Product> Baby = products.stream()
                .filter(b -> b.getCategory().equals("baby"))
                .toList();

        //Es3
        products.stream()
                .filter(c -> c.getCategory().equals("boys"))
                .forEach(p -> p.setPrice(p.getPrice() * 0.9));
//Es 4

    }
}
