package com.mbank.search.display;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

/**
 * Created by FRAMGIA\dang.ngoc.thien on 20/10/2016.
 */
public interface ISearchName {

    /*BLOCK SHOW*/

    // show all item
    public boolean isCheckShowAllItem(WebDriver driver);
    // Š¿šAƒJƒiAåŠÇx“XA–‹ÆŠ–¼A–‹ÆŠƒR[ƒh is blank
    public boolean isItemCharacterBlank(WebDriver driver);

    //Š¿š  default selected
    public boolean isKanjiSelected(WebDriver driver);

    //åŠÇx“X default selected
    public boolean isExeBranchSelected(WebDriver driver);

    //åŠÇx“X check sort follow branch
    public boolean isSortExeBranch(WebDriver driver);

    // check default selected for åŠÇx“X have exe branch + estab
    public boolean isBranchAndEstabSelected(WebDriver driver);

    //check default selected for åŠÇx“X haven exe branch + not estab
    public boolean isBranchAndNotEstabSelected(WebDriver driver);

    //check default selected for åŠÇx“X haven exe branch
    public boolean isCheckBranchSelected(WebDriver driver);

    //check default selected for åŠÇx“X haven't exe branch
    public boolean isCheckNotBrnachSelected(WebDriver driver);

}
