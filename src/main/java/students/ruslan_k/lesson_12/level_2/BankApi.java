package students.ruslan_k.lesson_12.level_2;

import java.util.Optional;


interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws WrongUserException;

}