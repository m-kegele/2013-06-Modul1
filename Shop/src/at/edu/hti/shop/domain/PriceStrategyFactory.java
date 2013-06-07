package at.edu.hti.shop.domain;

public class PriceStrategyFactory {

	public IPriceStrategy getStrategy(String id){
		if(id == null || id.isEmpty()) {
			throw new NullPointerException("id is null");
		}
		
		if("FreeShipping".equals(id)){
			return new FreeShippingStrategy();
		} else if("AdditionalShippingCosts".equals(id)){
			
		}
		
		throw new IllegalArgumentException("id not suported");
	}
	
}
