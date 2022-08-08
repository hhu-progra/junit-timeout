import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleTest {
    @Test
    void test() {
        assertThat(Example.answer()).isEqualTo(21);
    }
}
