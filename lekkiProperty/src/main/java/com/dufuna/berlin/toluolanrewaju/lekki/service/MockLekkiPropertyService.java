package com.dufuna.berlin.toluolanrewaju.lekki.service;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService{

    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        // return a dummy property
        LekkiProperty dummy = new LekkiProperty();
        dummy.setPropertyId("999");
        dummy.setPropertyAddress("Mock Address");
        dummy.setPropertyType("Mock House");
        return dummy;
    }
}
