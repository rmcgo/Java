package chapter1;

public class HireChannelEnumTest {
	public static void main(String[] args) {
		String name = HireChannelEnum.HEADHUNTING_CHANNEL.getName(); // 猎头
		System.out.println(name);

		System.out.println(HireChannelEnum.HEADHUNTING_CHANNEL.name()); // HEADHUNTING_CHANNEL
	}
}
