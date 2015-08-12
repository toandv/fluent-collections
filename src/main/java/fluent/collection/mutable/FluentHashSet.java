package fluent.collection.mutable;

import fluent.collection.support.FluentSetSupport;

public final class FluentHashSet<E> extends FluentSetSupport<E> {

    public FluentHashSet() {
        super(new java.util.HashSet<E>());
    }
}
