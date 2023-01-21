package com.rmcgo.java.basicGrammer.project2;

public class FamilyAccount {
	public static void main(String[] args) {
		String details = "收支\t账户金额\t收支金额\t说    明\n";
		int balance = 10000;

		boolean loopFlag = true;
		do {
			System.out.println("\n-----------------家庭收支记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退    出\n");
			System.out.print("                   请选择(1-4)：");

			char key = Utility.readMenuSelection();
			System.out.println();
			switch (key) {
				case '1':
					System.out.println("-----------------当前收支明细记录-----------------");
					System.out.println(details);
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					System.out.println("本次收入金额：");
					int amount = Utility.readNumber();
					System.out.println("本次收入说明：");
					String desc = Utility.readString();

					balance += amount;
					details += "收入\t" + balance + "\t\t" +
							amount + "\t\t" + desc + "\n";
					System.out.println("---------------------登记完成---------------------");
					break;
				case '3':
					System.out.print("本次支出金额：");
					int amount2 = Utility.readNumber();
					if (balance < Math.abs(amount2)) {
						System.out.println("本次支出金额大于账户余额，请重新输入！");
						break;
					}
					System.out.print("本次支出说明：");
					String desc2 = Utility.readString();

					balance += amount2;
					details += "支出\t" + balance + "\t\t" +
							amount2 + "\t\t" + desc2 + "\n";
					System.out.println("---------------------登记完成---------------------");
					break;
				case '4':
					System.out.println("请确认是否退出(Y/N): ");
					char yesOrNo = Utility.readConfirmSelection();
					if (yesOrNo == 'Y') loopFlag = false;
					break;
			}
		} while (loopFlag);
	}
}
