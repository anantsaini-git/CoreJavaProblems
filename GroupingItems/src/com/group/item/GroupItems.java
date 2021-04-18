package com.group.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupItems {
	
	private List<String> itemList;
	
	public static void main(String[] args) {
		GroupItems groupItemsExample = new GroupItems();

		groupItemsExample.setListData();
		Map<String, String> itemMap = groupItemsExample.arrangeItems();
		
		int i = 1;
		for (Map.Entry<String, String> mapEntrySet : itemMap.entrySet()) {
			System.out.println("Key-Value pair " + i++);
			System.out.println(mapEntrySet.getKey() + ":: " + mapEntrySet.getValue());
		}
	}
	
	public List<String> getItemList() {
		return itemList;
	}

	public void setItemList(List<String> itemList) {
		this.itemList = itemList;
	}

	private void setListData() {
		
		List<String> itemList = new ArrayList<String>();
		itemList.add("fruit:apple");
		itemList.add("veggie:potato");
		itemList.add("fruit:banana");
		
		itemList.add("veggie:tomato");
		itemList.add("fruit:kiwi");
		
		setItemList(itemList);
	}

	public Map<String, String> arrangeItems() {

		return getItemList().stream()
				.collect(Collectors.toMap(
						(s) -> s.toString().substring(0, s.indexOf(":")), 
						(s) -> s.toString().substring(s.indexOf(":") + 1, s.toString().length()),
								(s1, s2) -> {return s1 + "," + s2;}));
	}

}
