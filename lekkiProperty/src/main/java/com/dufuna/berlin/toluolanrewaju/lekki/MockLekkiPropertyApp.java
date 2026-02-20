package com.dufuna.berlin.toluolanrewaju.lekki;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;
import com.dufuna.berlin.toluolanrewaju.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.toluolanrewaju.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {
        // 1️⃣ Create a property
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId("1");
        property.setPropertyAddress("5 Lekki Street");
        property.setPropertyType("Duplex");

        // 2️⃣ Create the service
        LekkiPropertyService service = new MockLekkiPropertyService();

        // 3️⃣ Save the property
        service.saveProperty(property);

        // 4️⃣ Get a property
        LekkiProperty retrieved = service.getProperty();

        // 5️⃣ Print both properties
        System.out.println("Created Property: " + property);
        System.out.println("Retrieved Property: " + retrieved);
    }
}
