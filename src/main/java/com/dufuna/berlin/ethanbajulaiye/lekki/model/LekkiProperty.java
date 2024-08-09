package com.dufuna.berlin.ethanbajulaiye.lekki.model;

public class LekkiProperty {

        private int id;
        private String address;
        private String type;
        private int numOfBedrooms;
        private int numOfSittingRooms;
        private int numOfKitchens;
        private int numOfBathrooms;
        private int numOfToilets;
        private String owner;
        private String description;
        private String validFrom;
        private String validTo;

        //constructor
        public LekkiProperty() {
            id = 0;
            address = "";
            type = "";
            numOfBedrooms = 0;
            numOfSittingRooms = 0;
            numOfKitchens = 0;
            numOfBathrooms = 0;
            numOfToilets = 0;
            owner = "";
            description = "";
            validFrom = "";
            validTo = "";

        }

        //Id
        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
//address

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }
//type

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
//bedrooms

        public void setNumOfBedrooms(int numOfBedrooms) {
            this.numOfBedrooms = numOfBedrooms;
        }

        public int getNumOfBedrooms() {
            return numOfBedrooms;
        }
//sitting rooms

        public void setNumOfSittingRooms(int numOfSittingRooms) {
            this.numOfSittingRooms = numOfSittingRooms;
        }

        public int getNumOfSittingRooms() {
            return numOfSittingRooms;
        }
//kitchens

        public void setNumOfKitchens(int numOfKitchens) {
            this.numOfKitchens = numOfKitchens;
        }

        public int getNumOfKitchens() {
            return numOfKitchens;
        }
//bathrooms

        public void setNumOfBathrooms(int numOfBathrooms) {
            this.numOfBathrooms = numOfBathrooms;
        }

        public int getNumOfBathrooms() {
            return numOfBathrooms;
        }
//toilets

        public void setNumOfToilets(int numOfToilets) {
            this.numOfToilets = numOfToilets;
        }

        public int getNumOfToilets() {
            return numOfToilets;
        }

        //owner
        public void setOwner(String owner) {
            this.owner = owner;
        }

        public String getOwner() {
            return owner;
        }
//description

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
//valid from

        public void setValidFrom(String validFrom) {
            this.validFrom = validFrom;
        }

        public String getValidFrom() {
            return validFrom;
        }
//valid to

        public void setValidTo(String validTo) {
            this.validTo = validTo;
        }

        public String getValidTo() {
            return validTo;
        }

        @Override
        public String toString() {
            return this.id + ", " + this.address + ", " + this.type;
        }

        @Override
        public boolean equals(Object property) {
            if (property == this) {
                return true;
            }
            if (!(property instanceof LekkiProperty)) {
                return false;
            }

            return this.id == ((LekkiProperty) property).id;
        }

        @Override
        public int hashCode() {
            return this.id;
        }
}

