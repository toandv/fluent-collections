package fluent.collection.support;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import fluent.collection.FluentMap;
import fluent.tuple.Pair;

public abstract class FluentMapSupport<K, V> implements FluentMap<K, V> {

    protected final Map<K, V> backingMap;

    protected FluentMapSupport(Map<K, V> backingMap) {
        this.backingMap = backingMap;
    }

    @Override
    public FluentMap<K, V> plus(K key, V value) {
        put(Objects.requireNonNull(key, "Key should not be null."), value);
        return this;
    }

    @Override
    public FluentMap<K, V> plus(K k1, V v1, K k2, V v2) {
        put(Objects.requireNonNull(k1, "k1 should not be null."), v1);
        put(Objects.requireNonNull(k2, "k2 should not be null."), v2);
        return this;
    }

    @Override
    public FluentMap<K, V> plus(K k1, V v1, K k2, V v2, K k3, V v3) {
        put(Objects.requireNonNull(k1, "k1 should not be null."), v1);
        put(Objects.requireNonNull(k2, "k2 should not be null."), v2);
        put(Objects.requireNonNull(k3, "k3 should not be null."), v3);
        return this;
    }

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p) {
        put(Objects.requireNonNull(p.left(), "Key should not be null."), p.right());
        return this;
    }

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2) {
        put(Objects.requireNonNull(p1.left(), "p1's key should not be null."), p1.right());
        put(Objects.requireNonNull(p2.left(), "p2's key should not be null."), p2.right());
        return this;
    }

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2,
            Pair<? extends K, ? extends V> p3) {
        put(Objects.requireNonNull(p1.left(), "p1's key should not be null."), p1.right());
        put(Objects.requireNonNull(p2.left(), "p2's key should not be null."), p2.right());
        put(Objects.requireNonNull(p3.left(), "p3's key should not be null."), p3.right());
        return this;
    }

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2,
            Pair<? extends K, ? extends V> p3, @SuppressWarnings("unchecked") Pair<? extends K, ? extends V>... rest) {
        put(Objects.requireNonNull(p1.left(), "p1's key should not be null."), p1.right());
        put(Objects.requireNonNull(p2.left(), "p2's key should not be null."), p2.right());
        put(Objects.requireNonNull(p3.left(), "p3's key should not be null."), p3.right());
        for (Pair<? extends K, ? extends V> p : Objects.requireNonNull(rest, "rest  should not be null.")) {
            put(Objects.requireNonNull(p.left(), "rest's keys should not be null."), p.right());
        }
        return this;
    }

    @Override
    public FluentMap<K, V> plus(Collection<Pair<? extends K, ? extends V>> c) {
        for (Pair<? extends K, ? extends V> p : Objects.requireNonNull(c, "rest  should not be null.")) {
            put(Objects.requireNonNull(p.left(), "c's keys should not be null."), p.right());
        }
        return null;
    }

    @Override
    public FluentMap<K, V> plus(Map<? extends K, ? extends V> map) {
        for (Entry<? extends K, ? extends V> e : map.entrySet()) {
            put(Objects.requireNonNull(e.getKey(), "map's keys should not be null."), e.getValue());
        }
        return null;
    }

    public static class KeyVal<K, V> implements Pair<K, V> {
        private K k;

        private V v;

        public KeyVal(K k, V v) {
            this.k = k;
            this.v = v;
        }

        @Override
        public K left() {
            return k;
        }

        @Override
        public V right() {
            return v;
        }

        @Override
        public String toString() {
            return "KeyVal [k=" + k + ", v=" + v + "]";
        }

    }

    // JDK
    public int size() {
        return backingMap.size();
    }

    public boolean isEmpty() {
        return backingMap.isEmpty();
    }

    public boolean containsKey(Object key) {
        return backingMap.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return backingMap.containsValue(value);
    }

    public V get(Object key) {
        return backingMap.get(key);
    }

    public V put(K key, V value) {
        return backingMap.put(key, value);
    }

    public V remove(Object key) {
        return backingMap.remove(key);
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        backingMap.putAll(m);
    }

    public void clear() {
        backingMap.clear();
    }

    public Set<K> keySet() {
        return backingMap.keySet();
    }

    public Collection<V> values() {
        return backingMap.values();
    }

    public Set<java.util.Map.Entry<K, V>> entrySet() {
        return backingMap.entrySet();
    }

    public boolean equals(Object o) {
        return backingMap.equals(o);
    }

    public int hashCode() {
        return backingMap.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
