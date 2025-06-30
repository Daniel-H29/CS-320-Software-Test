import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    public void setup() {
        service = new ContactService();
        service.addContact(new Contact("001", "Alice", "Smith", "1234567890", "123 Road St"));
    }

    @Test
    public void testAddContactSuccess() {
        Contact contact = new Contact("002", "Bob", "Brown", "0987654321", "456 Lane Ave");
        service.addContact(contact);
        service.updatePhone("002", "1112223333");
        assertEquals("1112223333", contact.getPhone());
    }

    @Test
    public void testAddDuplicateContact() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(new Contact("001", "Chris", "Evans", "1234567890", "789 Blvd"));
        });
    }

    @Test
    public void testDeleteContact() {
        service.deleteContact("001");
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("001");
        });
    }

    @Test
    public void testUpdateFirstName() {
        service.updateFirstName("001", "Eve");
        assertEquals("Eve", service.getContact("001").getFirstName());
    }
}