package model;
import lombok.Data;

@Data
public class Good {
    int goodID;
    String goodName;
    String goodCategory;
    String goodBrand;
    float goodPrice;
    String goodComment;
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
