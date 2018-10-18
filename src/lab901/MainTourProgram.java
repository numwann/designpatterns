package lab901;

public class MainTourProgram {
    public static void main(String[] args) {
        Tour KasetTour = new SingleTour("Kaset Tour",200,50);
        Tour rab11 = new SingleTour("Rab11 Tour",0,100);
        Tour jaoChet = new SingleTour("JaoChet Tour",0,100);
        Tour m44Tour = new PackageTour("KorSorChorTour");
        ((PackageTour) m44Tour).addTour(jaoChet);
        ((PackageTour) m44Tour).addTour(rab11);
        System.out.println(((SingleTour) KasetTour).getAllSeat());


    }
}
