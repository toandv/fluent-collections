## Fluent Collection

Fluent Collection is an extension of Java Collection Framework, providing fluent APIs when working with essential data structures such List, Set, Map. This project is not intended to reinvent the wheels, it just provides another convenient and fluent way to work with collections by wrapping existing implementations. 



### FluentList

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


### FluentMap

```java
package fluent.collection;

import java.util.Collection;
import java.util.Map;

import fluent.tuple.Pair;

public interface FluentMap<K, V> extends Map<K, V> {

    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p);

    public FluentMap<K, V> plus(K key, V value);

    public FluentMap<K, V> plus(K k1, V v1, K k2, V v2);

    public FluentMap<K, V> plus(K k1, V v1, K k2, V v2, K k3, V v3);

    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2);

    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2,
            Pair<? extends K, ? extends V> p3);

    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2,
            Pair<? extends K, ? extends V> p3, @SuppressWarnings("unchecked") Pair<? extends K, ? extends V>... rest);

    public FluentMap<K, V> plus(Collection<Pair<? extends K, ? extends V>> c);

    public FluentMap<K, V> plus(Map<? extends K, ? extends V> map);

}
```

FluentMap has two implementations:
* FluentHashMap<K, V> wrap JDK HashMap<K, V> 
* FluentLinkedHashMap<K, V> wrap JDK LinkedHashMap


### FluentMap's Usage

```java
package fluent.collection;

import java.util.Map;
import fluent.collection.mutable.FluentHashMap;
import fluent.collection.support.FluentMapSupport.KeyVal;

public class FluentMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new FluentHashMap<String, String>().plus("k1", "v1", "k2", "v2", "k3", "v3");

        FluentMap<String, String> fluentMap = (FluentMap<String, String>) map;

        fluentMap.plus(new KeyVal<String, String>("k4", "v4"));

        map.forEach((k, v) -> System.out.println(k + "=>" + v));
    }
}

```

The output is:

```
k1=>v1
k2=>v2
k3=>v3
k4=>v4
``






