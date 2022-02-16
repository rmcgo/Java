package chapter10.demo;

public class Color {
	private static final Color RED = new Color("红色");
	private static final Color GREEN = new Color("绿色");
	private static final Color BLUE = new Color("蓝色");

	private String title;

	private Color(String title) {
		this.title = title;
	}

	private static Color getInstance(String color) {
		switch (color) {
			case "red":
				return RED;
			case "green":
				return GREEN;
			case "blue":
				return BLUE;
			default:
				return null;
		}
	}

	@Override
	public String toString() {
		return "Color{" +
				"title='" + title + '\'' +
				'}';
	}

	public static void main(String[] args) {
		Color green = Color.getInstance("green");
		System.out.println(green);
	}
}
