package com.advantage.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import com.relevantcodes.extentreports.LogStatus;


public class AppData {
		
public static String BASEURL = "https://advantage.advertiserreports.com/rip/launch/ring";  //production
//	public String BASEURL = "http://0.0.0.0:8080/";  //Local
public String BASEURL_MC = "https://searchsolutions-syracuse-com.advertiserreports.com/rip/launch/merchantcenter?merchantId=455462";

public String CAMPAIGN_DETAIL_PATH_SUFFIX = "campaign_detail_section.png";
public String CATEGORY_PATH_SUFFIX = "_category_section.png";
public String SEGMENT_PATH_SUFFIX = "_segment_section.png";
public String ADCOPY_PATH_SUFFIX ="_adcopy_section.png";
public static final String REPORT_FILE_PATH = "/home/harish/workspace/Test_Reports/";
public static final String PASS_IMAGE_PATH = "/home/harish/workspace/Test_Reports/pass_img/";
public static final String FAIL_IMAGE_PATH = "/home/harish/workspace/Test_Reports/fail_img/";
public static String userName = "harish@matchcraft.com";
public static String merchantUser = "testmerchant@matchcraft.com";
public static String merchantPass = "23kki8vpej";
public static String[] toAddr = {"testharish784@gmail.com", "salunkheharish@gmail.com"};
public static final String filepath = "/home/harish/Downloads/";
public static final String ffbroserpath = "/home/harish/Downloads/Testing_Material/FF46/firefox-sdk/bin/firefox";
public static final String lgnnamepath = "html/body/div[1]/div[1]/div/div[1]/a[1]";
    
public static final String lgotbtnpath="html/body/div[1]/div[1]/div/div[1]/button";
public static final String menuitempath= "html/body/div[1]/div[2]/div/div[1]/ul/li[1]/a";
public static final String searchbtnpath= "html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/rip-manage-advertisers-search/div/button";
public static final String searchbtnpath1= "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/rip-manage-advertisers-search/div/button";
public static final String searchtxtpath= "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/rip-manage-advertisers-search/div/div[1]/div[1]/input";
public static final String accountNamepath= "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/div/div/span[2]";
    
public static final String submenupath= "html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/ul/li[1]/a";
    
public static final String drpboxpath="/html/body/div/div[1]/div/div[1]/span[3]/button";
public static final String drpboxtextpath="/html/body/div/div[1]/div/div[1]/span[3]/input";
											
public static final String clientNamepath="/html/body/div/div[1]/div/div[1]/span[3]/div/div/ul/li/a/strong";
   // String drpboxpath_dev="/html/body/div[3]/div[2]/div/form/div[1]/div[3]/label";

public static final String createCampaignButton="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/rip-manage-campaigns-performance-optimization/div/div/div[1]/div[1]/button[1]";
public static final String skipWizardLink="/html/body/div[3]/div/rip-wizard/div/div/rip-merchant-wizard-intro/div/div[1]/div/a";
public static final String xrefIdTextPath="//*[@id='merchantExternalId']";
public static final String campaignNameTextPath="//*[@id='name']";
public static final String okButtonPath="/html/body/div[3]/div[2]/div/form/div[2]/div/button[1]";
public static final String campaignNameLable="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-advertiser-editor/div/div[1]/div[2]/div/div[2]/div/div/table/tbody/tr[3]/td[2]";
public static final String addSegmentLable="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-advertiser-editor/div/div[2]/div[1]/div/div[1]/div/div[1]/span[2]/span/a[1]";
public static final String segmentNametextpath="//*[@id='name']";
//public static final String segmentTypetextpath="/html/body/div[3]/div[2]/div/form/div[1]/div[2]/div/span/input";
public static final String segmentTypebtnpath="/html/body/div[3]/div[2]/div/form/div[1]/div[2]/div/span/button";
public static final String segmentTypetextitempath="/html/body/div[3]/div[2]/div/form/div[1]/div[2]/div/span/div/div/ul/li[5]/a";
public static final String segmentTypeitempath="/html/body/div[3]/div[2]/div/form/div[1]/div[2]/div/span/div/div/ul/li/a";
public static final String objectiveLablepath="/html/body/div[3]/div[2]/div/form/div[1]/div[3]/label";
public static final String objectoptionradiobtn1path="/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/label[1]/input";
public static final String objectoptionradiobtn2path="/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/label[2]/input";
public static final String objectoptionradiobtn3path="/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/label[3]/input";
public static final String objectoptionradiobtn4path="/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/label[4]/input";
public static final String segmentOkbtnpath="/html/body/div[3]/div[2]/div/form/div[2]/div/button[1]";
public static final String segmentNamelablepath="html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[1]/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[2]";

public static final String fbpageEditLink="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[2]/rip-location-facebook-page-section/div/div/span[2]/a";
public static final String fbpageUrlText="/html/body/div[3]/div[2]/rip-location-facebook-page-editor/form/div[1]/input";
public static final String lookupBtn="/html/body/div[3]/div[2]/rip-location-facebook-page-editor/form/div[1]/button";
public static final String businessNameValue="/html/body/div[3]/div[2]/rip-location-facebook-page-editor/form/rip-location-facebook-page/div/div/div[2]/div/table/tbody/tr[1]/td[2]";
public static final String autogeoTargetCheckbox="html/body/div[3]/div[2]/rip-location-facebook-page-editor/form/div[2]/div/input";
public static final String radiusLable="/html/body/div[3]/div[2]/rip-location-facebook-page-editor/form/div[2]/div/div/span";
public static final String fbOkBtn="/html/body/div[3]/div[2]/rip-location-facebook-page-editor/form/div[3]/div/button[1]";
public static final String fbOkBtn1="/html/body/div[3]/div[2]/rip-location-facebook-page-editor/form/div[2]/div/button[1]";
public static final String fbpageaccessapproveLable="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[2]/rip-location-facebook-page-section/div/div[2]/div[3]/span";
public static final String geoitemlistLable="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[1]/div[4]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/td[5]/div";
public static final String matchcraftFbPage="https://www.facebook.com/matchcraft.page/";
////html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[2]/div[1]/div/div[1]/div/div[1]/span[2]/span/a[1]

public static final String addimgorvideoLink="html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[2]/div[1]/div/div[1]/div/div[1]/span[2]/span/a[1]";
public static final String descriptiontxtareaPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[2]/div/textarea";
public static final String sendtraficchkboxPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[3]/input";

public static final String destinationUrltxtPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[3]/div/input";
public static final String headlinetxtPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[4]/div/input";
public static final String pglikeheadlinetxtPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[3]/div/input";
public static final String adtextPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[5]/div/textarea";
public static final String pglikeadtextPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[4]/div/textarea";
public static final String calltoactionbtnPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[6]/div/span/button";
public static final String calltoactionOptionPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[6]/div/span/div/div/ul/li[1]/a";

public static final String reachdestinationUrltxtPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[4]/div/input";
public static final String reachheadlinetxtPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[5]/div/input";
public static final String reachadtextPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[6]/div/textarea";
public static final String reachcalltoactionbtnPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[7]/div/span/button";
public static final String reachcalltoactionOptionPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[7]/div/span/div/div/ul/li[2]/a";
//public static final String calltoactionOption2Path="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[6]/div/span/div/div/ul/li[2]/a";

public static final String findimgorvideoBtnPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[8]/button[1]";
public static final String pglikefindimgorvideoBtnPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[4]/button[1]";
public static final String firstimgPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[3]/span[1]/div[1]/img";
public static final String firstvdoPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[3]/span/div[1]/img[1]";

public static final String fbpgchkboxPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[1]/span[2]/input";
public static final String imgchkboxPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[1]/span[3]/input";
public static final String vdochkboxPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[1]/input";

public static final String reachfindimgorvdobtn="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[5]/button[1]";
public static final String reachfirstimgPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[3]/span[1]/div[1]/img";
public static final String reachfirstvdoPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[3]/span/div[1]/img[1]";

public static final String reachfindimgorvdobtn1="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[1]/div/div[1]/div[9]/button[1]";
public static final String reachfirstimgPath1="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[3]/span[1]/div[1]/img";
public static final String reachfirstvdoPath1="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[3]/span/div[1]/img[1]";


public static final String selectimgOkBtnPath="/html/body/div[5]/div[2]/rip-location-social-ads-media-finder/form/div[4]/div/div/button[1]";
public static final String adOkBtnPath="/html/body/div[3]/div[2]/rip-location-social-ads-editor/form/div[2]/div/div/button[1]";
public static final String addescriptiontxt="The Marketing Platform Built for Scale. Manage all of your digital efforts with ease.";
public static final String addestinationurltxt="http://www.matchcraft.com/products/";
public static String adheadlinetxt="Data Driven Analytics | Custom Reporting";
public static final String adtext="5 Benefits of Facebook Advertising.";
public static final String adcopyheadlinetxt="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr/td[4]/div/b";
public static final String adcount ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[2]/div[1]/div/div[1]/div/div[2]/span[2]";
public static final String adchkbox ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-location-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/div/input";

////html/body/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[1]/rip-breadcrumbs/ul/li[1]/a
public static final String campnDetailpgLink="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[1]/rip-breadcrumbs/ul/li[1]/a";
public static final String merchntnamerowpath= "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div/div";
public static final String merchntnameitempath= "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr/td[2]/div/div";
public static final String reachsegpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-advertiser-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]/div";
public static final String lnkclksegpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-advertiser-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr/td[4]/div";
public static final String pglikesegpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-advertiser-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]/div";
public static final String vdoviewsegpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div[2]/rip-advertiser-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr[3]/td[4]/div";

