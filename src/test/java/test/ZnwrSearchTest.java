package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ZnwrHomePage;

public class ZnwrSearchTest extends CommonConditions {

    @Test
    public void noCorrectInput(){
        String  noInput = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Вчерв работало")
                .clickSearchButton()
                .noCorrectRequestResult();
        Assert.assertEquals(noInput, "К сожалению, по вашему поисковому запросу ничего не найдено.");
    }

    @Test
    public void correctInput(){
        boolean findResult = new ZnwrHomePage(driver)
                .openPage()
                .openSearchPage()
                .searchInput("Футболка")
                .clickSearchButton()
                .isFindResult();
        Assert.assertTrue(findResult);
    }
}
