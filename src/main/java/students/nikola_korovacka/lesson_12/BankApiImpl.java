package students.nikola_korovacka.lesson_12;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {
    private List<BankClient> clients; // Список клиентов (для примера, обычно данные берутся из реальной базы)

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients; // Инициализируем список клиентов
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        List<Role> roles = credentials.getRoles(); // Получаем список ролей пользователя

        // Проверяем наличие необходимой роли (например, CAN_SEARCH_CLIENTS)
        if (!roles.contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("Доступ запрещен"); // Если нет нужной роли, выбрасываем исключение доступа
        }

        // Ищем клиента по его идентификатору
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client); // Возвращаем найденного клиента
            }
        }

        return Optional.empty(); // Возвращаем пустой Optional, если клиент не найден
    }
}

