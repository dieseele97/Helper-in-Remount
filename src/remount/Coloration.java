package remount;

public class Coloration {
   public double wigth;
   public double length;
   public double height;
   public double result=0;

    public Coloration(double wigth, double length, double height) {
        this.wigth = wigth;
        this.length = length;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    } 
       
   public void CalculateColor(){
     double res=(length*wigth*height)/14;
     result=res;
   }        
}
