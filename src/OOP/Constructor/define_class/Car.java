package OOP.Constructor.define_class;

public class Car {
    int numOfWheel ;
    String color;
    String EngineType;
    String modelName;


    public Car (int numOfWheel, String color, String engineType, String modelName){
        this.numOfWheel = numOfWheel;
        this.color = color;
        this.EngineType = engineType;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numOfWheel=" + numOfWheel +
                ", color='" + color + '\'' +
                ", EngineType='" + EngineType + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
