package fluent.collection.immutable;

import java.util.Iterator;

public class ImmutableIterator<E> implements Iterator<E> {
    private Iterator<E> backingIterator;

    public ImmutableIterator(Iterator<E> backingIterator) {
        this.backingIterator = backingIterator;
    }

    @Override
    public boolean hasNext() {
        return backingIterator.hasNext();
    }

    @Override
    public E next() {
        return backingIterator.next();
    }

    @Override
    public void remove() {
        // do nothing instead of throwing exception, fail-safe
    }

}
