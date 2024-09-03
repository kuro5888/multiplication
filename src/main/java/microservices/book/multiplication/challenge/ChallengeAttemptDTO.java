package microservices.book.multiplication.challenge;

import lombok.Value;
/**
 * Attempt coming from the User
 */
@Value
public class ChallengeAttemptDTO {
     int factorA, factorB;
     String userAlias;
     int guess;
}
