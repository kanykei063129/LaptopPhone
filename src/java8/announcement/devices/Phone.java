package java8.announcement.devices;

import java8.announcement.Announcement;

public class Phone extends Announcement {
    private  String product;
    private  int  memory;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Phone(String name, String image, double price, String description,String product,int memory) {
        super(name, image, price, description);
        this.product = product;
        this.memory = memory;

    }

    @Override
    public String toString() {
        return "Phone{" +
                super.toString()+
                "product='" + product + '\'' +
                ", memory=" + memory +
                '}';
    }
}
