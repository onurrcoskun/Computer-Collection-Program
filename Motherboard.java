package org.kodluyoruz;


public class Motherboard extends Hardware
{
    private String cpuArchitect;
    private Boolean wifiIncluded=false;
    private Boolean bluetoothIncluded=false;



    @Override
    public void setPrice(double price) {

        if(wifiIncluded){
            price += 250d;
        }

        if(bluetoothIncluded){
            price += 100d;
        }

        this.price=price;
    }

    @Override
    public double getPrice() {
        setPrice(this.price);
        return this.price;
    }

    public String getCpuArchitect() {
        return cpuArchitect;
    }

    public void setCpuArchitect(String cpuArchitect) {
        this.cpuArchitect = cpuArchitect;
    }

    public Boolean getWifiIncluded() {
        return wifiIncluded;
    }

    public void setWifiIncluded(Boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public Boolean getBluetoothIncluded() {
        return bluetoothIncluded;
    }

    public void setBluetoothIncluded(Boolean bluetoothIncluded) {
        this.bluetoothIncluded = bluetoothIncluded;
    }
}
