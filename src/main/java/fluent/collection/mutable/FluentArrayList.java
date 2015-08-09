package fluent.collection.mutable;

import java.util.List;

import fluent.collection.support.FluentListSupport;

public final class FluentArrayList<E> extends FluentListSupport<E> {

    public FluentArrayList() {
        this(new java.util.ArrayList<>());
    }

    public FluentArrayList(List<E> backingList) {
        super(backingList);
    }

}
