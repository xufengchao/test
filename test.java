package cn.hutool.core.util;

import java.text.DecimalFormat;

public class test {

	public static void main(String[] args){

		// 苹果 草莓 芒果 单价
		Double apple =8;Double strawberry = 10;Double mango = 10;
		Double appleWeight = 10, strawberryWeight = 5; Double mangoWeight = 8;
		System.out.println("-------------1题：两种水果 A购买的总价");
		totalPriceA(apple, strawberry, appleWeight, strawberryWeight);
		System.out.println("-------------2题：三种水果 B购买的总价");
		totalPriceB(apple,strawberry,mango,appleWeight,strawberryWeight,mangoWeight);
		System.out.println("-------------3题：折扣 C购买的总价");
		totalPriceC(apple, strawberry, mango, appleWeight, strawberryWeight, mangoWeight);
		System.out.println("-------------4题：折扣+满减 D购买的总价");
		totalPriceD(apple, strawberry, mango, appleWeight, strawberryWeight, mangoWeight);
	}

	private static void totalPriceD(Double apple, Double strawberry, Double mango, Double appleWeight, Double strawberryWeight, Double mangoWeight) {
		DecimalFormat df = new DecimalFormat("#.##");
		// 判断 C是否购买了 苹果
		if (appleWeight > 0){
			// 苹果打8折
			Double b = apple * 0.8;
			Double weight = appleWeight+strawberryWeight+mango;
			if (weight == 0){
				System.out.println("D 没有购买商品！");
			}
			Double totalPrice = b*appleWeight+strawberry*strawberryWeight+mango*mangoWeight;
			if (totalPrice >= 100){
				Double result = totalPrice / 100 ;
				double totaltotal1 = Math.floor(result) * 10;
				totalPrice = totalPrice - totaltotal1;
				System.out.println("D 所购商品的总价是:"+df.format(totalPrice));
			}else {
				System.out.println("D 所购商品的总价是:"+df.format(totalPrice));
			}
		}else {
			Double weight = strawberryWeight+mangoWeight;
			if (weight == 0){
				System.out.println("D 没有购买商品！");
			}else {
				double totalPrice =strawberry*strawberryWeight+mango*mangoWeight;
				System.out.println("没购买苹果的情况下未满减的价格是："+totalPrice);
				if (totalPrice >= 100){
					double result = totalPrice / 100 ;
					double totaltotal1 = Math.floor(result) * 10 ;
					totalPrice = totalPrice - totaltotal1;
					System.out.println("D 所购商品的总价是:"+df.format(totalPrice));
				}else {
					System.out.println("D 所购商品的总价是:"+df.format(totalPrice));
				}
			}
		}
	}

	private static void totalPriceC(Double apple, Double strawberry, Double mango, Double appleWeight, Double strawberryWeight, Double mangoWeight) {
		// 判断 C是否购买了 苹果
		if (appleWeight > 0){
			// 苹果打8折
			Double b = apple * 0.8;
			Double weight = appleWeight+strawberryWeight+mango;
			if (weight == 0){
				System.out.println("C 没有购买商品！");
			}
			Double totalPrice = b*appleWeight+strawberry*strawberryWeight+mango*mangoWeight;
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println("C 所购商品的总价是:"+df.format(totalPrice));
		}else {
			Double weight = strawberryWeight+mangoWeight;
			if (weight == 0){
				System.out.println("C 没有购买商品！");
			}else {
				double totalPrice =strawberry*strawberryWeight+mango*mangoWeight;
				System.out.println("C 所购商品的总价是："+totalPrice);
			}
		}

	}

	private static void totalPriceA(Double apple, Double strawberry, Double appleWeight, Double strawberryWeight) {
		Double weight = appleWeight+strawberryWeight;
		if (weight == 0){
			System.out.println("A 没有购买商品！");
		}else {
			double totalPrice =apple*appleWeight + strawberry*strawberryWeight;
			System.out.println("A 所购商品的总价是："+totalPrice);
		}

	}
	private static void totalPriceB(Double apple, Double strawberry,Double mango, Double appleWeight, Double strawberryWeight,Double mangoWeight) {
		Double weight = appleWeight+strawberryWeight+mangoWeight;
		if (weight == 0){
			System.out.println("B 没有购买商品！");
		}else {
			double totalPrice =apple*appleWeight + strawberry*strawberryWeight+mango*mangoWeight;
			System.out.println("B 所购商品的总价是："+totalPrice);
		}

	}
}
