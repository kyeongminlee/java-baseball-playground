package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest() {
        String[] test = "1,2".split(",");
        assertThat(test).contains("1", "2");
    }

    @Test
    void exactSplitTest() {
        String[] test = "1".split(",");
        assertThat(test).containsExactly("1");
    }

    @Test
    void substringTest() {
        String test = "(1,2)";
        String substringTest = test.substring(1, test.length() - 1);
        assertThat(substringTest).isEqualTo("1,2");
    }
}
