package OOP.Inheritance.Polymorphism;

public class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        //Figure.Rectangle rectangle = new Figure.Rectangle(9, 5);
       // Triange triangle = new Figure.Triangle(10, 8);

        Figure fi = figure;
        System.out.println("Area is " + fi.area());

       // fi = rectangle;
        System.out.println("Area is " + fi.area());
      //  fi = triangle;
        System.out.println("Area is "+ fi.area());
    }

}

 class Figure{
    double dimOne;
    double dimTwo;

    public Figure(double dimOne, double dimTwo){
        this.dimOne = dimOne;
        this.dimTwo = dimTwo;
    }

    double area(){
        System.out.println("area for the figure is undefined");
        return 0;
    }


    class Rectangle extends Figure {
        public Rectangle(double dimOne, double dimTwo){
            super(dimOne, dimTwo);
        }

        //Ocerride the area method in figure class

        double area(){
            System.out.println(" Inside area for rRectangle");
            return dimOne*dimTwo;
        }
    }

    class Triangle extends Figure{
        public Triangle(double dimOne, double dimTwo){
            super(dimOne, dimTwo);

        }

        //Override area method

        double area(){
            System.out.println("Inside area for Triangle");
            return dimOne*dimTwo;
        }
    }
}

