package com.dufuna.berlin.ethanbajulaiye.lekki.repository;

import com.dufuna.berlin.ethanbajulaiye.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {

    public LekkiProperty save(LekkiProperty lekkiProperty, HashMap<Integer, LekkiProperty> propertyMap) {
        propertyMap.put(lekkiProperty.getId(), lekkiProperty);
        return lekkiProperty;
    }

    public LekkiProperty findById(int id, HashMap<Integer, LekkiProperty> propertyMap) {
        return propertyMap.get(id);
    }

    public ArrayList<LekkiProperty> findAll(ArrayList<LekkiProperty> propertyList, HashMap<Integer, LekkiProperty> propertyMap) {
        propertyList.addAll(propertyMap.values());
        return propertyList;
    }

    public void update(LekkiProperty lekkiProperty, HashMap<Integer, LekkiProperty> propertyMap) {
        propertyMap.replace(lekkiProperty.getId(), lekkiProperty);
    }
}
