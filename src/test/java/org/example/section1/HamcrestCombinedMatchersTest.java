package org.example.section1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestCombinedMatchersTest {

    @Test
    public void whenCombiningMatchers_thenCorrect() {
        int number = 123;
        assertThat(number, allOf(greaterThan(100), lessThan(200)));
        assertThat(number, anyOf(equalTo(123), equalTo(456)));
        assertThat(number, not(equalTo(456)));
    }
}
