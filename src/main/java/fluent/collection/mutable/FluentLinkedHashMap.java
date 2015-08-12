package fluent.collection.mutable;

import fluent.collection.support.FluentMapSupport;

public class FluentLinkedHashMap<K, V> extends FluentMapSupport<K, V> {

    public FluentLinkedHashMap() {
        super(new java.util.LinkedHashMap<K, V>());
    }
}
