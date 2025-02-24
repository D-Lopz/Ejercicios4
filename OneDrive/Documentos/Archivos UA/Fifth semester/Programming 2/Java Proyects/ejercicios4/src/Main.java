abstract class FormaGeometrica {

    private String color;

    public FormaGeometrica(

            String colorParameter
    ) {
        this.color = colorParameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(

            String colorParameter
    ) {
        this.color = colorParameter;
    }

    abstract double areaCalculate();
}

class Rectangle extends FormaGeometrica {

    private double base, height;

    public Rectangle(

            String colorParameter,
            double baseParameter,
            double heightParameter

    ){
        super(colorParameter);
        this.base = baseParameter;
        this.height = heightParameter;
    }

    double areaCalculate(){

        return base * height;
    }
}

class Circle extends FormaGeometrica {

    private double radio;

    public Circle(
            String colorParameter,
            double radioParameter
    ){
        super(colorParameter);
        this.radio = radioParameter;
    }

    double areaCalculate(){

        return Math.PI * radio * radio;
    }
}

public class Main {
    public static void main(String[] args) {

        FormaGeometrica rectangle = new Rectangle(
                "Blue",
                5.2,
                5.8
        );
        FormaGeometrica circle = new Circle(
                "Red",
                7
        );

        System.out.println("El rectangulo de color: " + rectangle.getColor() + ", tiene un área de: " + rectangle.areaCalculate());
        System.out.println("El circulo de color: " + circle.getColor() + ", tiene un área de: " + circle.areaCalculate());
    }
}
