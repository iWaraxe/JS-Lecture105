package org.example.section2;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import java.util.List;

public class MockitoVerifyExampleTest {

    @Test
    public void whenMockMethodCalled_thenVerifyInteraction() {
        List<String> mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    public static void main(String[] args) {
        MockitoVerifyExampleTest test = new MockitoVerifyExampleTest();
        test.whenMockMethodCalled_thenVerifyInteraction();
    }
}
