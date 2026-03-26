package hei.school.ingredientcrud.Entity;

import java.time.Instant;


public class ProductEntity {
    private int id;
    private String name;
    private Instant creationDateTime;
    private CategoryEntity category;

    public ProductEntity(int id, String name, Instant creationDateTime, CategoryEntity category) {
      this.id = id;
      this.name = name;
      this.creationDateTime = creationDateTime;
      this.category = category;
    }
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public Instant getCreationDateTime() {
      return creationDateTime;
    }
    public void setCreationDateTime(Instant creationDateTime) {
      this.creationDateTime = creationDateTime;
    }
    public CategoryEntity getCategory() {
      return category;
    }
    public void setCategory(CategoryEntity category) {
      this.category = category;
    }

    public String getCategoryName() {
        return category.getName();
    }
    @Override
    public String toString() {
      return "ProductEntity [id=" + id + ", name=" + name + ", creationDateTime=" + creationDateTime + ", category="
          + category + ", getId()=" + getId() + ", getName()=" + getName() + ", getCreationDateTime()="
          + getCreationDateTime() + ", getCategory()=" + getCategory() + ", getCategoryName()=" + getCategoryName()
          + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
  }
