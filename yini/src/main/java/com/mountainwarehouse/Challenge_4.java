package com.mountainwarehouse;

public class Challenge_4 {

	/**
	 * For this task you will have to calculate and return the stamp duty of a
	 * property you have purchased.
	 * Stamp duty is a type of tax applied by the UK government when you
	 * purchase a property, this tax works in price brackets - i.e the same way
	 * income tax does.
	 * Less than £300,000 there is 0% tax.
	 * £300,001 - £925,000 there is 5% tax.
	 * £925,001 - £1,500,000 there is 10% tax.
	 * £1,500,001+ there is 12% tax
	 * All amounts as each tax bracket is calculated is rounded to the nearest pound
	 * 
	 * For example if you buy a house worth £1,595,000:
	 * 0% on the first £300,000 = £0
	 * 5% on £624,999 (£300,001 -> £925,000) = £31,250
	 * 10% on £574,999 (£1,500,000 - £925,001) = £57,500
	 * 12% on the remaining £94,999 (£1,595,000 - £1,500,001) = £11,400
	 * Total tax = £100,150
	 * 
	 * @param propertyPrice The price of the property being bought
	 * @return Total stamp duty
	 */
	public static int StampDuty(int propertyPrice) {
		// Thresholds for different tax tiers
		int taxFreePrice = 300000;
		int priceTier1 = 925000;
		int priceTier2 = 1500000;
		
		// Tax rates for different tax tiers
		double taxTier1 = 0.05;
		double taxTier2 = 0.1;
		double taxTier3 = 0.12;
		if (propertyPrice < 300001) {
			return 0;
		}

		int tax = 0;

		if (propertyPrice <= priceTier1) {        
	        tax += Math.round((propertyPrice - taxFreePrice) * taxTier1);
	    } else if (propertyPrice <= priceTier2) {
	        tax += Math.round((priceTier1 - taxFreePrice) * taxTier1);
	        tax += Math.round((propertyPrice - priceTier1) * taxTier2);
	    } else {
	        tax += Math.round((priceTier1 - taxFreePrice) * taxTier1);
	        tax += Math.round((priceTier2 - priceTier1) * taxTier2);
	        tax += Math.round((propertyPrice - priceTier2) * taxTier3);
	    }

		return tax;
	}
}
