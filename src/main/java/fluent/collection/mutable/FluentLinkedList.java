package fluent.collection.mutable;

import fluent.collection.support.FluentListSupport;

public class FluentLinkedList<E> extends FluentListSupport<E> {

    public FluentLinkedList() {
        super(new java.util.LinkedList<E>());
    }
}
