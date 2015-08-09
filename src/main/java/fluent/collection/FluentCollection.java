package fluent.collection;

import java.util.Collection;

public interface FluentCollection<E> extends Collection<E> {

    public FluentCollection<E> plus(E e);

    public FluentCollection<E> plus(E e1, E e2);

    public FluentCollection<E> plus(E e1, E e2, E e3);

    public FluentCollection<E> plus(E e1, E e2, E e3, E e4);

    public FluentCollection<E> plus(E e1, E e2, E e3, E e4, E e5);

    public FluentCollection<E> plus(E e1, E e2, E e3, E e4, E e5, @SuppressWarnings("unchecked") E... rest);

    public FluentCollection<E> plus(Collection<? extends E> c);

}
