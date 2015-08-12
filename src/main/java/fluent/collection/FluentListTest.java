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
