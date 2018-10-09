package revenuecalculator;

import java.math.BigDecimal;

public interface RevenuCalculator {
    BigDecimal calculateRevenue(
            BigDecimal marginPercentage,
            BigDecimal costOfGoods
    );
}
