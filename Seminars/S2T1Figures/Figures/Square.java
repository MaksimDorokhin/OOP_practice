package Seminars.S2T1Figures.Figures;

public class Square extends Rectangle{

    public Square(int a) {
        super(a,a);
    }

    @Override
    public void getInfo() {
        System.out.println("Square properties:");
        super.getInfo();
    }
}
