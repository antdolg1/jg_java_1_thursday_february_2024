package students.arturs_novikovs.lesson_12.Level_2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class BankApiImplTest {
    private BankApi api;
    private List<BankClient> clients;

    @Before
    public void setUp() {
        clients = new ArrayList<>();
        api = new BankApiImpl(clients);
    }

    @Test(expected = AccessDeniedException.class)
    public void shouldThrowException_WhenCredentialsNotHaveAppropriateRole() throws AccessDeniedException {
        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        api.findByUid(credentials, "123");
}
}