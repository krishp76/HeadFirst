class Dog {

	int size;
	String name;

	void bark() {

		if (size > 60) {
			System.out.println("Whoof! Whoof!");
		} else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}