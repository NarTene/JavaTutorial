package OOP;

public class Car {
        int modelYear;
        String modelName;

        public Car(int year, String name) {
            this.modelYear = year;
            this.modelName = name;
        }

        public static void main(String[] args) {
            Car myCar = new Car(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }

}
