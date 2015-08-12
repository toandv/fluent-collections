package fluent.collection.support;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import fluent.collection.FluentList;

public abstract class FluentListSupport<E> extends FluentCollectionSupport<E> implements FluentList<E> {
    protected final List<E> backingList;

    protected FluentListSupport(List<E> backingList) {
        this.backingList = backingList;
    }

    @Override
    public FluentList<E> plus(E e) {
        super.plus(e);
        return this;
    }

    @Override
    public FluentList<E> plus(E e1, E e2) {
        super.plus(e1, e2);
        return this;
    }

    @Override
    public FluentList<E> plus(E e1, E e2, E e3) {
        super.plus(e1, e2, e3);
        return this;
    }

    @Override
    public FluentList<E> plus(E e1, E e2, E e3, E e4) {
        super.plus(e1, e2, e3, e4);
        return this;
    }

    @Override
    public FluentList<E> plus(E e1, E e2, E e3, E e4, E e5) {
        super.plus(e1, e2, e3, e4, e5);
        return this;
    }

    @Override
    public FluentList<E> plus(E e1, E e2, E e3, E e4, E e5, @SuppressWarnings("unchecked") E... rest) {
        super.plus(e1, e2, e3, e4, e5, rest);
        return this;
    }

    @Override
    public FluentList<E> plus(Collection<? extends E> c) {
        super.plus(c);
        return this;
    }

    // JDK
    public int size() {
        return backingList.size();
    }

    public boolean isEmpty() {
        return backingList.isEmpty();
    }

    public boolean contains(Object o) {
        return backingList.contains(o);
    }

    public Iterator<E> iterator() {
        return backingList.iterator();
    }

    public Object[] toArray() {
        return backingList.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return backingList.toArray(a);
    }

    public boolean add(E e) {
        return backingList.add(e);
    }

    public boolean remove(Object o) {
        return backingList.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return backingList.containsAll(c);
    }

    public boolean addAll(Collection<? extends E> c) {
        return backingList.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return backingList.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return backingList.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return backingList.retainAll(c);
    }

    public void clear() {
        backingList.clear();
    }

    public boolean equals(Object o) {
        return backingList.equals(o);
    }

    public int hashCode() {
        return backingList.hashCode();
    }

    public E get(int index) {
        return backingList.get(index);
    }

    public E set(int index, E element) {
        return backingList.set(index, element);
    }

    public void add(int index, E element) {
        backingList.add(index, element);
    }

    public E remove(int index) {
        return backingList.remove(index);
    }

    public int indexOf(Object o) {
        return backingList.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return backingList.lastIndexOf(o);
    }

    public ListIterator<E> listIterator() {
        return backingList.listIterator();
    }

    public ListIterator<E> listIterator(int index) {
        return backingList.listIterator(index);
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return backingList.subList(fromIndex, toIndex);
    }

    @Override
    public String toString() {
        return "FluentListSupport [backingList=" + backingList + "]";
    }

}
