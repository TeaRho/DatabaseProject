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
    public Good() {}
}
