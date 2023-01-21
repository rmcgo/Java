package chapter1;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class StringJoinTest {
	public static void main(String[] args) {
		String certificateType = "身份证";
		String certificateNo = "362532199810026110";
		String cellPhone = "19982812221";

		List<String> filterList = new ArrayList<>();
		if (certificateType != null && certificateNo != null) {
			filterList.add(String.format("(certificateType eq '%s' and identityNo eq '%s')", certificateType, certificateNo));
		}
		if (cellPhone != null) {
			filterList.add(String.format("(contactInfo.cellphone eq '%s')", cellPhone));
		}
		if (!filterList.isEmpty()) {
			String filter = String.join(" or ", filterList);
			System.out.println(filter);
		}
		LocalDate now = LocalDate.now();
		System.out.println(now);
	}
}
