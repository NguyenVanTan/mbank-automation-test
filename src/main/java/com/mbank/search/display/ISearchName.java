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
    // �����A�J�i�A��ǎx�X�A���Ə����A���Ə��R�[�h is blank
    public boolean isItemCharacterBlank(WebDriver driver);

    //����  default selected
    public boolean isKanjiSelected(WebDriver driver);

    //��ǎx�X default selected
    public boolean isExeBranchSelected(WebDriver driver);

    //��ǎx�X check sort follow branch
    public boolean isSortExeBranch(WebDriver driver);

    // check default selected for ��ǎx�X have exe branch + estab
    public boolean isBranchAndEstabSelected(WebDriver driver);

    //check default selected for ��ǎx�X haven exe branch + not estab
    public boolean isBranchAndNotEstabSelected(WebDriver driver);

    //check default selected for ��ǎx�X haven exe branch
    public boolean isCheckBranchSelected(WebDriver driver);

    //check default selected for ��ǎx�X haven't exe branch
    public boolean isCheckNotBrnachSelected(WebDriver driver);

}