public static final String listitempath= "/html/body/div/div[1]/div/div[1]/span[3]/div/div/ul/li[4]/a";
public static final String listitempath_dev= "html/body/div[1]/div[1]/div/div[1]/span[2]/div/div/ul/li[7]/a";
    
public static final String campaignlistpath ="html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/div/div";
//public static final String dtltabpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[1]/ul/li[1]/a";
public static final String dtltabpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[1]/ul/li[1]/a";	

//public static final String segsectpath = "html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-advertiser-editor/div/div[2]/div[5]/div/div[1]/div/div[1]/span[1]";
public static final String segsectpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-advertiser-editor/div/div[2]/div[5]/div/div[1]/div/div[1]/span[1]";
//public static final String segsectitempath = "html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-advertiser-editor/div/div[2]/div[5]/div/div[2]/div[2]/div/table/tbody/tr/td[4]/div";
public static final String segsectitempath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-advertiser-editor/div/div[2]/div[5]/div/div[2]/div[2]/div/table/tbody/tr/td[4]/div";
    										 
//public static final String budgtsectpath ="html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-advertiser-editor/div/div[1]/div[3]/div/div[1]/div/div[1]/span[1]"; 
public static final String budgtsectpath ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-advertiser-editor/div/div[1]/div[2]/div/div[1]/div/div[1]/span[1]";
public static final String budgtsectitempath ="html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-advertiser-editor/div/div[1]/div[3]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/div/span";

