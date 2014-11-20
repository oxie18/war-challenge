package war;

public class Main {

  public static void main(String... args) {
    new Main().go();
  }

  private void go() {
    final int wars = 1000;
    int battles = 0;
    for (int i = 0; i < wars; i++) {
      War war = new War("Clinton", "Jim");
      String winner = war.start();
      battles += war.getBattles();
      //System.out.println(winner + " wins the War in " + gameofwar.getBattles() + " Battles.");
      if (i % 1000 == 0) {
        if (i % 40000 == 0) {
          System.out.println();
        }
        System.out.print(".");
      }
    }
    System.out.println("\nAverage Battles per War: " + ((float)battles / (float)wars));
  }

}

