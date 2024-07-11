package org.example.section1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestObjectTest {

    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    @Test
    public void whenCheckingObjectProperty_thenCorrect() {
        Person person = new Person("John Doe", 25);
        assertThat(person.getName(), equalTo("John Doe"));
        assertThat(person.getAge(), greaterThanOrEqualTo(20));
    }
}