//public static final String segmentdetailpath ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-location-editor/div/div[1]/div[1]/div/div[1]/div[1]/span[1]";
public static final String segmentdetailpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-location-editor/div/div[1]/div[1]/div/div[1]/div[1]/span[1]";

//public static final String categorysectpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-location-editor/div/div[2]/div[1]/div/div[1]/div/div[1]/span[1]";
public static final String categorysectpath = "/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-location-editor/div/div[2]/div[1]/div/div[1]/div/div[1]/span[1]";
    
//public static final String categoryitempath ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-location-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div";
public static final String categoryitempath ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/rip-location-editor/div/div[2]/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div";
  							
//public static final String ADCOPY_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div/rip-category-editor/div/div[1]/div[2]/div/div[1]/div/div[1]/span[1]";
public static final String ADCOPY_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div/rip-category-editor/div/div[1]/div[2]/div/div[1]/div/div[1]/span[1]";

//public static final String KEYPHRASE_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div/rip-category-editor/div/div[2]/div/div/div[1]/div/div[1]/span[1]";
public static final String KEYPHRASE_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div/rip-category-editor/div/div[2]/div/div/div[1]/div/div[1]/span[1]";	

//public static final String PERFORMANCE_TAB_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[1]/ul/li[2]/a";
public static final String PERFORMANCE_TAB_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[1]/ul/li[2]/a";

