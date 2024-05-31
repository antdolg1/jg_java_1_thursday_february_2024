package students.ruslan_k.lesson_12.level_2;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws WrongUserException {


        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS) || credentials==null) {
            throw new WrongUserException("Wrong User credentials");
        }

        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }

        return Optional.empty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankApiImpl bankApi = (BankApiImpl) o;
        return Objects.equals(clients, bankApi.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clients);
    }
// если в credentials нет роли Role.CAN_SEARCH_CLIENTS
    // то метод должен кидать ошибку AccessDeniedException
    // иначе производить поиск клиента с указанным uid
}


