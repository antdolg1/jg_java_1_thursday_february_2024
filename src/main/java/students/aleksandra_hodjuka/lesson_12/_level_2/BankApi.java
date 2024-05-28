package students.aleksandra_hodjuka.lesson_12._level_2;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Optional;

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
