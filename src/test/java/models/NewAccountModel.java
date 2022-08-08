package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewAccountModel {

    private String accountName;
    private String phone;
    private String type;
    private String fax;
    private String website;
    private String industry;
    private String employees;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String billingStateOrProvince;
    private String shippingCity;
    private String shippingStateOrProvince;
    private String billingZipOrPostalCode;
    private String billingCountry;
    private String shippingZipOrPostalCode;
    private String shippingCountry;

}
