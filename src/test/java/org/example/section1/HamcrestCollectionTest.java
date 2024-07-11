package org.example.section1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestCollectionTest {

    @Test
    public void whenCheckingValue_thenExists() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertThat(list, hasItem(2));
    }
}