//public static final String OVERVIEW_TAB_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[1]/ul/li[1]/a";
public static final String OVERVIEW_TAB_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[1]/ul/li[1]/a";	

//public static final String RECENT_CYCLE_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/span[1]";
public static final String RECENT_CYCLE_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/span[1]";

//public static final String PACING_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/span[1]";
public static final String PACING_SECTION_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/span[1]";

//public static final String OPTIMIZATION_TAB_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[1]/ul/li[2]/a";
public static final String OPTIMIZATION_TAB_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[1]/ul/li[2]/a";

//public static final String SEG_PERFORMANCE_SEC_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[2]/rip-manage-campaigns-performance-optimization/div/div/div[3]/div[1]";
public static final String SEG_PERFORMANCE_SEC_PATH ="/html/body/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/rip-manage-advertiser-body/div[1]/div[2]/div/div/div[2]/rip-manage-campaigns-performance-optimization/div/div/div[3]/div[1]";

public static final String CAMPAIGN_NAME_PATH  = "html/body/rip-merchant-center/div/div/rip-header/div/div[2]/rip-header-account-info-bar/div/div[1]/div[1]";
												 
public static final String CALL_LOG_TAB_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/ul/li[2]/a/span[2]";

public static final String CALL_TAB_SEC_NAME_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/rip-dynamic-directive/rip-call-log/div/div/div[1]/div[1]/label";

public static final String ADS_TAB_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/ul/li[3]/a/span[2]";

public static final String ADS_TAB_SEC_NAME_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/rip-dynamic-directive/rip-ads/div/div/div[1]/div[1]/label";

public static final String KEYWORDS_TAB_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/ul/li[4]/a/span[2]";

public static final String KEYWORDS_TAB_SEC_NAME_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/rip-dynamic-directive/rip-keywords/div/div/div[1]/div[1]/label";
														  
public static final String TARGETING_TAB_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/ul/li[5]/a/span[2]";

public static final String TARGETING_TAB_SEC_NAME_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/rip-dynamic-directive/rip-campaign/div/div/label[1]";

public static final String EXPORT_TAB_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/ul/li[6]/a/span[2]";

public static final String EXPORT_TAB_SEC_NAME_PATH  = "html/body/rip-merchant-center/div/div/rip-tabset/div/rip-dynamic-directive/rip-export/div/div[1]/label[1]";

	

