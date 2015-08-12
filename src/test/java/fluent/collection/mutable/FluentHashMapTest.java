package fluent.collection.mutable;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import fluent.collection.support.FluentMapSupport.KeyVal;
import org.junit.Test;

public class FluentHashMapTest {
    @Test
    public void testCreate() {
        Map<String, String> map = new FluentHashMap<String, String>().plus(new KeyVal<String, String>("1", "2"))
                .plus("2", "3");
        assertThat(map).hasSize(2);
    }
}
