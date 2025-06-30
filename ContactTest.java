import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("John", contact.getFirstName());
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testSetPhone() {
        Contact contact = new Contact("123", "Jane", "Doe", "1234567890", "321 Elm St");
        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    @Test
    public void testInvalidPhoneUpdate() {
        Contact contact = new Contact("123", "Jane", "Doe", "1234567890", "321 Elm St");
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("abc");
        });
    }
}