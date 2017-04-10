package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
{
  "name": "...",
  "surname": "...",
  "phones": [
    "044-256-78-90",
    "066-123-45-67"
  ],
  "sites": [
    "http://site1.com",
    "http://site2.com"
  ],
  "address": {
    "country": "...",
    "city": "...",
    "street": "..."
  }
}
 */
public class Main {
private static final String JSON = "{\n" +
        "  \"name\": \"...\",\n" +
        "  \"surname\": \"...\",\n" +
        "  \"phones\": [\n" +
        "    \"044-256-78-90\",\n" +
        "    \"066-123-45-67\"\n" +
        "  ],\n" +
        "  \"sites\": [\n" +
        "    \"http://site1.com\",\n" +
        "    \"http://site2.com\"\n" +
        "  ],\n" +
        "  \"address\": {\n" +
        "    \"country\": \"...\",\n" +
        "    \"city\": \"...\",\n" +
        "    \"street\": \"...\"\n" +
        "  }\n" +
        "}";

    public static void main(String[] args) {
        Gson gson = new Gson();

            Data parsedData = gson.fromJson(JSON, Data.class);
            System.out.println(parsedData.toString());

    }

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
}
