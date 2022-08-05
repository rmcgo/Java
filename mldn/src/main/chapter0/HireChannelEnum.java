package chapter0;

public enum HireChannelEnum {
	MEDIA_CHANNEL("媒体"),
	HEADHUNTING_CHANNEL("猎头"),
	INTRODUCE_CHANNEL("内推"),
	OTHER_CHANNEL("其它");

	private String name;

	private HireChannelEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
