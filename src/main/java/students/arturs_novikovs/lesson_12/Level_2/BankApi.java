package students.arturs_novikovs.lesson_12.Level_2;

import java.util.Optional;
public interface BankApi {
        Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
