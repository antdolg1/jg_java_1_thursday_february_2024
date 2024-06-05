package students.karina_cmile.lesson_12.level_2_intern;

import java.util.Optional;

public class AccessDeniedException extends Exception {
    public AccessDeniedException() {
        super();
    }

    public AccessDeniedException(String message) {
        super(message);
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {


        return null;
    }
}

