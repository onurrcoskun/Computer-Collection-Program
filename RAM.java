package org.kodluyoruz;


public class RAM extends Hardware
{
    private int memory;
    private int frequency;




    @Override
    public void setPrice(double price) {
        if(this.memory>16){
            price += (((this.memory - 16) / 4) * 100);
        }
        if(this.frequency>3600){
            price += (((this.frequency - 3600) / 400) * 200);
        }
        this.price=price;    }

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

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}

