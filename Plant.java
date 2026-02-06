public class Plant{
    public static final boolean usesChlorophyll=true;
    private static int numplants= 0;
    private final String species;
    private int age;
    private String name;
    private double height;

    public Plant (String name, String species){
          age = 0;
          this.name = name;
          height = 0;
          
          numplants++;
         
    }

    public String type(){
         return "I am a plant and my name is: " + this.name;
         this.species = "";
    }

    public void increaseAge(int years){
         age +=years;
    }

    public String name(){
        return name;
    }
    public int age(){
        return age;
    }
    public static int getNumPlants(){
        return numplants;
   }
}
