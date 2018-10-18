package lab901;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private int allSeat,reserveSeats;
    public PackageTour (String packageName){
        this.packageName = packageName;
    }
    public void addTour(Tour t){
        tours.add(t);
    }
    @Override
    public String getName() {
        return this.packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(Tour t:tours)
            total += t.getPrice();
        return total*0.9;
    }

    @Override
    public int getAvailableSeat() {
        return this.allSeat - this.reserveSeats;
    }


}
