public class PlantMain {
    public static void main(String[] args) {
        boolean v = Plant.usesChlorophyll;
        Plant p = new Plant("rose", "c");
        System.out.println(p.getNumPlants());
        System.out.println(Plant.getNumPlants());
         Plant p1 = new Plant("rose", "c");
        System.out.println(p1.getNumPlants());
        Plant p2 = new Plant("rose", "c");
        System.out.println(p2.getNumPlants());
        System.out.println(Plant.getNumPlants());

    }
    
}
