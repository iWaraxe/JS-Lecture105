package org.example.section3;

import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import java.util.List;

public class MockitoArgumentCaptorExampleTest {

    @Test
    public void whenMethodCalled_thenCaptureArgument() {
        List<String> mockedList = mock(List.class);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        mockedList.add("someString");
        verify(mockedList).add(argumentCaptor.capture());

        assertThat(argumentCaptor.getValue(), is(equalTo("someString")));
    }

    public static void main(String[] args) {
        MockitoArgumentCaptorExampleTest test = new MockitoArgumentCaptorExampleTest();
        test.whenMethodCalled_thenCaptureArgument();
    }
}

