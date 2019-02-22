package Software;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTestCase {

@Test
void test1() {
		ShoppingCart s = new ShoppingCart();
		int c = s.count();
		assertEquals(c,0);
}
@Test
void test2() {
	    ShoppingCart s = new ShoppingCart();
		s.add("Java Book");
		int c1 = s.count();
		int c2 = s.value();
		assertEquals(c1,1);
		assertEquals(c2,127);
}
@Test
void test3() {
    ShoppingCart s = new ShoppingCart();
	s.add("Java Book");
	s.add("Web design Book");
	int c1 = s.count();
	int c2 = s.value();
	assertEquals(c1,2);
	assertEquals(c2,227);
}
}