public static void launchAndLogin(WebDriver driver) throws InterruptedException {
	
	//Launch site and login
	
			driver.get(BASEURL);

	        try{
	        AppData.waitForElement(driver, driver.findElement(By.id("rip-login-email")));
	        
	       // String loginFileName =  AppData.PASS_IMAGE_PATH + timeStamp +"_login.png";
	       // AppData.takeSnapShot(driver, loginFileName);        
	        
	        //System.out.println("Waiting for page to load....");
	        driver.findElement(By.id("rip-login-email")).sendKeys(AppData.userName);
	        driver.findElement(By.id("rip-login-password")).sendKeys(getdecodeString());
	        Thread.sleep(5000);
	        driver.findElement(By.id("rip-login-password")).submit();
	        Thread.sleep(5000);

	        //rip-user-name ng-binding      
	       // AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.lgnnamepath)));
	               
	        String pathName = driver.findElement(By.className("rip-user-name")).getText();
	        System.out.println(pathName);
	        
	        AppData.waitForElement(driver, driver.findElement(By.className("rip-user-name")));
	        
	        Assert.assertEquals("Harish Salunkhe", AppData.getPathName(driver, AppData.lgnnamepath));
	        
	        Assert.assertEquals("Manage", AppData.getPathName(driver, AppData.menuitempath));
		    
		    Assert.assertEquals("Campaigns", AppData.getPathName(driver, AppData.submenupath));
		       
		    Assert.assertEquals("Search", AppData.getPathName(driver, AppData.searchbtnpath));
		           
	        }catch(TimeoutException toe){
	        	System.out.println(toe.toString());
	        	
	        }
}

public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
				
				//Convert web driver object to TakeScreenshot
				TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        		//Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                //Move image file to new destination
                File DestFile=new File(fileWithPath);
                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
 

    }

	public static void takeScreenshotOfWebelement(WebDriver webdriver,WebElement element,
	String screenshotName) throws Exception {
	File v = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
	BufferedImage bi = ImageIO.read(v);
	org.openqa.selenium.Point p = element.getLocation();
	int n = element.getSize().getWidth();
	int m = element.getSize().getHeight();
	BufferedImage d = bi.getSubimage(p.getX(), p.getY(), n, m);
	ImageIO.write(d,"png", v);

	FileUtils.copyFile(v, new File(screenshotName+".png"));
	}
	
	public static void waitForElement(WebDriver webdriver,WebElement element) {

		WebDriverWait wait = new WebDriverWait(webdriver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		
	public static String getPathName(WebDriver webdriver,String path){
		
		String pathName= webdriver.findElement(By.xpath(path)).getText();
		return pathName;
		
	}
	
	public static String getdecodeString(){
		
		//String pathName= webdriver.findElement(By.xpath(path)).getText();
		String decoded= new String(Base64.decodeBase64("aGFyaXNoMTIz"));
		return decoded;
		
	}
	
	public static void searchMerchant(WebDriver driver, String ripId){
		
	        AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.searchtxtpath)));
  	        
	        //driver.findElement(By.xpath(AppData.drpboxtextpath)).click();
		driver.findElement(By.xpath(AppData.searchtxtpath)).clear();
		driver.findElement(By.xpath(AppData.searchtxtpath)).sendKeys(ripId);
			driver.findElement(By.xpath(AppData.searchbtnpath1)).click();
			
	}
	
	
	public static void changeClient(WebDriver driver, String clientName) throws InterruptedException{
		 
		AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.drpboxtextpath)));
	        
	       // driver.findElement(By.xpath(AppData.drpboxtextpath)).click();
			//driver.findElement(By.xpath(AppData.drpboxtextpath)).clear();
			//driver.findElement(By.xpath(AppData.drpboxtextpath)).sendKeys(clientName);
			driver.findElement(By.xpath(AppData.drpboxtextpath)).sendKeys(Keys.CONTROL, Keys.chord("a"));
			driver.findElement(By.xpath(AppData.drpboxtextpath)).sendKeys(Keys.BACK_SPACE);
			driver.findElement(By.xpath(AppData.drpboxtextpath)).sendKeys(clientName);
			driver.findElement(By.xpath(AppData.clientNamepath)).click();
	        //System.out.println("Clicked on dropdown.");
			Thread.sleep(500);
			
			//AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.listitempath)));
			
			//driver.findElement(By.xpath(AppData.listitempath)).click();
	        //Thread.sleep(500);
	        //System.out.println("Clicked on client.");
	       // logger.log(LogStatus.INFO, "Clicked on client.");
	        Thread.sleep(500);
	        AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.searchbtnpath)));
	      
		    Assert.assertEquals("Search", getPathName(driver, AppData.searchbtnpath));

	}
	
 	public static void createAd(WebDriver driver, String type, String vdoview) throws InterruptedException{
		
		driver.findElement(By.xpath(AppData.addimgorvideoLink)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.descriptiontxtareaPath)));
	        driver.findElement(By.xpath(AppData.descriptiontxtareaPath)).sendKeys(
					AppData.addescriptiontxt);
	        driver.findElement(By.xpath(AppData.destinationUrltxtPath)).sendKeys(
					AppData.addestinationurltxt);
	        driver.findElement(By.xpath(AppData.headlinetxtPath)).sendKeys(
					AppData.adheadlinetxt);
	        driver.findElement(By.xpath(AppData.adtextPath)).sendKeys(
					AppData.adtext);
	        driver.findElement(By.xpath(AppData.calltoactionbtnPath)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.calltoactionOptionPath)));
			driver.findElement(By.xpath(AppData.calltoactionOptionPath)).click();
			
			driver.findElement(By.xpath(AppData.findimgorvideoBtnPath)).click();
			Thread.sleep(1500);
		
			if(type=="image"){
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.firstimgPath)));
			Thread.sleep(1500);
			driver.findElement(By.xpath(AppData.firstimgPath)).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(AppData.selectimgOkBtnPath)).click();
			}else if (type=="video"){
				
				//fbpgchkboxPath//imgchkboxPath//vdochkboxPath
				if(vdoview=="0"){
				Thread.sleep(5000);
				AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.fbpgchkboxPath)));
				driver.findElement(By.xpath(AppData.fbpgchkboxPath)).click();

				Thread.sleep(5000);
				AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.imgchkboxPath)));
				driver.findElement(By.xpath(AppData.imgchkboxPath)).click();
				}else if(vdoview=="1"){
					//not unchecking/unselecting the checkbox
				}
				Thread.sleep(5000);
				AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.firstvdoPath)));
				driver.findElement(By.xpath(AppData.firstvdoPath)).click();
				driver.findElement(By.xpath(AppData.selectimgOkBtnPath)).click();			
			}
			Thread.sleep(1500);
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.adOkBtnPath)));
			driver.findElement(By.xpath(AppData.adOkBtnPath)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.adcopyheadlinetxt)));
			Thread.sleep(5000);
			Assert.assertEquals(AppData.adheadlinetxt, getPathName(driver, AppData.adcopyheadlinetxt));
			Thread.sleep(5000);
	}

