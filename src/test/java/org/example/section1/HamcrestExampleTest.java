package org.example.section1;



import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class HamcrestExampleTest {

    @Test
    public void whenListIsChecked_thenSizeIsCorrect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //assertEquals(5, numbers.size());

        assertThat(numbers, hasSize(5));
    }

    public static void main(String[] args) {
        HamcrestExampleTest test = new HamcrestExampleTest();
        test.whenListIsChecked_thenSizeIsCorrect();
    }
}
