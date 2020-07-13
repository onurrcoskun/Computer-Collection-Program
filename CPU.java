package org.kodluyoruz;


public class CPU extends Hardware
{
    private int cores;
    private int threads;




    @Override
    public void setPrice(double price) {
        if(cores>=6){
            price += (price * 0.3);
        }
        this.price=price;
    }

    @Override
    public double getPrice() {
        setPrice(this.price);
        return this.price;
    }
    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }
}
