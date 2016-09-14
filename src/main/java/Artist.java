import java.util.ArrayList;
import java.util.List;

public class Artist {
  private String mName;
  private static List<Artist> instances = new ArrayList<Artist>();
  private int mId;
  private List<CD> mCds;

  public Artist(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mCds = new ArrayList<CD>();
  }

  public String getName() {
    return mName;
  }

  public static List<Artist> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Artist find(int id) {
    return instances.get(id - 1);
  }

  public List<CD> getCD() {
    return mCds;
  }

  public void addCD(CD cd) {
    mCds.add(cd);
  }
}
