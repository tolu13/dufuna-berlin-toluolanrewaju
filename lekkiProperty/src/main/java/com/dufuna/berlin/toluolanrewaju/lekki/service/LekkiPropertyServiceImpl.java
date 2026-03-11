package com.dufuna.berlin.toluolanrewaju.lekki.service;

import com.dufuna.berlin.toluolanrewaju.lekki.model.LekkiProperty;
import com.dufuna.berlin.toluolanrewaju.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.toluolanrewaju.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class LekkiPropertyServiceImpl implements LekkiPropertyService{

    private SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        return repository.save(property);
    }

    @Override
    public LekkiProperty getProperty(String propertyId) {
        return repository.findById(propertyId);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return repository.findAll();
    }
}
