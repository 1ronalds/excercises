import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TestableTest {

    @Test
    void isLarger() {
        assertAll(() -> assertEquals(true, Testable.isLarger(2,1)),
                () -> assertEquals(false, Testable.isLarger(1, 2)));
    }
}