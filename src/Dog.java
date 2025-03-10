public class Dog extends Animal{

    private String earShape;
    private  String tailShape;

    public Dog() {
        super("mutt", "big", 50);
    }
    public Dog(String type, double weight){
        this(type, weight, "perky", "Curled");
    }

    public Dog(String type, double wight, String earShape, String tailShape) {
        super(type, wight < 15 ? "small" : (wight < 35 ? "Medium" : "Lagre"), wight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();

    }

    public Dog(String type, String size, double wight) {
        super(type, size, wight);
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("dog walk, run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    public void makeNiose(){
        if (type == "wolf"){
            System.out.println("ow wooooo! ");
        }
        bark();
        System.out.println();

    }
    private void bark(){
        System.out.println("woof! ");
    }
    private void run(){
        System.out.println("dog running ");
    }
    private void walk(){
        System.out.println("dog walking");
    }
    private void wagTail(){
        System.out.println("Tail wagging");
    }
}
