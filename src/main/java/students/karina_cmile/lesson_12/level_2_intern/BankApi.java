package students.karina_cmile.lesson_12.level_2_intern;

import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid);

}
