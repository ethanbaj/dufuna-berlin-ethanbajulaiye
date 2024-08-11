package com.dufuna.berlin.ethanbajulaiye.lekki.service;

import com.dufuna.berlin.ethanbajulaiye.lekki.model.LekkiProperty;
import com.dufuna.berlin.ethanbajulaiye.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.HashMap;

public interface LekkiPropertyService {
        LekkiProperty saveProperty(LekkiProperty lekkiProperty, HashMap<Integer, LekkiProperty> propertyHashMap);
        LekkiProperty getProperty(int id, HashMap<Integer, LekkiProperty> propertyHashMap);
    }


