package fluent.collection.mutable;

import com.gs.collections.impl.list.mutable.FastList;

import fluent.collection.support.FluentListSupport;

public class FluentFastList<E> extends FluentListSupport<E> {

    public FluentFastList() {
        super(new FastList<E>());
    }
}
