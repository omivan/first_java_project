
public class Pet {
	int age;
	float weight;
	float height;
	String color;

	public void sleep() {
		System.out.println("Негайно до ліжка!");
	}

	public void eat() {
		System.out.println("Я дуже хочу їсти,давай замовимо піцу!");
	}

	public String say(String aWord) {
		String petResponse = "Ну гаразд" + aWord;
		return petResponse;
	}
}
