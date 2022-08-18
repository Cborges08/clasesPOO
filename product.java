public class product {
    private int productCode;
    private String productName;
    private float productPrice;
    
    product(int NewProductCode, String NewProductName, float NewProductPrice) {
        this.productCode = NewProductCode;
        this.productName = NewProductName;
        this.productPrice = NewProductPrice;
    }

    public void setProductCode(int newProductCode) {
        this.productCode = newProductCode;
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }

    public void setProductPrice(float newProductPrice) {
        this.productPrice = newProductPrice;
    }

    public int getProductCode() {
        return this.productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public float getProductPrice() {
        return this.productPrice;
    }
}
