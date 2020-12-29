package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ZnwrHomePage;

public class SortProductTest extends CommonConditions {

    @Test
    public void sortProduct(){
        boolean sortProduct = new ZnwrHomePage(driver)
                .openPage()
                .selectSection()
                .clickSortButton()
                .selectKindOfSort()
                .clickSelectedSort();
        Assert.assertTrue(sortProduct);
    }
}
