/**
 * Copyright 2017 Keid
*/
package l2l.face.plugin;

import l2l.face.element.Combination;

/**
 * Program conversion plugin
 * 
 * @author Keid
 */
public interface ConvertPlugin {

    /**
     * If this supports the combination.
     * 
     * @param combination
     *            a combination of two programming languages.
     * @return if this supports the combination.
     */
    public boolean isSupported(Combination combination);

    /**
     * Convert the programming language to other programming language.
     * 
     * @param combination
     *            a combination of two programming languages.
     * @param program
     *            a program file.
     */
    public void convert(Combination combination, String program);

}
