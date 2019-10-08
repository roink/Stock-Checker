

public class KursCheck { 
	
	
	public KursCheck(String symbol, String nickname) { 
		
		Stock stock = StockFetcher.getStock(symbol);
		if (stock.isCheap()){
		System.out.println(nickname + " is cheap.");

		} else {
		System.out.println(nickname + " is not cheap.");
		}
		
	} 

}
