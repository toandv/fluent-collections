package fluent.collection.mutable;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Test;

public class FluentFastListTest {

    @Test
    public void testPlus1() {
        List<String> list = new FluentFastList<String>().plus("e1");
        assertThat(list).hasSize(1);
    }

    @Test
    public void testPlus2() {
        List<String> list = new FluentFastList<String>().plus("e1", "e2");
        assertThat(list).hasSize(2);
    }

    @Test
    public void testPlus2Replaced() {
        List<String> list = new FluentFastList<String>().plus("e1", "e1");
        assertThat(list).hasSize(2);
    }

    @Test
    public void test() {
        List<Number> list = new FluentFastList<Number>().plus(1, 2f, 1l);
        assertThat(list).hasSize(3);
    }

    @Test
    public void testPlus8() {
        List<String> list = new FluentFastList<String>().plus("e1", "e2", "e3", "e4", "e4", "e5", "e6", "e7", "e8");
        assertThat(list).hasSize(9);
    }
}
