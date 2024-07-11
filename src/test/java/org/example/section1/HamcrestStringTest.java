package org.example.section1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestStringTest {

    @Test
    public void whenValidatingString_thenCorrect() {
        String name = "John Doe";
        assertThat(name, startsWith("John"));
        assertThat(name, endsWith("Doe"));
        assertThat(name, containsString("n D"));
    }
}

