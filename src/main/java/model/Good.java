package model;
import lombok.Data;

@Data
public class Good {
    private int goodID;
    private String goodName;
    private String goodCategory;
    private String goodBrand;
    private float goodPrice;
    private String goodComment;
    public Good(int goodID, String goodName, String goodCategory, String goodBrand, float goodPrice, String goodComment) {
        super();
        this.goodID = goodID;
        this.goodName = goodName;
        this.goodCategory = goodCategory;
        this.goodBrand = goodBrand;
        this.goodPrice = goodPrice;
        this.goodComment = goodComment;
    }
}
