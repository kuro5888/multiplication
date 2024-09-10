package microservices.book.multiplication.challenge;

import jakarta.validation.constraints.*;
import lombok.Value;
/**
 * Attempt coming from the User
 */
@Value
public class ChallengeAttemptDTO {
     @Min(1) @Max(99)
     int factorA, factorB;
     @NotBlank
     String userAlias;
     @Positive(message = "How could you possibly put a negative answer dingus. Try again.")
     int guess;
}
