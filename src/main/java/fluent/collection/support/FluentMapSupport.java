package fluent.collection.support;

import java.util.Collection;
import java.util.Map;

import fluent.collection.FluentMap;
import fluent.tuple.Pair;

public abstract class FluentMapSupport<K, V> implements FluentMap<K, V> {

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p) {
        return null;
    }

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2) {
        return null;
    }

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2, Pair<? extends K, ? extends V> p3) {
        return null;
    }

    @Override
    public FluentMap<K, V> plus(Pair<? extends K, ? extends V> p1, Pair<? extends K, ? extends V> p2, Pair<? extends K, ? extends V> p3,
            @SuppressWarnings("unchecked") Pair<? extends K, ? extends V>... rest) {
        return null;
    }

    @Override
    public FluentMap<K, V> plus(Collection<Pair<? extends K, ? extends V>> c) {
        return null;
    }

    @Override
    public FluentMap<K, V> plus(Map<? extends K, ? extends V> map) {
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
        public K $1() {
            return k;
        }

        @Override
        public V $2() {
            return v;
        }

        @Override
        public String toString() {
            return "KeyVal [k=" + k + ", v=" + v + "]";
        }

    }
}
