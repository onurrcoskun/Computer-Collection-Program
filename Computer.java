package org.kodluyoruz;


public class Computer
{

    /**
     * anakart
     */
    private Hardware motherboard;

    /**
     * işlemci
     */
    private Hardware cpu;

    /**
     * RAM
     */
    private Hardware ram;

    /**
     * SSD

     */
    private Hardware ssd;

    /**
     * ekran kartı

     */
    private Hardware gpu;

    public double getTotalPrice()
    {


        return motherboard.getPrice()+cpu.getPrice()+ram.getPrice()+ssd.getPrice()+gpu.getPrice();
    }

    public int getTotalPower()
    {


        return motherboard.getPower()+cpu.getPower()+ram.getPower()+ssd.getPower()+gpu.getPower();
    }

    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }
}

