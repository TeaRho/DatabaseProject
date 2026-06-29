package model;
import lombok.Data;

@Data
public class Supplier {
    int supplierID;
    String supplierName;
    String supplierAddress;
    String supplierCityID;
    String supplierContact;
    String supplierComment;
    public Supplier(int supplierID, String supplierName, String supplierAddress, String supplierCityID, String supplierContact, String supplierComment) {
        super();
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierCityID = supplierCityID;
        this.supplierContact = supplierContact;
        this.supplierComment = supplierComment;
    }
}
