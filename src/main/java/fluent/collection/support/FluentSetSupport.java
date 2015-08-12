package fluent.collection.support;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import fluent.collection.FluentSet;

public abstract class FluentSetSupport<E> extends FluentCollectionSupport<E> implements FluentSet<E> {
    protected final Set<E> backingSet;

    protected FluentSetSupport(Set<E> backingSet) {
        this.backingSet = backingSet;
    }

    @Override
    public FluentSet<E> plus(E e) {
        super.plus(e);
        return this;
    }

    @Override
    public FluentSet<E> plus(E e1, E e2) {
        super.plus(e1, e2);
        return this;
    }

    @Override
    public FluentSet<E> plus(E e1, E e2, E e3) {
        super.plus(e1, e2, e3);
        return this;
    }

    @Override
    public FluentSet<E> plus(E e1, E e2, E e3, E e4) {
        super.plus(e1, e2, e3, e4);
        return this;
    }

    @Override
    public FluentSet<E> plus(E e1, E e2, E e3, E e4, E e5) {
        super.plus(e1, e2, e3, e4, e5);
        return this;
    }

    @Override
    public FluentSet<E> plus(E e1, E e2, E e3, E e4, E e5, @SuppressWarnings("unchecked") E... rest) {
        super.plus(e1, e2, e3, e4, e5, rest);
        return this;
    }

    @Override
    public FluentSet<E> plus(Collection<? extends E> c) {
        super.plus(c);
        return this;
    }

    // JDK Set operations
    public int size() {
        return backingSet.size();
    }

    public boolean isEmpty() {
        return backingSet.isEmpty();
    }

    public boolean contains(Object o) {
        return backingSet.contains(o);
    }

    public Iterator<E> iterator() {
        return backingSet.iterator();
    }

    public Object[] toArray() {
        return backingSet.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return backingSet.toArray(a);
    }

    public boolean add(E e) {
        return backingSet.add(e);
    }

    public boolean remove(Object o) {
        return backingSet.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return backingSet.containsAll(c);
    }

    public boolean addAll(Collection<? extends E> c) {
        return backingSet.addAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return backingSet.retainAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return backingSet.removeAll(c);
    }

    public void clear() {
        backingSet.clear();
    }

    public boolean equals(Object o) {
        return backingSet.equals(o);
    }

    public int hashCode() {
        return backingSet.hashCode();
    }

}
