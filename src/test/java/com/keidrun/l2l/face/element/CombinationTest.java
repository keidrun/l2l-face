/**
 * Copyright 2017 Keid
*/
package com.keidrun.l2l.face.element;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.keidrun.l2l.face.element.Combination;
import com.keidrun.l2l.face.element.Language;

public class CombinationTest {

    @Test
    public void constructorTest() {

        // setup & exercise
        Combination sut = new Combination(Language.BATCH, Language.BASH);

        // verify
        assertThat(sut.getFrom(), is(Language.BATCH));
        assertThat(sut.getTo(), is(Language.BASH));

    }

}
