package ui.Dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinancialOverview {
    public static By CREDIT_AVAILABLE = By.xpath("//div[contains(text(),\"Credit Available\")]/following-sibling::div[@class=\"balance-value\"]");
    public static By TOTAL_VALANCE = By.xpath("//div[contains(text(),\"Total Balance\")]/following-sibling::div[@class=\"balance-value\"]/descendant::span[1]");
}
