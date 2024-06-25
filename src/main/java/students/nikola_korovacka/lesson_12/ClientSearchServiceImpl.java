package students.nikola_korovacka.lesson_12;

import java.util.ArrayList;
import java.util.List;

public class ClientSearchServiceImpl implements ClientSearchService {
    private List<BankClient> clients; // Список клиентов (для примера, обычно данные берутся из реальной базы)

    public ClientSearchServiceImpl() {
        // Инициализируем список клиентов (для примера, можно загрузить из реальной базы данных)
        clients = new ArrayList<>();
        clients.add(new BankClient("12345", "Иванов Иван Иванович"));
        clients.add(new BankClient("67890", "Петров Петр Петрович"));
    }

    @Override
    public BankClient searchClientById(String clientId, UserCredentials credentials) {
        List<Role> roles = credentials.getRoles(); // Получаем список ролей пользователя

        // Проверяем наличие необходимой роли (например, CAN_SEARCH_CLIENTS)
        if (!roles.contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new SecurityException("Доступ запрещен"); // Если нет нужной роли, выбрасываем исключение безопасности
        }

        // Ищем клиента по его идентификатору
        for (BankClient client : clients) {
            if (client.getUid().equals(clientId)) {
                return client; // Возвращаем найденного клиента
            }
        }

        throw new IllegalArgumentException("Клиент с идентификатором " + clientId + " не найден");
    }
}


