package microservices.book.multiplication.challenge;

import java.util.List;

public interface ChallengeService {

    /**
     * Verifies if an attempt coming from the presentation layer iss correct or not.
     *
     * @return the resulting ChallengeAttempt Object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);

    /**
     *
     * @param userAlias the user's alias
     * @return a list of the last 10 {@link ChallengeAttempt}
     */
    List<ChallengeAttempt> getStatsForUser(String userAlias);
}
