package temperature;
public class TempConverter {
    //field
    private double cel, fah;

    //constructor
    public TempConverter(){}

    /**
     * @param cel
     * @param fah
     */
    public TempConverter(double cel, double fah) {
        this.cel = cel;
        this.fah = fah;
    }


    //method
    public double f2c(){
        double cel;
        cel = 0.556 * (this.fah - 32);
        this.cel = cel;
        return cel;
    }

    public double c2f(){
        double fah;
        fah = 1.8 * (this.cel + 32);
        this.fah = fah;
        return fah;
    }


    /**
     * @param cel the cel to set
     */
    public void setCel(double cel) {
        this.cel = cel;
    }

    /**
     * @param fah the fah to set
     */
    public void setFah(double fah) {
        this.fah = fah;
    }
}
