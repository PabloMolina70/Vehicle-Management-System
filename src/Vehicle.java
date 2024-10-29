public abstract class Vehicle implements Movable{
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand,String model,int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void move() {
    }

    public String showInfo(){
        return "The brand of the vehicle is: "+getBrand()+" ,the model is: "+getModel()
        +" ,the year is: "+getYear();
    }
}
