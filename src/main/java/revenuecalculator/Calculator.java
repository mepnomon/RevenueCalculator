package revenuecalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Simple app to calculate revenue.
 * @author D. Dressler
 */
public class Calculator implements RevenueCalculator {

    @Override
    public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
        BigDecimal totalPercentage = BigDecimal.valueOf(100.00).setScale(2);
        BigDecimal firstTerm = costOfGoods.multiply(totalPercentage).setScale(2);
        BigDecimal secondTerm = totalPercentage.subtract(marginPercentage).setScale(2);
        return firstTerm.divide(secondTerm, RoundingMode.HALF_UP);
    }

}
