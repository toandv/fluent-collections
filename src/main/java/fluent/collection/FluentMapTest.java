package fluent.collection;

import java.util.Map;
import fluent.collection.mutable.FluentHashMap;
import fluent.collection.support.FluentMapSupport.KeyVal;

public class FluentMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new FluentHashMap<String, String>().plus("k1", "v1", "k2", "v2", "k3", "v3");

        FluentMap<String, String> fluentMap = (FluentMap<String, String>) map;

        fluentMap.plus(new KeyVal<String, String>("k4", "v4"));

        map.forEach((k, v) -> System.out.println(k + "=>" + v));
    }
}
