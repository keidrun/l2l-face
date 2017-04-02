/**
 * Copyright 2017 Keid
*/
package l2l.face.element;

/**
 * Combination of languages
 * 
 * @author Keid
 */
public class Combination {

    /**
     * Programming language before conversion
     */
    private Language from;

    /**
     * Programming language after conversion
     */
    private Language to;

    /**
     * Constructor
     * 
     * @param from
     *            a language before conversion
     * @param to
     *            a language after conversion
     */
    public Combination(Language from, Language to) {
        this.from = from;
        this.to = to;
    }

    /**
     * @return the from
     */
    public Language getFrom() {
        return from;
    }

    /**
     * @return the to
     */
    public Language getTo() {
        return to;
    }

}
