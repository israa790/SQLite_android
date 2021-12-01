package com.example.tp6_android_exercice1;

public class Product {
    //--------Attribute
    Integer Id;
    String Name;
    Integer Quantity;

    // -------------Constructor
    public Product() {
    }

    public Product(Integer id, String name, Integer quantity) {
        super();

        this.Id = id;
        this.Name = name;
        this.Quantity = quantity;
    }

    // --------------getters
    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return Name;
    }

    public Integer getQuantity() {
        return this.Quantity;
    }

    //--------------setters


    public void setId(Integer id) {
        this.Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}


