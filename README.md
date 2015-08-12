## Fluent Collection

Fluent Collection is an extension of Java Collection Framework, providing fluent APIs when working with essential data structures such List, Set, Map. This project is not intended to reinvent the wheels, it just provides another convenient and fluent way to work with collections by wrapping existing implementations. 



## FluentList

```java
package fluent.collection;

import java.util.Collection;
import java.util.List;

public interface FluentList<E> extends FluentCollection<E>, List<E> {

	public FluentList<E> plus(E e);

	public FluentList<E> plus(E e1, E e2);

	public FluentList<E> plus(E e1, E e2, E e3);

	public FluentList<E> plus(E e1, E e2, E e3, E e4);

	public FluentList<E> plus(E e1, E e2, E e3, E e4, E e5);

	public FluentList<E> plus(E e1, E e2, E e3, E e4, E e5, E... rest);

	public FluentList<E> plus(Collection<? extends E> c);
}

```

FluentList<E> interface now has three implementations
* FluentArrayList<E> wraps JDK ArrayList<E>
* FluentLinkedList<E> wraps JDK LinkedList<E>
* FluentFastList<E> wraps FastList<E> from Goldman Sachs Collections

### FluentList's Usage


```java
package fluent.collection;

import java.util.List;

import fluent.collection.mutable.FluentArrayList;
import fluent.collection.mutable.FluentFastList;
import fluent.collection.mutable.FluentLinkedList;

public class FluentListTest {
    public static void main(String[] args) {

        // treated as java.util.List
        List<String> list = new FluentArrayList<String>().plus("s0", "s1", "s2", "s2");

        // treated as fluent.collection.FluentList
        FluentList<String> fluentList = (FluentList<String>) list;

        fluentList.plus(new FluentFastList<String>().plus("s3", "s4"));

        fluentList.plus(new FluentLinkedList<String>().plus("s5", "s6"));
        
        // lambda expression used to iterate over the list
        list.forEach(e -> System.out.print(e.toUpperCase() + " | "));

    }
}

```

The output is:

```
S0 | S1 | S2 | S2 | S3 | S4 | S5 | S6 | 
```











