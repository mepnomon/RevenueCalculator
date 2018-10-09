package revenuecalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tester for Simple Revenue Calculator app.
 * @author D. Dressler
 */
class RevenueCalculatorTest {

    RevenuCalculator revenuCalculator;
    @BeforeEach
    void setUp() {
        revenuCalculator = new RevenueCalculator();
    }

    @Test
    public void calculate_revenue_for_500(){
        BigDecimal percentage = BigDecimal.valueOf(20);
        BigDecimal costOfGoods = BigDecimal.valueOf(400.00);
        BigDecimal expectedResult = BigDecimal.valueOf(500.00).setScale(2);
        assertEquals(expectedResult,revenuCalculator.calculateRevenue(percentage,costOfGoods));
    }

    @Test
    public void calculate_revenue_for_1000(){
        BigDecimal percentage = BigDecimal.valueOf(20);
        BigDecimal costOfGoods = BigDecimal.valueOf(800);
        BigDecimal expectedResult = BigDecimal.valueOf(1000.00).setScale(2);
        assertEquals(expectedResult,revenuCalculator.calculateRevenue(percentage,costOfGoods));
    }

    @Test
    public void calculate_revenue_for_3000(){
        BigDecimal percentage = BigDecimal.valueOf(50);
        BigDecimal costOfGoods = BigDecimal.valueOf(1500);
        BigDecimal expectedResult = BigDecimal.valueOf(3000.00).setScale(2);
        assertEquals(expectedResult,revenuCalculator.calculateRevenue(percentage,costOfGoods));
    }

    @Test
    public void calculate_revenue_for_3250_25(){
        BigDecimal percentage = BigDecimal.valueOf(12.50).setScale(2);
        BigDecimal costOfGoods = BigDecimal.valueOf(2843.97).setScale(2);
        BigDecimal expectedResult = BigDecimal.valueOf(3250.25).setScale(2);
        assertEquals(expectedResult,revenuCalculator.calculateRevenue(percentage,costOfGoods));
    }

    @Test
    public void calculate_revenue_for_4000(){
        BigDecimal percentage = BigDecimal.valueOf(87.50).setScale(2);
        BigDecimal costOfGoods = BigDecimal.valueOf(500.00).setScale(2);
        BigDecimal expectedResult = BigDecimal.valueOf(4000.00).setScale(2);
        assertEquals(expectedResult,revenuCalculator.calculateRevenue(percentage,costOfGoods));
    }
}