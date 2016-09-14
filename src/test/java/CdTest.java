import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class CdTest {

  @Test
  public void Cd_instantiatesNewCd_true() {
    CD cdData = new CD("Megadeth: Rust in Peace");
    assertTrue(cdData instanceof CD);
  }

  @Test
  public void Cd_instantiatesWithName_String() {
    CD cdData = new CD("Megadeth: Rust in Peace");
    assertEquals("Megadeth: Rust in Peace", cdData.getName());
  }

  @Test
  public void all_returnsAllInstancesOfCd_true() {
    CD firstCD = new CD("Rust in Peace");
    CD secondCD = new CD("By the Way");
    assertTrue(CD.all().contains(firstCD));
    assertTrue(CD.all().contains(secondCD));
  }

  @Test
  public void clear_emptiesAllInstancesOfCd_0() {
    CD cdData = new CD("Rust in Peace");
    CD.clear();
    assertEquals(0, CD.all().size());
  }

  @Test
  public void getId_cdInstantiatesWithAnId_1() {
    CD.clear();
    CD cdData = new CD("Rust in Peace");
    assertEquals(1, cdData.getId());
  }

  @Test
  public void find_returnsCdWithSameId_secondCd() {
    CD firstCD = new CD("Rust in Peace");
    CD secondCD = new CD("By the Way");
    assertEquals(secondCD, CD.find(secondCD.getId()));
  }

  @Test
  public void Cd_sortedByName() {
    ArrayList<CD> newCD = new ArrayList<CD>();
    CD cdData = new CD("Megadeth: Rust in Peace");
    newCD.add(cdData);
    cdData = new CD("bob");
    newCD.add(cdData);
    Collections.sort(newCD, CD.cdSort);
  }

}
