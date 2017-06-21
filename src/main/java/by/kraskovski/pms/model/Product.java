package by.kraskovski.pms.model;

import by.kraskovski.pms.model.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Description database table "user"
 */
@Entity
public class Product extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private double cost;
    private String type;
    private String details;
    private String image;
    private double width;
    private double height;
    private double weight;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<ProductStock> productStocks = new HashSet<>();

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public String getDetails() {
        return details;
    }

    public String getImage() {
        return image;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Transient
    public Set<ProductStock> getProductStocks() {
        return productStocks;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCost(final double cost) {
        this.cost = cost;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setDetails(final String details) {
        this.details = details;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public void setProductStocks(Set<ProductStock> productStocks) {
        this.productStocks = productStocks;
    }
}
