import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {
  @Test
  public void newRectangle_createNewInstance() {
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }
}
