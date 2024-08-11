package com.dufuna.berlin.ethanbajulaiye.lekki;

import com.dufuna.berlin.ethanbajulaiye.lekki.model.LekkiProperty;
import com.dufuna.berlin.ethanbajulaiye.lekki.service.MockLekkiPropertyService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class MockLekkiPropertyApp {

    public HashMap<Integer, LekkiProperty> propertyMap = new HashMap<>();
    public ArrayList<LekkiProperty> propertyList = new ArrayList<>();

    public static void main(String[] args) {
        HashMap<Integer, LekkiProperty> propertyMap = new HashMap<>();
        ArrayList<LekkiProperty> propertyList = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            LekkiProperty property = new LekkiProperty();

            System.out.println("Enter this property's ID: ");
            int propertyId = new Scanner(System.in).nextInt();
            property.setId(propertyId);
            System.out.println("Enter this property's address: ");
            String propertyAddress = new Scanner(System.in).nextLine();
            property.setAddress(propertyAddress);
            System.out.println("Enter this property's type: ");
            String propertyType = new Scanner(System.in).nextLine();
            property.setType(propertyType);




            MockLekkiPropertyService service = new MockLekkiPropertyService();
            service.saveProperty(property, propertyMap);
            System.out.println(service.getProperty(property.getId(), propertyMap));
        }
        MockLekkiPropertyService service = new MockLekkiPropertyService();
        System.out.println(service.getProperties(propertyList, propertyMap));


    }


}
