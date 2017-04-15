package com.company;

import java.util.List;

/**
 * Created by arahis on 4/16/17.
 */
public class Data {
    private String name;
    private String surname;
    private List<String> phones;
    private List<String> sites;
    private Address address;

    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getSites() {
        return sites;
    }

    public void setSites(List<String> sites) {
        this.sites = sites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + phones +
                ", sites=" + sites +
                ", adress=" + address +
                '}';
    }

    private class Address {
        private String country;
        private String city;
        private String street;

        public Address() {
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public String toString() {
            return "Adress{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }
}