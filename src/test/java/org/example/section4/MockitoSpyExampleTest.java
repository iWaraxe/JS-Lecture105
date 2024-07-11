package org.example.section4;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;
public class MockitoSpyExampleTest {

    @Test
    public void whenSpyingOnList_thenCorrect() {
        List<String> list = new ArrayList<>();
        List<String> spyList = spy(list);

        spyList.add("one");
        spyList.add("two");

        verify(spyList).add("one");
        verify(spyList).add("two");
        assert spyList.size() == 2;
    }

    public static void main(String[] args) {
        MockitoSpyExampleTest test = new MockitoSpyExampleTest();
        test.whenSpyingOnList_thenCorrect();
    }
}

