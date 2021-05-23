package com.practise.equals;

class Employee implements Comparable<Employee> {

	String id;
	String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		if (name != null) {
			return 10 + name.hashCode();
		}
		if (id != null) {
			return 10 + id.hashCode();
		}

		return 10;

	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (this.id == ((Employee) obj).getId() && this.name == ((Employee) obj).getName()) {
			return true;
		}

		return false;
	}

	@Override
	// Overriding toString to print object data than object hashcode
	public String toString() {
		return this.id + ":: " + this.name;
	}

	@Override
	public int compareTo(Employee o) {
		// as String already implements Comparable interface
		return this.getId().compareTo(o.getId());
	}

}