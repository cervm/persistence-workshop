package model;

/**
 * Created by jakub on 29/03/2017.
 */
public class Variant {
    private int vid;
    private Product product;
    private int quantity;

    public Variant(int vid, Product product, int quantity) {
        this.vid = vid;
        this.product = product;
        this.quantity = quantity;
    }

    public int getVid() {
        return vid;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
