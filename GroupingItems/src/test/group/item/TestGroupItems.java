package test.group.item;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.group.item.GroupItems;

public class TestGroupItems {
	
	static GroupItems groupItems;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 groupItems = new GroupItems();
	}
	
	@Before
	public void setTestData() {
		List<String> testList = new ArrayList<>();
		testList.add("fruit:apple");
		testList.add("veggie:potato");
		testList.add("fruit:banana");
		
		groupItems.setItemList(testList );
	}

	@Test
	public void testFruitItems() {
		List<String> resultFruitValue = Arrays.asList("apple","banana");
		
		assertEquals(resultFruitValue, groupItems.arrangeItems().get("fruit"));
	}
	
	@Test
	public void testVeggieItems() {
		String resultVeggieValue = new String("potato");
		
		assertEquals(resultVeggieValue, groupItems.arrangeItems().get("veggie"));
	}
}