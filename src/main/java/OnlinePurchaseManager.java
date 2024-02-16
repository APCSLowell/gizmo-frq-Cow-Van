import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    /* to be implemented in part (a) */
    int a = 0;
    for (Gizmo g : purchases) {
      if (g.getMaker().equals(maker) && g.isElectronic()) {
        a++;
      }
    }

    return a;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    /* to be implemented in part (b) */
    for (int i = 1; i < purchases.size(); i++) {
      if (purchases.get(i).equals(purchases.get(i - 1))) {
        return true;
      }
    }

    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}

/*
  .--.            .--.
 ( (`\\."--``--".//`) )
  '-.   __   __    .-'
   /   /__\ /__\   \
  |    \ 0/ \ 0/    |
  \     `/   \`     /
   `-.  /-"""-\  .-`
     /  '.___.'  \
     \     I     /
      `;--'`'--;`
jgs     '.___.'
*/
