package fluent.collection.mutable;

import static org.assertj.core.api.Assertions.*;

import java.util.Set;

import org.junit.Test;

public class FluentHashSetTest {

    @Test
    public void testPlus1() {
        Set<String> set = new FluentHashSet<String>().plus("e1");
        assertThat(set).hasSize(1);
    }

    @Test
    public void testPlus2() {
        Set<String> set = new FluentHashSet<String>().plus("e1", "e2");
        assertThat(set).hasSize(2);
    }

    @Test
    public void testPlus2Replaced() {
        Set<String> set = new FluentHashSet<String>().plus("e1", "e1");
        assertThat(set).hasSize(1);
    }

    @Test
    public void test() {
        Set<Number> set = new FluentHashSet<Number>().plus(1, 2f, 1l);
        assertThat(set).hasSize(3);
    }
}
