package com.dufuna.berlin.ethanbajulaiye.lekki.service;

import com.dufuna.berlin.ethanbajulaiye.lekki.model.LekkiProperty;
import com.dufuna.berlin.ethanbajulaiye.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.ArrayList;
import java.util.HashMap;

public class MockLekkiPropertyService implements LekkiPropertyService {

    public LekkiProperty saveProperty(LekkiProperty lekkiProperty, HashMap<Integer, LekkiProperty> propertyHashMap) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        return new SimpleLekkiPropertyRepositoryImpl().save(lekkiProperty, propertyHashMap);
    }

    public LekkiProperty getProperty(int id, HashMap<Integer, LekkiProperty> propertyHashMap) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return new SimpleLekkiPropertyRepositoryImpl().findById(id, propertyHashMap);
    }

    public ArrayList<LekkiProperty> getProperties(ArrayList<LekkiProperty> propertyList, HashMap<Integer, LekkiProperty> propertyHashMap) {
        return new SimpleLekkiPropertyRepositoryImpl().findAll(propertyList, propertyHashMap);
    }
}
