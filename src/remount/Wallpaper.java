package remount;

public class Wallpaper {
   public double wigth;
   public double length;
   public double height;
   public double wall_wigth;
   public double wall_length;
   public double result=0;

    public Wallpaper(double wigth, double length, double height, double wall_wigth, double wall_length) {
        this.wigth = wigth;
        this.length = length;
        this.height = height;
        this.wall_wigth = wall_wigth;
        this.wall_length = wall_length;
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

    public double getWall_wigth() {
        return wall_wigth;
    }

    public void setWall_wigth(double wall_wigth) {
        this.wall_wigth = wall_wigth;
    }

    public double getWall_length() {
        return wall_length;
    }

    public void setWall_length(double wall_length) {
        this.wall_length = wall_length;
    }
    public void CalculateWallpaper(){
    double res=(wigth+length)*2;
    double res1=res/wall_wigth;
    double res2=wall_length/(height+0.05);
    double res3=res1/res2;
    result= res3;          
    }    
}
