/*    -*- Java -*-
 *
 *  Copyright 2012 Tail-F Systems AB. All rights reserved.
 *
 *  This software is the confidential and proprietary
 *  information of Tail-F Systems AB.
 *
 *  $Id$
 *
 */

package com.tailf.netconfmanager.yang.type;

/**
 * Implements the built-in YANG data type "string".
 * 
 * @author emil@tail-f.com
 */
public class YangString extends BaseString {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a YangString object from a java.lang.String.
     * 
     * @param value The Java String.
     */
    public YangString(String value) {
        super(value);
    }

    /**
     * Compares type of obj with this object to see if they can be equal.
     * 
     * @param obj Object to compare type with.
     * @return true if obj is an instance of YangString or java.lang.String;
     *         false otherwise.
     */
    @Override
    public boolean canEqual(Object obj) {
        return obj instanceof YangString || obj instanceof String;
    }

}