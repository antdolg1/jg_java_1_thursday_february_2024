package students.nikola_korovacka.lesson_12;

public interface ClientSearchService {
    BankClient searchClientById(String clientId, UserCredentials credentials); // Метод для поиска клиента с использованием UserCredentials
}


