package org.example.section3;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class MockitoArgumentMatcherExampleTest {

    @Test
    public void whenUsingArgumentMatchers_thenCorrect() {
        List<String> mockedList = mock(List.class);

        // Call method with an argument.
        mockedList.add("test-string");

        // Verify method was called with any string.
        verify(mockedList).add(anyString());
    }
}
