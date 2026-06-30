package model;
import lombok.Data;

@Data
public class Supplier {
    private int supplierID;
    private String supplierName;
    private String supplierAddress;
    private String supplierCityID;
    private String supplierContact;
    private String supplierComment;
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
