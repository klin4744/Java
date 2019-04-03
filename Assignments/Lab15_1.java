// Kevin Lin 110277459
public class Lab15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock ORCL = new Stock("ORCL","Oracle Corporation",34.5,34.35);
		System.out.print("The percent change for " + ORCL.name + " is " + ORCL.getChangePercent() + "%");
	}
	
	static class Stock{
		private String symbol, name;
		private double previousClosingPrice, currentPrice;
		public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
			this.symbol = symbol;
			this.name = name;
			this.previousClosingPrice = previousClosingPrice;
			this.currentPrice = currentPrice;
		}
		double getChangePercent() {
			return (this.currentPrice - this.previousClosingPrice)/this.currentPrice * 100;
		}
		
	}
	

}
