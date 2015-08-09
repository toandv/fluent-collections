package fluent.collection.support;

import java.util.Collection;
import java.util.function.Predicate;

import fluent.collection.FluentCollection;

public abstract class ImmutableFluentCollectionSupport<E> extends FluentCollectionSupport<E> {

    private boolean initialized;

    @Override
    public FluentCollection<E> plus(E e) {
        if (initialized) {
            return this;
        }
        initialized = true;
        return super.plus(e);
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2) {
        if (initialized) {
            return this;
        }
        initialized = true;
        return super.plus(e1, e2);
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3) {
        if (initialized) {
            return this;
        }
        initialized = true;
        return super.plus(e1, e2, e3);
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3, E e4) {
        if (initialized) {
            return this;
        }
        initialized = true;
        return super.plus(e1, e2, e3, e4);
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3, E e4, E e5) {
        if (initialized) {
            return this;
        }
        initialized = true;
        return super.plus(e1, e2, e3, e4, e5);
    }

    @Override
    public FluentCollection<E> plus(E e1, E e2, E e3, E e4, E e5, @SuppressWarnings("unchecked") E... rest) {
        if (initialized) {
            return this;
        }
        initialized = true;
        return super.plus(e1, e2, e3, e4, e5, rest);
    }

    @Override
    public FluentCollection<E> plus(Collection<? extends E> c) {
        if (initialized) {
            return this;
        }
        initialized = true;
        return super.plus(c);
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

}
