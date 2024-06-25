package students.nikola_korovacka.lesson_12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<BankClient> clients = Arrays.asList(
                new BankClient("12345", "Иванов Иван Иванович"),
                new BankClient("67890", "Петров Петр Петрович")
        );

        UserCredentials credentials = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS, Role.CAN_VIEW_ACCOUNTS)); // Роли пользователя

        BankApi bankApi = new BankApi() {
            @Override
            public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws SecurityException {
                List<Role> roles = credentials.getRoles(); // Получаем список ролей пользователя

                // Проверяем наличие необходимой роли (например, CAN_SEARCH_CLIENTS)
                if (!roles.contains(Role.CAN_SEARCH_CLIENTS)) {
                    throw new SecurityException("Доступ запрещен"); // Если нет нужной роли, выбрасываем исключение безопасности
                }

                // Ищем клиента по его идентификатору
                for (BankClient client : clients) {
                    if (client.getUid().equals(uid)) {
                        return Optional.of(client); // Возвращаем найденного клиента
                    }
                }

                return Optional.empty(); // Возвращаем пустой Optional, если клиент не найден
            }
        };

        try {
            Optional<BankClient> clientOptional = bankApi.findByUid(credentials, "12345"); // Ищем клиента по идентификатору

            if (clientOptional.isPresent()) {
                BankClient client = clientOptional.get();
                System.out.println("Найден клиент: " + client.getFullName()); // Выводим информацию о клиенте
            } else {
                System.out.println("Клиент с указанным идентификатором не найден");
            }
        } catch (SecurityException e) {
            System.out.println(e.getMessage()); // Обрабатываем возможное исключение безопасности
        } catch (AccessDeniedException e) {
            throw new RuntimeException(e);
        }
    }
}
