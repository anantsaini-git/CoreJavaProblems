package com.group.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ExecuteProgram {

	public static void main(String[] args) {
		GroupItems groupItemsExample = new GroupItems();

		List<String> itemList = new ArrayList<String>();
		itemList.add("fruit:apple");
		itemList.add("veggie:potato");
		itemList.add("fruit:banana");
		
		groupItemsExample.setItemList(itemList);
		
		Map<Object, Object> itemMap = groupItemsExample.arrangeItems();
		
		int i = 1;
		for (Entry<Object, Object> mapEntrySet : itemMap.entrySet()) {
			System.out.println("Key-Value pair " + i++);
			System.out.println(mapEntrySet.getKey() + ":: " + mapEntrySet.getValue());
		}
	}
}