public static void createReachAd(WebDriver driver, String type, String withdata) throws InterruptedException{
					
	driver.findElement(By.xpath(AppData.addimgorvideoLink)).click();
	AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.descriptiontxtareaPath)));
    driver.findElement(By.xpath(AppData.descriptiontxtareaPath)).sendKeys(
			AppData.addescriptiontxt);
    
    if(withdata=="1"){
    	//sendtraficchkboxPath
    	driver.findElement(By.xpath(AppData.sendtraficchkboxPath)).click();
    	driver.findElement(By.xpath(AppData.reachdestinationUrltxtPath)).sendKeys(
				AppData.addestinationurltxt);
        driver.findElement(By.xpath(AppData.reachheadlinetxtPath)).sendKeys(
				AppData.adheadlinetxt);
        driver.findElement(By.xpath(AppData.reachadtextPath)).sendKeys(
				AppData.adtext);
        driver.findElement(By.xpath(AppData.reachcalltoactionbtnPath)).click();
		AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.reachcalltoactionOptionPath)));
		driver.findElement(By.xpath(AppData.reachcalltoactionOptionPath)).click();
		
		driver.findElement(By.xpath(AppData.reachfindimgorvdobtn1)).click();
		Thread.sleep(1500);
		//System.out.println("inside withdata 1 ="+AppData.adheadlinetxt);
    }else if(withdata=="0"){
    	//System.out.println("inside withdata 0 ="+AppData.adheadlinetxt);
    	//AppData.adheadlinetxt="N/A";
    	driver.findElement(By.xpath(AppData.reachfindimgorvdobtn)).click();
		Thread.sleep(1500);
    }
    	        
	

	if(type=="image"){
	AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.firstimgPath)));
	driver.findElement(By.xpath(AppData.firstimgPath)).click();
	driver.findElement(By.xpath(AppData.selectimgOkBtnPath)).click();
	}else if (type=="video"){
		//fbpgchkboxPath//imgchkboxPath//vdochkboxPath
		Thread.sleep(5000);
		AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.fbpgchkboxPath)));
		driver.findElement(By.xpath(AppData.fbpgchkboxPath)).click();

		Thread.sleep(5000);
		AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.imgchkboxPath)));
		driver.findElement(By.xpath(AppData.imgchkboxPath)).click();
		
		Thread.sleep(5000);
		AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.firstvdoPath)));
		Thread.sleep(500);
		driver.findElement(By.xpath(AppData.firstvdoPath)).click();
		driver.findElement(By.xpath(AppData.selectimgOkBtnPath)).click();			
	}
	driver.findElement(By.xpath(AppData.adOkBtnPath)).click();

	AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.adchkbox)));
	Thread.sleep(5000);

	//Assert.assertEquals(AppData.adheadlinetxt, data.getPathName(driver, AppData.adcopyheadlinetxt));

			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.adcopyheadlinetxt)));
			Thread.sleep(5000);
			//Assert.assertEquals(AppData.adheadlinetxt, getPathName(driver, AppData.adcopyheadlinetxt));

	}


	public static void createSegment(WebDriver driver, String segnm, String option) throws InterruptedException{
		
		driver.findElement(By.xpath(AppData.addSegmentLable)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.segmentNametextpath)));
		
  	    driver.findElement(By.xpath(AppData.segmentNametextpath)).clear();
			driver.findElement(By.xpath(AppData.segmentNametextpath)).sendKeys(
					segnm);
			Thread.sleep(500);
			
			driver.findElement(By.xpath(AppData.segmentTypebtnpath)).click();
			Thread.sleep(500);
			//driver.findElement(By.xpath(AppData.segmentTypetextpath)).sendKeys("Social Express");
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.segmentTypetextitempath)));
			driver.findElement(By.xpath(AppData.segmentTypetextitempath)).click();
			Thread.sleep(500);
			
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.objectiveLablepath)));
			if(option == "1"){
				driver.findElement(By.xpath(AppData.objectoptionradiobtn1path)).click();
			}else if (option == "2"){
				driver.findElement(By.xpath(AppData.objectoptionradiobtn2path)).click();				
			}else if (option == "3"){
				driver.findElement(By.xpath(AppData.objectoptionradiobtn3path)).click();				
			}else if (option == "4"){
				driver.findElement(By.xpath(AppData.objectoptionradiobtn4path)).click();				
			}
			//driver.findElement(By.xpath(AppData.objectoptionradiobtn2path)).click();
			//driver.findElement(By.xpath(AppData.objectoptionradiobtn3path)).click();
			//driver.findElement(By.xpath(AppData.objectoptionradiobtn4path)).click();
	        //System.out.println("Clicked on accountNamepath.");
			driver.findElement(By.xpath(AppData.segmentOkbtnpath)).click();
			Thread.sleep(500);
			
	       // logger.log(LogStatus.INFO, "Clicked on account.");
	        Thread.sleep(500);
	        //AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.segmentTypetextpath)));

	      AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.segmentNamelablepath)));
	       

	       //System.out.println("drpboxname = "+ data.getPathName(driver, AppData.campaignNameLable));
	       
	       Assert.assertEquals(segnm, getPathName(driver, AppData.segmentNamelablepath));
	       
	      // System.out.println(segName +" segment created.");

	}
	
	public static void addFbPage(WebDriver driver) throws InterruptedException{

			driver.findElement(By.xpath(AppData.fbpageEditLink)).click();
			driver.findElement(By.xpath(AppData.fbpageUrlText)).sendKeys(
					AppData.matchcraftFbPage);
			driver.findElement(By.xpath(AppData.lookupBtn)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.autogeoTargetCheckbox)));
			driver.findElement(By.xpath(AppData.autogeoTargetCheckbox)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.radiusLable)));
			Assert.assertEquals("miles radius", getPathName(driver, AppData.radiusLable));
			Thread.sleep(1500);
			driver.findElement(By.xpath(AppData.fbOkBtn)).click();
			Assert.assertEquals("Page access has been approved", getPathName(driver, AppData.fbpageaccessapproveLable));
			//Assert.assertEquals("within 10 miles", data.getPathName(driver, AppData.geoitemlistLable));
			//Assert.assertEquals("within 10 miles of 34.01845, -118.45701", getPathName(driver, AppData.geoitemlistLable));
	
	}

	public static void createpgLikeAd(WebDriver driver, String type, String vdoview) throws InterruptedException{
		
			driver.findElement(By.xpath(AppData.addimgorvideoLink)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.descriptiontxtareaPath)));
	        driver.findElement(By.xpath(AppData.descriptiontxtareaPath)).sendKeys(
					AppData.addescriptiontxt);
	     /*   driver.findElement(By.xpath(AppData.destinationUrltxtPath)).sendKeys(
					AppData.addestinationurltxt);
	        driver.findElement(By.xpath(AppData.headlinetxtPath)).sendKeys(
					AppData.adheadlinetxt);
	        driver.findElement(By.xpath(AppData.adtextPath)).sendKeys(
					AppData.adtext);
	        driver.findElement(By.xpath(AppData.calltoactionbtnPath)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.calltoactionOptionPath)));
			driver.findElement(By.xpath(AppData.calltoactionOptionPath)).click();
			*/
			driver.findElement(By.xpath(AppData.pglikefindimgorvideoBtnPath)).click();
			Thread.sleep(1500);
		
			if(type=="image"){
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.firstimgPath)));
			Thread.sleep(1500);
			driver.findElement(By.xpath(AppData.firstimgPath)).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(AppData.selectimgOkBtnPath)).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(AppData.pglikeheadlinetxtPath)).sendKeys(
					AppData.adheadlinetxt);
	        driver.findElement(By.xpath(AppData.pglikeadtextPath)).sendKeys(
					AppData.adtext);			
	        Thread.sleep(1500);
			}else if (type=="video"){
				
				//fbpgchkboxPath//imgchkboxPath//vdochkboxPath
				if(vdoview=="0"){
				Thread.sleep(5000);
				AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.fbpgchkboxPath)));
				driver.findElement(By.xpath(AppData.fbpgchkboxPath)).click();

				Thread.sleep(5000);
				AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.imgchkboxPath)));
				driver.findElement(By.xpath(AppData.imgchkboxPath)).click();
				}else if(vdoview=="1"){
					//not unchecking/unselecting the checkbox
				}
				Thread.sleep(5000);
				AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.firstvdoPath)));
				driver.findElement(By.xpath(AppData.firstvdoPath)).click();
				driver.findElement(By.xpath(AppData.selectimgOkBtnPath)).click();			
			}
			Thread.sleep(1500);
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.adOkBtnPath)));
			driver.findElement(By.xpath(AppData.adOkBtnPath)).click();
			AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.adcopyheadlinetxt)));
			Thread.sleep(5000);
			//Assert.assertEquals(AppData.adheadlinetxt, getPathName(driver, AppData.adcopyheadlinetxt));
			Thread.sleep(5000);
	}

}