/* Copyright (c) 2013 - 2017 Boundless - http://boundlessgeo.com All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package com.boundlessgeo.gsr.core.font;

import com.boundlessgeo.gsr.core.format.EnumTypeConverter;

/**
 *
 * @author Juan Marin, OpenGeo
 *
 */
public class FontDecorationEnumConverter extends EnumTypeConverter {

    public FontDecorationEnumConverter() {
        super(FontDecorationEnum.class);
    }

    @Override
    public String toString(Object obj) {
        String str = "";
        if (obj instanceof FontDecorationEnum) {
            FontDecorationEnum fontDecoration = (FontDecorationEnum) obj;
            switch (fontDecoration) {
            case LINE_THROUGH:
                str = "line-through";
                break;
            case NONE:
                str = "none";
                break;
            case UNDERLINE:
                str = "underline";
                break;
            }
        }
        return str;
    }
}
