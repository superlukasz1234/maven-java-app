package pl.dev.app.model;

public class Address {
    // validacja czy nie ma znakow spec
    private String street;
    // tu niech będzie in
    private String houseNumber;
    // czy nie ma znakow spec
    private String city;

    public Address() {
    }

    public Address(String street, String houseNumber, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
