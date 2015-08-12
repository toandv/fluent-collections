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
