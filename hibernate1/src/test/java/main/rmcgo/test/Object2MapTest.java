package main.rmcgo.test;

import com.alibaba.fastjson.JSON;
import main.rmcgo.hibernate.entity.News;
import org.junit.Test;

import java.util.Map;

public class Object2MapTest {
	@Test
	public void test() {
		News news = new News();
		news.setId(null);
		Map map = JSON.parseObject(JSON.toJSONString(news), Map.class);
		System.out.println(map);
	}
}
