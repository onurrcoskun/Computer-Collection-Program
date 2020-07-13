package org.kodluyoruz;


public class GPU extends Hardware
{
    private int memory;
    private int bits;




    @Override
    public void setPrice(double price) {
        if(this.memory>8){
            price += (((this.memory - 8) / 2) * 250);
        }
        if(this.bits>128){
            price += (((this.bits - 128) / 64) * 400);
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

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }
}
