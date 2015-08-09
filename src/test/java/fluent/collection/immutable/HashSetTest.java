package fluent.collection.immutable;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import fluent.collection.FluentSet;
import fluent.collection.immutable.ImmutableFluentHashSet;

public class HashSetTest {

    @Test
    public void testPlus1() {
        FluentSet<String> set = new ImmutableFluentHashSet<String>().plus("e1");
        set.plus("s");
        assertThat(set).hasSize(1);
    }

    @Test
    public void testPlus2() {
        FluentSet<String> set = new ImmutableFluentHashSet<String>().plus("e1", "e2");
        set.plus("s");
        assertThat(set).hasSize(2);
    }

    @Test
    public void testPlus2Replaced() {
        FluentSet<String> set = new ImmutableFluentHashSet<String>().plus("e1", "e1");
        set.plus("s");
        assertThat(set).hasSize(1);
    }

    @Test
    public void test() {
        FluentSet<Number> set = new ImmutableFluentHashSet<Number>().plus(1, 2f, 1l);
        set.plus(0);
        assertThat(set).hasSize(3);
    }
}
