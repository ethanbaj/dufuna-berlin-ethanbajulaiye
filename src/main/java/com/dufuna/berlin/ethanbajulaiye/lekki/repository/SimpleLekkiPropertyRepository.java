package com.dufuna.berlin.ethanbajulaiye.lekki.repository;

import com.dufuna.berlin.ethanbajulaiye.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty lekkiProperty, HashMap<Integer, LekkiProperty> propertyHashMap);
    LekkiProperty findById(int id, HashMap<Integer, LekkiProperty> propertyHashMap);
    ArrayList<LekkiProperty> findAll(ArrayList<LekkiProperty> propertyList, HashMap<Integer, LekkiProperty> propertyHashMap);
    void update(LekkiProperty lekkiProperty, HashMap<Integer, LekkiProperty> propertyHashMap);

}
