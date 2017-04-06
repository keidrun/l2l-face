/**
 * Copyright 2017 Keid
*/
package com.keidrun.l2l.face.plugins;

import com.keidrun.l2l.face.element.Combination;

/**
 * Program conversion plugin.
 * 
 * @author Keid
 */
public interface ConvertPlugin {

    /**
     * If this supports the combination.
     * 
     * @param combination
     *            the combination of two programming languages.
     * @return if this supports the combination.
     */
    public boolean isSupported(Combination combination);

    /**
     * Convert the programming language to other programming language.
     * 
     * @param combination
     *            the combination of the origin language and the destination
     *            language.
     * @param program
     *            the program file.
     * @return the converted program file.
     */
    public String convert(Combination combination, String program);

}
