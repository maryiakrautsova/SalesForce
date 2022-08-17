package testdata;

import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {
    private static final Logger LOGGER = LogManager.getLogger(PrepareNewAccountData.class.getName());

    public static NewAccountModel getValidData() {
        LOGGER.debug(String.format("Attempt to get generated data for new account."));
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
