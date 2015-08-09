package fluent.collection;

import java.util.Collection;
import java.util.List;

public interface FluentList<E> extends FluentCollection<E>, List<E> {

	public FluentList<E> plus(E e);

	public FluentList<E> plus(E e1, E e2);

	public FluentList<E> plus(E e1, E e2, E e3);

	public FluentList<E> plus(E e1, E e2, E e3, E e4);

	public FluentList<E> plus(E e1, E e2, E e3, E e4, E e5);

	public FluentList<E> plus(E e1, E e2, E e3, E e4, E e5, @SuppressWarnings("unchecked") E... rest);

	public FluentList<E> plus(Collection<? extends E> c);
}
