package com.dufuna.berlin.toluolanrewaju.lekki.repository;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save (LekkiProperty property);

    LekkiProperty findById (String propertyId);

    List<LekkiProperty> findAll() ;

    LekkiProperty update (LekkiProperty property);
}
