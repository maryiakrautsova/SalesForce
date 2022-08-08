package utils;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {
    public static String generateAccountName() {
        return new Faker().company().name();
    }

    public static String generatePhone() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateFax() {
        return new Faker().phoneNumber().cellPhone();
    }

    public static String generateWebsite() {
        return new Faker().internet().url();
    }

    public static String generateEmployees() {
        return new Faker().numerify("##");
    }

    public static String generateAnnualRevenue() {
        return new Faker().numerify("######");
    }

    public static String generateDescription() {
        return new Faker().lorem().sentence();
    }

    public static String generateStreet() {
        return new Faker().address().streetAddress();
    }

    public static String generateState() {
        return new Faker().address().state();
    }

    public static String generateCountry() {
        return new Faker().address().country();
    }

    public static String generateCity() {
        return new Faker().address().cityName();
    }

    public static String generateZipCode() {
        return new Faker().address().zipCode();
    }
}
