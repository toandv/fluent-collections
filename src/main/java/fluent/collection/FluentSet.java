package fluent.collection;

import java.util.Collection;
import java.util.Set;

public interface FluentSet<E> extends FluentCollection<E>, Set<E> {

    public FluentSet<E> plus(E e);

    public FluentSet<E> plus(E e1, E e2);

    public FluentSet<E> plus(E e1, E e2, E e3);

    public FluentSet<E> plus(E e1, E e2, E e3, E e4);

    public FluentSet<E> plus(E e1, E e2, E e3, E e4, E e5);

    public FluentSet<E> plus(E e1, E e2, E e3, E e4, E e5, @SuppressWarnings("unchecked") E... rest);

    public FluentSet<E> plus(Collection<? extends E> c);

}
