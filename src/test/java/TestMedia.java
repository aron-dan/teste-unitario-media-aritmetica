import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestMedia {
	
	MediaAritmetica media = new MediaAritmetica();

	@Test
	public void testMedia() {
		
		double result = media.media();
		Assertions.assertEquals(result, media.media());
	}

}
