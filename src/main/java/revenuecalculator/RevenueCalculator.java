package revenuecalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RevenueCalculator implements RevenuCalculator {

    public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
        BigDecimal totalPercentage = BigDecimal.valueOf(100.00).setScale(2);
        BigDecimal firstTerm = costOfGoods.multiply(totalPercentage).setScale(2);
        BigDecimal secondTerm = totalPercentage.subtract(marginPercentage).setScale(2);
        return firstTerm.divide(secondTerm, RoundingMode.HALF_UP);
    }

}