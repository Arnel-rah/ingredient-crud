package hei.school.ingredientcrud.Entity;

public class CategoryEntity {
    private int id;
    private String name;
    public CategoryEntity(int id, String name) {
      this.id = id;
      this.name = name;
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
    @Override
    public String toString() {
      return "CategoryEntity [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
          + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
