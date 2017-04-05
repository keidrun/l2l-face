/**
 * Copyright 2017 Keid
*/
package com.keidrun.l2l.face.element;

/**
 * Combination of the origin language and the destination language.
 * 
 * @author Keid
 */
public class Combination {

    /**
     * Programming language before conversion.
     */
    private Language origin;

    /**
     * Programming language after conversion.
     */
    private Language dest;

    /**
     * Constructor.
     * 
     * @param origin
     *            the origin
     * @param dest
     *            the destination
     */
    public Combination(Language origin, Language dest) {
        this.origin = origin;
        this.dest = dest;
    }

    /**
     * @return the origin
     */
    public Language origin() {
        return origin;
    }

    /**
     * @return the destination
     */
    public Language dest() {
        return dest;
    }

}
