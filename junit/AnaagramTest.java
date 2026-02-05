package junit;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
public class AnaagramTest {
	public boolean isanagram(String s1,String s2) {
		if(s1 == null|| s2 == null)
			return false;
		s1 = s1.replaceAll("\\s","").toLowerCase();
		s2 = s2.replaceAll("\\s","").toLowerCase();
		if(s1.length() != s2.length())
			return false;
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
		
	}
	@Test
	public void testAnagramTrue() {
		assertTrue(isanagram("listen","silent"));
		
	}
	@Test
	public void testAnagramfalse() {
		assertFalse(isanagram("hello","world"));
	}
	@Test
	public void testAnagramWithSpaces() {
		assertTrue(isanagram("Dirtyroom","Dormitory"));
	}

}
