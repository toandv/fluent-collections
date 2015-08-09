package fluent.collection.immutable;

import java.util.Set;

import fluent.collection.support.ImmutableFluentSetSupport;

public final class ImmutableFluentHashSet<E> extends ImmutableFluentSetSupport<E> {

    public ImmutableFluentHashSet() {
        this(new java.util.HashSet<>());
    }

    public ImmutableFluentHashSet(Set<E> backingSet) {
        super(backingSet);
    }

}
