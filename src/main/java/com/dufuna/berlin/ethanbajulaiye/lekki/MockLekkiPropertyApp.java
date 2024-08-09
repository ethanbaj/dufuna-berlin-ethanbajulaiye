package com.dufuna.berlin.ethanbajulaiye.lekki;

import com.dufuna.berlin.ethanbajulaiye.lekki.model.LekkiProperty;
import com.dufuna.berlin.ethanbajulaiye.lekki.service.MockLekkiPropertyService;


public class MockLekkiPropertyApp {
    public static void main(String[] args) {

        LekkiProperty property = new LekkiProperty();
        MockLekkiPropertyService service = new MockLekkiPropertyService();
        service.saveProperty(property);
        service.getProperty();

    }


}
