import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class CD {
  private String mName;
  private static List<CD> instances = new ArrayList<CD>();
  private int mId;

  public CD(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();

  }

  public String getName() {
    return mName;
  }

  public static List<CD> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static CD find (int id) {
    return instances.get(id - 1);
  }

  public static Comparator<CD> cdSort = new Comparator<CD>() {

    public int compare(CD c1, CD c2) {

      String CdName1 = c1.getName();
      String CdName2 = c2.getName();

      return CdName1.compareToIgnoreCase(CdName2);
    }
  };
}
