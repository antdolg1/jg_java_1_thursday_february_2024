package teacher.lesson_13.lessoncode;

import org.junit.*;

import static junit.framework.Assert.assertEquals;

public class TaxCalculatorImplTest {

    private TaxCalculator calculator;

    @BeforeClass
    public static void setUpClass() {
        // Будет запущен один раз перед тестами в этом классе
        System.out.println("Starting TaxCalculatorImplTest tests.");
    }

    @AfterClass
    public static void tearDownClass() {
        // Будет запущен один раз после всех тестов
        System.out.println("Finished TaxCalculatorImplTest tests.");
    }

    @Before
    public void initialize() {
        // запускается перед каждым тестом
        calculator = new TaxCalculatorImpl();
        System.out.println("Creating a new instance of TaxCalculatorImpl.");
    }

    @After
    public void cleanup() {
        //запускается после каждого теста
        System.out.println("Cleaning up after test.");
    }

    @Test
    public void shouldReturn25PercentTax_When1000IncomeGiven() {
        double realTaxResult = calculator.calculate25PercentTax(1000.0);
        assertEquals(250.0, realTaxResult, 0.001);
    }

    @Test
    public void shouldReturnZeroTax_WhenZeroIncomeGiven() {
        double realTaxResult = calculator.calculate25PercentTax(0.0);
        assertEquals(0.0, realTaxResult, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenNegativeIncomeGiven() {
        calculator.calculate25PercentTax(-100.0);
    }

    @Test(timeout = 1000)
    public void testPerformanceUnderLoad() {
        for (int i = 0; i < 100000000; i++) {
            calculator.calculate25PercentTax(1000.0);
        }
    }
}