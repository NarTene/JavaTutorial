package OOP.AccessModifiers;

public class Private_Access_Modifier {

    private void privateTest (){
        System.out.println(" This is the private access modifier test");
    }

    }


    class Second {


        public static void main(String[] args) {
            Private_Access_Modifier obj = new Private_Access_Modifier();

            // Trying to access a method of a private class, this will produce an error
            // because private method is only accessed within the its class.
            //obj.privateTest();
        }

   }

