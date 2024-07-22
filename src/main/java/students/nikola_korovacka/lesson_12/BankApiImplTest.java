package students.nikola_korovacka.lesson_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BankApiImplTest {

    private BankApi bankApi;
    private List<BankClient> clients;

    @BeforeEach
    public void setUp() {
        clients = Arrays.asList(
                new BankClient("12345", "Иванов Иван Иванович"),
                new BankClient("67890", "Петров Петр Петрович")
        );

        bankApi = new BankApiImpl(clients);
    }

    @Test
    public void testFindByUid_WhenClientExistsAndHasPermission() throws AccessDeniedException {
        UserCredentials credentials = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS));

        Optional<BankClient> clientOptional = bankApi.findByUid(credentials, "12345");

        assertTrue(clientOptional.isPresent());
        assertEquals("12345", clientOptional.get().getUid());
        assertEquals("Иванов Иван Иванович", clientOptional.get().getFullName());
    }

    @Test
    public void testFindByUid_WhenClientDoesNotExist() throws AccessDeniedException {
        UserCredentials credentials = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS));

        Optional<BankClient> clientOptional = bankApi.findByUid(credentials, "99999");

        assertFalse(clientOptional.isPresent());
    }

    @Test
    public void testFindByUid_WhenNoPermission() {
        UserCredentials credentials = new UserCredentials(Arrays.asList(Role.CAN_VIEW_ACCOUNTS));

        AccessDeniedException exception = assertThrows(AccessDeniedException.class, () -> {
            bankApi.findByUid(credentials, "12345");
        });

        assertEquals("Доступ запрещен", exception.getMessage());
    }
}

