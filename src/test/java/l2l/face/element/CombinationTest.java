/**
 * Copyright 2017 Keid
*/
package l2l.face.element;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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
