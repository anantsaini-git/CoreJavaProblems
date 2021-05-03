package com.group.item;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupItems {
	
	private List<String> itemList;
	
	public List<String> getItemList() {
		return itemList;
	}

	public void setItemList(List<String> itemList) {
		this.itemList = itemList;
	}

	public Map<Object, Object> arrangeItems() {

		return getItemList().stream()
				.collect(Collectors.toMap(
						(s) -> s.toString().substring(0, s.indexOf(":")), 
						(s) -> s.toString().substring(s.indexOf(":") + 1, s.toString().length()),
								(s1, s2) -> {return Arrays.asList(s1, s2);}));
	}

}
