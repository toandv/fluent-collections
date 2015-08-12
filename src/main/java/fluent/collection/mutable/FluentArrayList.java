package fluent.collection.mutable;

import fluent.collection.support.FluentListSupport;

public final class FluentArrayList<E> extends FluentListSupport<E> {

    private FluentArrayList() {
        super(new java.util.ArrayList<E>());
    }
}
