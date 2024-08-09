package com.dufuna.berlin.ethanbajulaiye.lekki.service;

import com.dufuna.berlin.ethanbajulaiye.lekki.model.LekkiProperty;

public class MockLekkiPropertyService {

    public void saveProperty(LekkiProperty lekkiProperty) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return new LekkiProperty();

    }
}
