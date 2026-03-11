package com.dufuna.berlin.toluolanrewaju.lekki.repository;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl  implements SimpleLekkiPropertyRepository{
    private Map <String, LekkiProperty> propertyMap = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty property) {
       propertyMap.put(property.getPropertyId(), property);
       return property;
    }

    @Override
    public LekkiProperty findById(String propertyId) {
        return propertyMap.get(propertyId);
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(propertyMap.values());
    }

    @Override
    public LekkiProperty update(LekkiProperty property) {
       propertyMap.put(property.getPropertyId(), property);
       return property ;
    }
}
