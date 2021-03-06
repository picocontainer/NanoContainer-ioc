/*****************************************************************************
 * Copyright (c) PicoContainer Organization. All rights reserved.            *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *                                                                           *
 * Original code by Leo Simons                                               *
 *****************************************************************************/
package org.nanocontainer.ioc.avalon;

/**
 * A subclass of {@link IllegalArgumentException} that can be thrown when an argument is null and that is not allowed.
 * 
 * @author <a href="lsimons at jicarilla dot org">Leo Simons</a>
 * @version $Revision$
 */
public class NullArgumentException extends IllegalArgumentException {
    /**
     * {@inheritDoc}
     * 
     * @param s {@inheritDoc}
     */ 
    public NullArgumentException(final String s) {
        super(s);
    }
}
