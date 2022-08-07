package testdata;

import models.NewAccountModel;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {
    public static NewAccountModel getValidData() {
        return NewAccountModel.
                builder().
                accountName(FakeMessageGenerator.generateAccountName()).
                phone(FakeMessageGenerator.generatePhone()).
                fax(FakeMessageGenerator.generateFax()).
                type("Analyst").
                website(FakeMessageGenerator.generateWebsite()).
                industry("Banking").
                employees(FakeMessageGenerator.generateEmployees()).
                annualRevenue(FakeMessageGenerator.generateAnnualRevenue()).
                description(FakeMessageGenerator.generateDescription()).
                billingStreet(FakeMessageGenerator.generateStreet()).
                shippingStreet(FakeMessageGenerator.generateStreet()).
                billingCity(FakeMessageGenerator.generateCity()).
                billingStateOrProvince(FakeMessageGenerator.generateState()).
                shippingCity(FakeMessageGenerator.generateCity()).
                shippingStateOrProvince(FakeMessageGenerator.generateState()).
                billingZipOrPostalCode(FakeMessageGenerator.generateZipCode()).
                billingCountry(FakeMessageGenerator.generateCountry()).
                shippingZipOrPostalCode(FakeMessageGenerator.generateZipCode()).
                shippingCountry(FakeMessageGenerator.generateCountry()).
                build();
    }
}
