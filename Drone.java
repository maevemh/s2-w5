public class Drone {
    private int range;
  public static int totalBuilt = 0;
  public static int longRangeCount = 0;

  public Drone(int range) {
    this.range = range;
    totalBuilt++;
    if (range >= 50) {
      longRangeCount++;
    }
  }

  public int getRange() {
    return range;
  }
}

class Hangar {
  private Drone[] fleet;

  public Hangar(int[] ranges) {
    fleet = new Drone[ranges.length];
    for (int i = 0; i < ranges.length; i++) {
      fleet[i] = new Drone(ranges[i]);
    }
  }

  public Drone[] getFleet() {
    return fleet;
  }
}
 