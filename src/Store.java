public class Store
{
    private String storeName;
    private Product[] products;
    private int[] soldCount;
    private int productCount;

    public Store(String storeName, int capacity)
    {
        this.storeName = storeName;
        this.products = new Product[capacity];
        this.soldCount = new int[capacity];
        this.productCount = 0;
    }
    public boolean addProduct(Product product)
    {
        if (product == null || this.productCount >= this.products.length)
        {
            return false;
        }
        if (findProductIndex(product.getId()) != -1)
        {
            return false;
        }
        this.products[this.productCount] = product;
        this.productCount++;
        return true;
    }

    public int findProductIndex(int id)
    {
        int index = -1;
        int i = 0;
        while (i < this.productCount)
        {
            if (this.products[i].getId() == id)
            {
                index = i;
                break;
            }
            i++;
        }
        return index;
    }

    public boolean sellProduct(int id, int quantity)
    {
        int index = findProductIndex(id);
        if (index == -1)
            return false;

        if (this.products[index].sell(quantity))
        {
            this.soldCount[index] += quantity;
            return true;
        }
        return false;
    }

    public void printAvailableProducts()
    {
        for (int i = 0; i < this.productCount; i++)
        {
            if (this.products[i].getStock() == 0)
                continue;
            System.out.println(this.products[i].getInfo());
        }
    }

    public void printSalesReport()
    {
        System.out.println("Store: " + this.storeName);
        for (int i = 0; i < this.productCount; i++)
            System.out.println(this.products[i].getName() + " - Sold: " + this.soldCount[i]);

    }

    public int getTotalUnitsSold()
    {
        int total = 0;
        for (int i = 0; i < this.productCount; i++)
        {
            total += this.soldCount[i];
        }
        return total;
    }

    public String getStoreName()
    {
        return this.storeName;
    }

    public int getProductCount()
    {
        return this.productCount;
    }
}
