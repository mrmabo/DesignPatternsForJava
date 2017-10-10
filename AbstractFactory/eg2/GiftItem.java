package AbstractFactory.eg2;

public class GiftItem {
    private Packaging packaging;
    private String giftId;
    private String giftName;
    private String description;
    private String packagingType; //"bag", "box", or "wrap".

    public GiftItem(Packaging packaging, String giftId, String giftName, String description, String packagingType) {
        this.packaging = packaging;
        this.giftId = giftId;
        this.giftName = giftName;
        this.description = description;
        this.packagingType = packagingType;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }


}
