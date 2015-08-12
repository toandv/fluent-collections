package fluent.collection.mutable;

import fluent.collection.support.FluentMapSupport;

public final class FluentHashMap<K, V> extends FluentMapSupport<K, V> {

    public FluentHashMap() {
        super(new java.util.HashMap<K, V>());
    }
}
