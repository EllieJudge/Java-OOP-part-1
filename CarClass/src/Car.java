public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // Setter
    public void setModel(String model) {

        String validModel = model.toLowerCase();

        if(validModel.equals("porsche") || validModel.equals("holden")){ // .equals NOT ==
            this.model = model;
        } else {
           this.model = "Model Unknown";
        }
    }

    // Setter
    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    // Getter
    public String getModel() {
        return this.model; // Field
    }

    // Getter
    public int getDoors() {
        return this.doors; // Field
    }

}
