public class Star{
  public final String GALAXY_BELONGS;
  private static int numberOfStars = 0;

  public Star(String galaxy){
    GALAXY_BELONGS = galaxy;
  }

  public void increaseNumStars(){
    numberOfStars++;
  }

  public static int getNumberOfStars(){
    return numberOfStars;
  }
}