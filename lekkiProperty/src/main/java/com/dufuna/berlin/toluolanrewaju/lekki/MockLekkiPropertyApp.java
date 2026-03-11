package com.dufuna.berlin.toluolanrewaju.lekki;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;
import com.dufuna.berlin.toluolanrewaju.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.toluolanrewaju.lekki.service.LekkiPropertyServiceImpl;


import java.util.List;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {
        // create the service
        LekkiPropertyService service = new LekkiPropertyServiceImpl();
        // 1️⃣ Create a property
        for (int i = 1; i <=5;  i++){
           LekkiProperty property = new LekkiProperty();
           property.setPropertyId(String.valueOf(i));
           property.setPropertyAddress("Lekki Street" + i);
           property.setPropertyType("Duplex");

           //save the property
           service.saveProperty(property);
        }


        // 4️⃣ Get a property
        LekkiProperty singleProperty = service.getProperty("2");
        System.out.println("Single Property: " + singleProperty);

        // 5️⃣ Print all properties
        List<LekkiProperty> allProperties = service.getProperties();
        System.out.println("All Properties:");
        for (LekkiProperty p : allProperties) {
            System.out.println(p);
        }

    }
}
