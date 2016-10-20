package com.mbank;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.mbank.search.display.ISearchName;
import com.mbank.search.display.SearchNameImpl;
import com.mbank.common.Constants;
import com.mbank.common.InitEvironmentSelenium;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 19/10/2016.
 */
public class SearchNameMobile {
    private WebDriver driver;

    private ISearchName iSearchName = new SearchNameImpl();




    @Before
    public void setEnvironment(){

        driver = InitEvironmentSelenium.intEviSelenium(InitEvironmentSelenium.deiredDevice(), driver);

        driver.get(Constants.GOTO_HOME_MBANK);

/*//        Only test case with other User with Test-case 13:
        driver.get(Constants.GOTO_HOME_MBANK_NOT_BRANCH);*/

        InitEvironmentSelenium._drirectionGoSearchMobile(driver);
    }


    /*test for Home Mbank*/
    @Test
    public void homeMbankMobile(){
        Assert.assertEquals(Constants.EXP_TITLE_HOME, driver.getTitle());
    }

    /*test case 04 : check all item of screen*/

//    @Test
    public void testAllItemScreen(){
        Assert.assertTrue(iSearchName.isCheckShowAllItem(driver));
    }
    /* Test-case 05:  check all item äøéöÅAÉJÉiÅAéÂä«éxìXÅAÅAéñã∆èäÉRÅ[Éh is blank*/

//    @Test
    public void  testBankAllItem(){
        Assert.assertTrue(iSearchName.isItemCharacterBlank(driver));
    }

    /* Test-case 06:  Radio of äøéö default l? ON*/
//    @Test
    public void testKanjiDefaultCheck(){
        Assert.assertTrue(iSearchName.isKanjiSelected(driver));
    }

    /* Test-case 07:  (éÂä«éxìX) default l? ON*/
//    @Test
    public void testBranchDefaultCheck(){
        Assert.assertTrue(iSearchName.isExeBranchSelected(driver));
    }

    /* Test-case 11:  check default selected for éÂä«éxìX have exe branch + YTC on UserId = 123456*/

//    @Test
    public void testBranchHaveYTCSelected(){
        Assert.assertTrue(iSearchName.isBranchAndEstabSelected(driver));
    }

    /* Test-case 13:  check default selected is blank for éÂä«éxìX haven't exe branch + YTC on UserId = 501006*/

//    @Test
    public void testBranchHaveYTCBlank(){
        Assert.assertTrue(iSearchName.isCheckNotBrnachSelected(driver));
    }


    @After
    public void andTest(){

    }
}
