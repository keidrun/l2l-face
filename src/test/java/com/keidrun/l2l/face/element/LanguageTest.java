/**
 * Copyright 2017 Keid
*/
package com.keidrun.l2l.face.element;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.keidrun.l2l.face.element.Language;

public class LanguageTest {

    @Test
    public void getNamesTest() {

        // setup
        Language sut = Language.C;

        // exercise
        String[] actuals = sut.getNames();

        // verify
        assertEquals(1, actuals.length);
        assertThat(actuals[0], is("C"));

    }

    @Test
    public void valueOfNameTest() {

        // exercise
        Language actual = Language.valueOfName("Java");
        Language actualUpperCase = Language.valueOfName("JAVA");
        Language actualLowerCase = Language.valueOfName("java");
        Language actualNotDifined = Language.valueOfName("Java tea");

        // verify
        assertThat(actual, is(Language.JAVA));
        assertThat(actualUpperCase, is(Language.JAVA));
        assertThat(actualLowerCase, is(Language.JAVA));
        assertThat(actualNotDifined, is(Language.NOT_DEFINED));

    }

}
