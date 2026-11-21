//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Store store = new Store("My Store", 3);

        Product p1 = new Product("Notebook", 12.5, 3);
        Product p2 = new Product("Pen", 4.0, 2);
        Product p3 = new Product("Bottle", 30.0, 0);

        System.out.println("Add p1: " + store.addProduct(p1));
        System.out.println("Add p2: " + store.addProduct(p2));
        System.out.println("Add p3: " + store.addProduct(p3));

        Product p4 = new Product("Eraser", 2.5, 5);
        System.out.println("Add p4 (full): " + store.addProduct(p4));

        System.out.println("Sell 2 Notebooks: " + store.sellProduct(p1.getId(), 2));
        System.out.println("Sell 3 Pens: " + store.sellProduct(p2.getId(), 3));
        System.out.println("Sell 2 Pens: " + store.sellProduct(p2.getId(), 2));

        System.out.println("Set price -5: " + p1.setPrice(-5));
        System.out.println("Current p1 price: " + p1.getPrice());

        System.out.println("\nAvailable Products:");
        store.printAvailableProducts();

        System.out.println("\nSales Report:");
        store.printSalesReport();
        System.out.println("Total units sold: " + store.getTotalUnitsSold());

        System.out.println("\nProduct IDs:");
        System.out.println("p1 ID: " + p1.getId());
        System.out.println("p2 ID: " + p2.getId());
        System.out.println("p3 ID: " + p3.getId());
        System.out.println("p4 ID: " + p4.getId());
        System.out.println("Next ID: " + Product.getNextId());
    }
}