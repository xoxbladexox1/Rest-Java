package com.example.prueba.models;

import javax.xml.bind.annotation.XmlEnumValue;

public enum PruebaEnum {

	 @XmlEnumValue("Portal Empresa")
	    PORTAL_EMPRESA("Portal Empresa");
	
	 private final String value;
	PruebaEnum(String v) {
        value = v;
    }
}
