package OOP.Abstraction;

public class Interface_Intro implements printer, scanner  {

    @Override
    public void printing() {

    }

    @Override
    public void scanning() {

    }

    public static void main(String[] args) {

    }
}

interface printer{
   void printing();

   static void getInfo(){
       System.out.println("Test static method");
   }
}

interface scanner{
    void scanning();

}