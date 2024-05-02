package students.aleksandra_hodjuka.lesson_12._level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {

    public static void main(String[] args) {
        testFindByUid_Success();
        testFindByUid_AccessDenied();
        testFindByUid_ClientNotFound();
    }

    public static void testFindByUid_Success() {
        List<BankClient> clients = new ArrayList<>();
        clients.add(new BankClient("1", "Client 1"));
        clients.add(new BankClient("2", "Client 2"));
        clients.add(new BankClient("3", "Client 3"));

        BankApiImpl bankApi = new BankApiImpl(clients);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        try {
            Optional<BankClient> result = bankApi.findByUid(credentials, "2");
            if (result.isPresent()) {
                BankClient client = result.get();
                if ("2".equals(client.getUid()) && "Client 2".equals(client.getFullName())) {
                    System.out.println("testFindByUid_Success: PASSED");
                } else {
                    System.out.println("testFindByUid_Success: FAILED - Incorrect client details");
                }
            } else {
                System.out.println("testFindByUid_Success: FAILED - Client not found");
            }
        } catch (AccessDeniedException e) {
            System.out.println("testFindByUid_Success: FAILED - Access denied exception thrown unexpectedly");
        }
    }

    public static void testFindByUid_AccessDenied() {
        List<BankClient> clients = new ArrayList<>();
        clients.add(new BankClient("1", "Client 1"));
        clients.add(new BankClient("2", "Client 2"));
        clients.add(new BankClient("3", "Client 3"));

        BankApiImpl bankApi = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(new ArrayList<>());

        try {
            Optional<BankClient> result = bankApi.findByUid(credentials, "2");
            System.out.println("testFindByUid_AccessDenied: FAILED - Access denied exception not thrown");
        } catch (AccessDeniedException e) {
            System.out.println("testFindByUid_AccessDenied: PASSED");
        }
    }

    public static void testFindByUid_ClientNotFound() {
        List<BankClient> clients = new ArrayList<>();
        clients.add(new BankClient("1", "Client 1"));
        clients.add(new BankClient("3", "Client 3"));

        BankApiImpl bankApi = new BankApiImpl(clients);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        try {
            Optional<BankClient> result = bankApi.findByUid(credentials, "2");
            if (!result.isPresent()) {
                System.out.println("testFindByUid_ClientNotFound: PASSED");
            } else {
                System.out.println("testFindByUid_ClientNotFound: FAILED - Client found unexpectedly");
            }
        } catch (AccessDeniedException e) {
            System.out.println("testFindByUid_ClientNotFound: FAILED - Access denied exception thrown unexpectedly");
        }
    }
}