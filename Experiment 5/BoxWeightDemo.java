class Box {
    private float width;
    private float height;
    private float depth;

    public Box() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    public Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }

    public void displayVolume() {
        float volume = width * height * depth;
        System.out.println("Volume of Box: " + volume);
    }
}

class BoxWeight extends Box {
    private float weight;

    public BoxWeight() {
        super(); 
        this.weight = 0;
    }

    public BoxWeight(float width, float height, float depth, float weight) {
        super(width, height, depth);   
        this.weight = weight;
    }

    public BoxWeight(BoxWeight bw) {
        super(bw);    
        this.weight = bw.weight;
    }

    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    public void displayWeight() {
        System.out.println("Weight of Box: " + weight);
    }
}

public class BoxWeightDemo {
    public static void main(String[] args) {
        System.out.println("Kunal 24csu338");
        Box b1 = new Box();
        b1.setWidth(2);
        b1.setHeight(3);
        b1.setDepth(4);
        b1.displayVolume();

        Box b2 = new Box(5, 6, 7);
        b2.displayVolume();

        Box b3 = new Box(b2);
        b3.displayVolume();

        BoxWeight bw1 = new BoxWeight();
        bw1.setWidth(2);
        bw1.setHeight(2);
        bw1.setDepth(2);
        bw1.setWeight(5);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(3, 4, 5, 10);
        bw2.displayVolume();
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight(bw2);
        bw3.displayVolume();
        bw3.displayWeight();
    }
}
