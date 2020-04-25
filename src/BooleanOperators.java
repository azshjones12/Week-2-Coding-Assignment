
public class BooleanOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 3.99;
		double moneyInWallet = 100;
		byte thirstLevel = 7; 
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && (!isWeekday);
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && (!isWeekday);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) & (moneyInWallet >= (costOfMilk * 2));
	}

}
