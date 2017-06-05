/* Copyright (c) 2013 - 2017 Boundless - http://boundlessgeo.com All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package com.boundlessgeo.gsr.core.symbol;

/**
 *
 * @author Juan Marin, OpenGeo
 *
 */
public enum SimpleLineSymbolEnum {

    SOLID("esriSLSSolid"), //
    DASH("esriSLSDash"), //
    DOT("esriSLSDot"), //
    DASH_DOT("esriSLSDashDot"),
    DASH_DOT_DOT("esriSLSDashDotDot"), //
    NULL("esriSLSNull"), //
    INSIDE_FRAME("esriSLSInsideFrame");

    private final String style;

    public String getStyle() {
        return style;
    }

    private SimpleLineSymbolEnum(String style) {
        this.style = style;
    }
}
