package com.Invoice.models;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
public class Detail {
   private Integer quantity;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   private  Product product;

   public Detail(Integer quantity, Product product) {
      this.quantity = quantity;
      this.product = product;
   }

   public Detail(){
      super();
   }

   public Integer getQuantity() {
      return quantity;
   }

   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   public Product getProduct() {
      return product;
   }

   public void setProduct(Product product) {
      this.product = product;
   }

   @Override
   public String toString() {
      return "Detail{" +
              "quantity=" + quantity +
              ", product=" + product +
              '}';
   }
}
