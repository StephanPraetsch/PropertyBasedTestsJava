package com.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

public class MyPropertyBasedTest {

    @Property
    void reverseTwiceToOriginal(@ForAll List<Integer> aList) throws Exception {
        List<Integer> copy = new ArrayList(aList);
        Collections.reverse(copy);
        Collections.reverse(copy);
        assertThat(copy).isEqualTo(aList);
    }

    @Property
    void testThatBreaks(@ForAll List<Integer> aList) throws Exception {
        System.out.println(aList.size() + " " + aList);
        assertThat(false).isTrue();
    }

}
