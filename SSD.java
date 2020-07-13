package org.kodluyoruz;


public class SSD extends Hardware
{
    private int memory;


    @Override
    public void setPrice(double price) {
        if(this.memory>750){
            price += (((this.memory - 750) / 250) * 275);
        }
        this.price=price;
    }

    @Override
    public double getPrice() {
        setPrice(this.price);
        return this.price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
