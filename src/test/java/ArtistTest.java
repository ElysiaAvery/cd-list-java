import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

public class ArtistTest {

  @Test
  public void artist_instantiatesCorrectly_true() {
    Artist testArtist = new Artist("Black Sabbath");
    assertTrue(testArtist instanceof Artist);
  }

  @Test
  public void getName_artistInstantiatesWithName_BlackSabbath() {
    Artist testArtist = new Artist("Black Sabbath");
    assertEquals("Black Sabbath", testArtist.getName());
  }

  @Test
  public void all_returnsAllInstancesOfArtist_true() {
    Artist firstArtist = new Artist("Black Sabbath");
    Artist secondArtist = new Artist("Red Hot Chile Peppers");
    assertTrue(Artist.all().contains(firstArtist));
    assertTrue(Artist.all().contains(secondArtist));
  }

  @Test
  public void clear_emptiesAllArtistsFromArrayList_0() {
    Artist testArtist = new Artist("Black Sabbath");
    Artist.clear();
    assertEquals(0, Artist.all().size());
  }

  @Test
  public void getId_artistInstantiatesWithAnId_1() {
    Artist.clear();
    Artist testArtist = new Artist("Black Sabbath");
    assertEquals(1, testArtist.getId());
  }

  @Test
  public void find_returnsArtistWithSameId_secondArtist() {
    Artist firstArtist = new Artist("Black Sabbath");
    Artist secondArtist = new Artist("Red Hot Chile Peppers");
    assertEquals(secondArtist, Artist.find(secondArtist.getId()));
  }

  @Test
  public void addCD_addsCdToArtist_true() {
    Artist testArtist = new Artist("Red Hot Chile Peppers");
    CD testCD = new CD("By the Way");
    testArtist.addCD(testCD);
    assertTrue(testArtist.getCD().contains(testCD));
  }
}
