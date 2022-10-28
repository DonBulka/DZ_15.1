import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void testTickets() {

        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);

        Ticket ticket1 = new Ticket(1, 500, "Moscow", "Dubai", 5 );
        Ticket ticket2 = new Ticket(2, 300, "Saint-Petersburg", "Dubai", 5 );
        Ticket ticket3 = new Ticket(3, 400, "Moscow", "Dubai", 5 );
        Ticket ticket4 = new Ticket(4, 700, "Moscow", "Dubai", 5 );
        Ticket ticket5 = new Ticket(5, 600, "Moscow", "Dubai", 5 );
        Ticket ticket6 = new Ticket(6, 800, "Moscow", "Dubai", 5 );

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Ticket[] actual = manager.findAll("Moscow", "Dubai");
        Ticket[] expected = {ticket3, ticket1, ticket5, ticket4, ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }
}
