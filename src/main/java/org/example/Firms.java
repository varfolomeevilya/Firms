package org.example;

public class Firms  {

    private int bids;
    private int hourly;
    private int piecework;
    private int total;
    public Firms(){
        this.bids= 3000;
        this.hourly=800;
        this.piecework=5500;
    }
    public Firms(int bids, int hourly, int piecework){
        this.bids=bids;
        this.hourly=hourly;
        this.piecework=piecework;
    }
    public int getBids() {
        return bids;
    }
    public int getTotal(){
        return total;
    }
    public int getTotal(Firms firms) {
        return firms.getBids()+ firms.getHourly()+ firms.getPiecework();
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public void setBids(int bids) {
        this.bids = bids;
    }
    public int getHourly() {
        return hourly;
    }

    public void setHourly(int hourly) {
        this.hourly = hourly;
    }
    public int getPiecework() {
        return piecework;
    }

    public void setPiecework(int piecework) {
        this.piecework = piecework;
    }

}
