package com.alexandrov.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "country"
})
@XmlRootElement(name = "getCountryResponse")
public class GetCountryResponse {

    @XmlElement(required = true)
    protected io.spring.guides.gs_producing_web_service.Country country;

    public io.spring.guides.gs_producing_web_service.Country getCountry() {
        return country;
    }

    public void setCountry(io.spring.guides.gs_producing_web_service.Country value) {
        this.country = value;
    }

}