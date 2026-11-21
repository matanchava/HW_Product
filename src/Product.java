public class Product
{
    private int id;
    private String name;
    private double price;
    private int stock;
    static int nextId = 1000;

    public Product(String name, double price,int stock)
    {
        this.id = nextId++;
        if (name == null)
            this.name = "Unknown";
        else
            this.name = name;

        if (price <= 0)
            this.price = 1.0;
         else
            this.price = price;

        if (stock < 0)
            this.stock = 0;
         else
            this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name)
    {
        if (name != null && !name.trim().isEmpty())
            this.name = name.trim();
    }
    public boolean setPrice(double price)
    {
        if (price > 0)
        {
            this.price = price;
            return true;
        }
        return false;
    }
    public boolean sell(int quantity)
    {
        if (quantity > 0 && quantity <= this.stock)
        {
            this.stock -= quantity;
            return true;
        }
        return false;
    }

    public String getInfo()
    {
        return "ID: " + this.id + ", Name: " + this.name + ", Price: " + this.price + ", Stock: " + this.stock;
    }

    public static int getNextId()
    {
        return nextId;
    }
}