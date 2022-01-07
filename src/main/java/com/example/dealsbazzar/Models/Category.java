package com.example.dealsbazzar.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@Document(collection = "Category")
public class Category {
    @Id
    private String cId;
    private String productCategory;
    private String productMeasurement;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "Category [cId=" + cId + ", productCategory=" + productCategory + ", productMeasurement="
                + productMeasurement + "]";
    }

    

}
