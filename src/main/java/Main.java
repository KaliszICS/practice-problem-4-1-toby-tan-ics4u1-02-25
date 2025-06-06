public class Main {
    public static void main(String[] args) {
        // You can test the classes here
    }
}

// Rectangle class
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

// Circle class
class Circle {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }
}

// Person class
class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColour;
    private String hairColour;

    public Person(String name, int age, int height, int weight, String eyeColour, String hairColour) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }
}
