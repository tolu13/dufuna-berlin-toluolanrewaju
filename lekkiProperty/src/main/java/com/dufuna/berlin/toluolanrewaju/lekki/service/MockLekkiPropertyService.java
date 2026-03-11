package com.dufuna.berlin.toluolanrewaju.lekki.service;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService{

   // private LekkiProperty savedProperty;

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
       return property;
    }

    @Override
    public LekkiProperty getProperty(String propertyId) {
        System.out.println("MockLekkiPropertyService.getProperty called");
       // return this.savedProperty;
        // return a dummy property
        LekkiProperty dummy = new LekkiProperty();
        dummy.setPropertyId("999");
        dummy.setPropertyAddress("Mock Address");
        dummy.setPropertyType("Mock House");
        return dummy;
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return List.of();
    }
}
