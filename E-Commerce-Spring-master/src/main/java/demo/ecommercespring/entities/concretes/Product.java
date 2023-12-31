package demo.ecommercespring.entities.concretes;

import jakarta.persistence.*;

@Entity //bir sınıfın JPA Entity olduğunu belirtir,yani veritabanında bir tabloyu temsil eder.
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    //@Column(name="category_id")
    //private int categoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

        @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;


    public Product() {

    }

    public Product(String productName, double unitPrice, short unitsInStock, String quantityPerUnit, Category category) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}