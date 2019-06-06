package Design_Pattern.Creational_Patterns.Prototype.Contract;


public interface PrototypeCapable extends Cloneable{

    PrototypeCapable clone() throws CloneNotSupportedException;
}
