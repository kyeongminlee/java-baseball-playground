package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    void charAtTest() {
        String test = "abc";
        assertThat(test.charAt(0)).isEqualTo('a');
        assertThat(test.charAt(1)).isEqualTo('b');
        assertThat(test.charAt(2)).isEqualTo('c');
    }

    @Test
    @DisplayName("charAt() 메소드 사용시 범위를 벗어나는 케이스 테스트")
    void charAtExceptionTest() {
        String test = "abc";

        assertThatThrownBy(() -> {
            test.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
