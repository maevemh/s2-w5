import java.util.*;

public class Universe{

  public Universe(){
    ArrayList<String> galaxies = new ArrayList<String>();
    galaxies.add("Andromeda");
    galaxies.add("Bodes");
    galaxies.add("CartWheel");
    galaxies.add("Milky Way");

    ArrayList<Star> stars =new ArrayList<Star>();
    Star s;
    for(String g: galaxies){
      for (int x = 0; x < 10; x++){
        s = new Star(g);
        s.increaseNumStars();
        stars.add(s);
      }
      System.out.println(stars.get(stars.size() - 1).getNumberOfStars());
    }

    System.out.println(stars.get(0).getNumberOfStars());
    System.out.println(stars.get(10).getNumberOfStars());
    System.out.println(Star.getNumberOfStars());
    System.out.println(stars.get((int)(Math.random()*stars.size())).getNumberOfStars());
    System.out.println(stars.get(stars.size() - 1).getNumberOfStars());
  }

}