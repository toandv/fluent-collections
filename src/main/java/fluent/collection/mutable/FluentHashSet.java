package fluent.collection.mutable;

import java.util.Set;

import fluent.collection.support.FluentSetSupport;

public final class FluentHashSet<E> extends FluentSetSupport<E> {

    public FluentHashSet() {
        this(new java.util.HashSet<>());
    }

    public FluentHashSet(Set<E> backupSet) {
        super(backupSet);
    }

}
