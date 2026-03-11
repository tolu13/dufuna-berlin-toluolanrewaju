package com.dufuna.berlin.toluolanrewaju.lekki.service;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);
    LekkiProperty getProperty(String propertyId);
    List<LekkiProperty> getProperties();
}
