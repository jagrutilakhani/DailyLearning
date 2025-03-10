public class Animal {
    protected String type;
    private  String size;
    private double wight;

    public Animal(){

    }

    public Animal(String type, String size, double wight) {
        this.type = type;
        this.size = size;
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", wight=" + wight +
                '}';
    }
    public void  move(String speed){
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " make some kind of noise "
        );
    }
}
