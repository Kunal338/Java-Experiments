class Student {
    private String name;
    private int roll_no;

    public Student() {
        this.name = "John";   
        this.roll_no = 2;
    }


    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no);
    }

    public static void main(String[] args) {
        System.out.println("kunal" + " 24csu338");
        Student s1 = new Student();
        s1.display();
    }
}
