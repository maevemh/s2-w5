public class DroneMain {
    public static void main(String[] args) {
    int[] ranges1 = {40, 70, 55};
    Hangar h1 = new Hangar(ranges1); // Moment A
    

    Drone scout = new Drone(45);     // Moment B
    System.out.println(Drone.totalBuilt);

    int[] ranges2 = {90, 30};
    Hangar h2 = new Hangar(ranges2); // Moment C
    System.out.println(Drone.longRangeCount);
 }


    
}
