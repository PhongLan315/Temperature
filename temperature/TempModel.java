public class TempModel {
    
    //fields
    private double  cel;
    private double  fah;


    //connsrtuctor
    public TempModel(){}
    
    public TempModel(double cel, double fah) {
        this.cel = cel;
        this.fah = fah;
    }

    //method 
    public double f2c (){
        double cel;
        cel = 0.556 * (this.cel - 32);
        this.cel = cel;
        return cel;
    }

    public double c2f (){
        double fah;
        fah = 1.8 * (this.fah + 32);
        this.fah = fah;
        return fah;
    }



    //setter
    public void setCel(double cel) {
        this.cel = cel;
    }

    public void setFah(double fah) {
        this.fah = fah;
    }




    

}
