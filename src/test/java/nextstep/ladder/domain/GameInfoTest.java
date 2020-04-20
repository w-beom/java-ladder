package nextstep.ladder.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameInfoTest {

    @DisplayName("참여할 사람과 실행 결과의 수는 같아야 한다. 같지 않을 경우 exception 발생")
    @Test
    void validateGameInfo() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new GameInfo(UsersTest.USERS, ResultsTest.RESULTS2);
        });
    }
}