package students.ruslan_k.lesson_12.level_2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BankApiImplTest {

    BankApiImpl bankApi;
    UserCredentials credentials1;
    UserCredentials credentials2;
    BankClient client1 = new BankClient("xXx", "Vin Diesel");
    BankClient client2 = new BankClient("007", "James Bond");

    @Before
    public void preparingForTest() {
        List<BankClient> bankClients = new ArrayList<>();

        List<Role> rolesForRightClient = new ArrayList<>();
        List<Role> rolesForWrongClient = new ArrayList<>();

        bankClients.add(client1);
        bankClients.add(client2);
        Role role1 = Role.CAN_SEARCH_CLIENTS;
        Role role2 = Role.CANT_SEARCH_CLIENT;
        rolesForRightClient.add(role1);
        rolesForWrongClient.add(role2);
        credentials1 = new UserCredentials(rolesForRightClient);
        credentials2 = new UserCredentials(rolesForWrongClient);

        bankApi = new BankApiImpl(bankClients);
    }

    @Test
    public void findByUidTestWhenCredentialsIsCorrect() throws WrongUserException {
        Optional<BankClient> expectValue = Optional.of(client2);
        assertEquals(expectValue, bankApi.findByUid(credentials1, "007"));
    }

    @Test(expected = WrongUserException.class)
    public void findByUidTestWhenCredentialsIsInCorrect() throws WrongUserException {
        bankApi.findByUid(credentials2, "007");

    }

}