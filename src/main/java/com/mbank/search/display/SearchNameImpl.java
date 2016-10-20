package com.mbank.search.display;

import com.mbank.common.StringUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 19/10/2016.
 */

public class SearchNameImpl implements ISearchName {

    public boolean isCheckShowAllItem(WebDriver driver) {
        System.out.println("Check all item of screen");
        boolean isCheckItem = false;

        if(driver.findElement(By.id("kanji_radio")).isEnabled()
                && driver.findElement(By.id("kanji")).isEnabled()
                && driver.findElement(By.id("kana_radio")).isEnabled()
                && driver.findElement(By.id("kana")).isEnabled()
                && driver.findElement(By.id("syukan_cd_radio")).isEnabled()
                && driver.findElement(By.id("syukan_cd")).isEnabled()
                && driver.findElement(By.id("jigyou_name_radio")).isEnabled()
                && driver.findElement(By.id("jigyou_name_radio")).isEnabled()
                && driver.findElement(By.id("jigyou_cd_radio")).isEnabled()
                && driver.findElement(By.id("jigyou_cd_radio")).isEnabled()){
           isCheckItem = true;
        }

        return isCheckItem;
    }

    public boolean isItemCharacterBlank(WebDriver driver) {
        System.out.println("all item 漢字、カナ、主管支店、事業所コード is blank");

        boolean isCheckBlank = false;

        if(StringUtil.isEmpty(driver.findElement(By.id("kanji")).getText())
                && StringUtil.isEmpty(driver.findElement(By.id("kana")).getText())
                && StringUtil.isEmpty(driver.findElement(By.id("jigyou_name")).getText())
                && StringUtil.isEmpty(driver.findElement(By.id("jigyou_cd")).getText())){
            isCheckBlank = true;
        }

        return isCheckBlank;
    }

    public boolean isKanjiSelected(WebDriver driver) {
        System.out.println("Radio of 漢字 default: ON");
        return driver.findElement(By.id("kanji_radio")).isSelected();
    }

    public boolean isExeBranchSelected(WebDriver driver) {

        System.out.println("Radio exe branch (主管支店) default : ON");

        return driver.findElement(By.id("syukan_cd_radio")).isSelected();
    }

    public boolean isSortExeBranch(WebDriver driver) {
        return false;
    }

    public boolean isBranchAndEstabSelected(WebDriver driver) {

        System.out.println("isBranchAndEstabSelected");

        boolean isCheckEstabSelected = false;

        Select select = new Select(driver.findElement(By.id("syukan_cd")));

        String actualValueBranch = select.getFirstSelectedOption().getAttribute("Value");
        String expectValueBranch = "067000"; // map with KOJIN_CD
        if(actualValueBranch.equals(expectValueBranch))
            isCheckEstabSelected = true;

        return isCheckEstabSelected;
    }

    public boolean isBranchAndNotEstabSelected(WebDriver driver) {
        return false;
    }

    public boolean isCheckBranchSelected(WebDriver driver) {
        return false;
    }

    public boolean isCheckNotBrnachSelected(WebDriver driver) {
        System.out.println("is not branchSelected");

        boolean isCheckBranchNotSelected = false;

        Select select = new Select(driver.findElement(By.id("syukan_cd")));

        String actualValueBranch = select.getFirstSelectedOption().getAttribute("Value");
        String expectValueBranch = ""; // map with KOJIN_CD
        if(actualValueBranch.equals(expectValueBranch))
            isCheckBranchNotSelected = true;

        return isCheckBranchNotSelected;
    }
}
