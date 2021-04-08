package FruitBasketEstimation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}

	public void addToBasket(FruitBasket fbObj) {
		// Fill your code here
        fruitBasketList.add(fbObj);

	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
		
		// Fill your code here
        int bill = 0;
		List<FruitBasket> list = fruitBasketStream.collect(Collectors.toList());
		for(int i = 0; i < list.size(); i++){
		    FruitBasket fb = list.get(i);
		    bill += (fb.getWeightInKgs() * fb.getPricePerKg());
		}
		return bill;
	
	}

}

