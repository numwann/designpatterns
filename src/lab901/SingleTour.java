package lab901;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeat,reserveSeats;

    public SingleTour(String name,double price,int allSeat){
        this.name = name;
        this.price = price;
        this.allSeat = allSeat;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAvailableSeat() {
        return this.allSeat - this.reserveSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAllSeat() {
        return allSeat;
    }

    public void setAllSeat(int allSeat) {
        this.allSeat = allSeat;
    }

    public int getReserveSeats() {
        return reserveSeats;
    }

    public void setReserveSeats(int reserveSeats) {
        this.reserveSeats = reserveSeats;
    }
}
