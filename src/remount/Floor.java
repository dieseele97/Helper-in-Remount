package remount;

public class Floor {
   public double wigth;
   public double length;
   public double wigth_lino;
   public double length_lino;
   public double result=0;

    public Floor(double wigth, double length, double wigth_lino, double length_lino) {
        this.wigth = wigth;
        this.length = length;
        this.wigth_lino = wigth_lino;
        this.length_lino = length_lino;
    }

    public double getWigth() {
        return wigth;
    }

    public void setWigth(double wigth) {
        this.wigth = wigth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWigth_lino() {
        return wigth_lino;
    }

    public void setWigth_lino(double wigth_lino) {
        this.wigth_lino = wigth_lino;
    }

    public double getLength_lino() {
        return length_lino;
    }

    public void setLength_lino(double length_lino) {
        this.length_lino = length_lino;
    }
    public void CalculateLino(){
    double res=wigth*length;
    double res2=wigth_lino*length_lino;
    double res3=res/res2;
    result=res3;
}
}
