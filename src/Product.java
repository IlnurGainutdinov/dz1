public class Product  {
   private String name;
   private double price;
   private double reiting;

   public Product(String name, double price, double reiting) {
      this.name = name;
      this.price = price;
      this.reiting = reiting;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getReiting() {
      return reiting;
   }

   public void setReiting(double reiting) {
      this.reiting = reiting;
   }

   @Override
   public String toString() {
      return "Product{" +
              "name='" + name + '\'' +
              ", price=" + price +
              ", reiting=" + reiting +
              '}';
   }
}
