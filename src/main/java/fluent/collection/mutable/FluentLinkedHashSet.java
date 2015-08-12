package fluent.collection.mutable;

import fluent.collection.support.FluentSetSupport;

public class FluentLinkedHashSet<E> extends FluentSetSupport<E> {

    public FluentLinkedHashSet() {
        super(new java.util.LinkedHashSet<E>());
    }
}
