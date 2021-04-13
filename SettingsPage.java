package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
	
	static WebElement element = null;
	public static WebElement addcategory(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add Category']"));
	return element;
	}
    public static WebElement placeholder(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Category Name']"));
	return element;
	}
    public static WebElement locationname(WebDriver driver)
	{
	element = driver.findElement(By.id("location_name"));
	return element;
	}
    public static WebElement locationshortname(WebDriver driver)
	{
	element = driver.findElement(By.id("location_shortname"));
	return element;
	}
    public static WebElement addressstreet(WebDriver driver)
	{
	element = driver.findElement(By.id("address_street"));
	return element;
	}
    public static WebElement addresscity(WebDriver driver)
	{
	element = driver.findElement(By.id("address_city"));
	return element;
	}
    public static WebElement addresszip(WebDriver driver)
	{
	element = driver.findElement(By.id("address_zip"));
	return element;
	}
    public static WebElement locateonmap(WebDriver driver)
	{
	element = driver.findElement(By.id("siteEditLocateBtn"));
	return element;
	}
    public static WebElement save(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[contains(@class,'map-menu active')]//a[contains(@class,'standardButton blue')]"));
	return element;
	}
    public static WebElement sitetype(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@id='location_style']//div[contains(@class,'staticPlaceholder')]"));
	return element;
	}
    public static WebElement lowrise(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='Low-rise']"));
	return element;
	}
    public static WebElement addressunitcount(WebDriver driver)
	{
	element = driver.findElement(By.id("address_unitCount"));
	return element;
	}
    public static WebElement siteclass(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Site Class']"));
	return element;
	}
    public static WebElement A(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='A++']"));
	return element;
	}
    public static WebElement conventional(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@class='ember-view']//label[text()='Conventional']"));
	return element;
	}
    public static WebElement savesettings(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit blue enabled']"));
	return element;
	}
    public static WebElement addratinggroup(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add Rating Group']"));
	return element;
	}
    public static WebElement ratinggroupname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@maxlength='60']"));
	return element;
	}
    public static WebElement addscoringvalue(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Add scoring values for each rating']"));
	return element;
	}
    public static WebElement ratingname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Rating Name']"));
	return element;
	}
    public static WebElement colourpalette(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='blank-button palette']"));
   	return element;
   	}
    public static WebElement colour(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[@title='#52a7f9']"));
   	return element;
   	}
    public static WebElement number(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@type='number']"));
   	return element;
   	}
    public static WebElement requestadditionaldetails(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Request additional details']"));
   	return element;
   	}
    public static WebElement photo(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h5[text()='Photo']"));
   	return element;
   	}
    public static WebElement required(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Required']"));
   	return element;
   	}
    public static WebElement iconcompletionnote(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[@class='icon completion-note']"));
   	return element;
   	}
    public static WebElement iconcompletioncost(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[@class='icon completion-cost']"));
   	return element;
   	}
    public static WebElement togglecontainercost(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[@class='icon completion-cost']"));
   	return element;
   	}
    public static WebElement savedetails(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue  ']"));
   	return element;
   	}
    public static WebElement ratingname2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@style='background-color:#EF0000;']//input[@placeholder='Rating Name']"));
   	return element;
   	}
    public static WebElement clickanddragratings(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Click and drag ratings to reorder']"));
   	return element;
   	}
    public static WebElement submit(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit green  ']"));
   	return element;
   	}
    public static WebElement autogroup(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Automation Group']"));
   	return element;
   	}
    public static WebElement editautogroup(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//label[@class='ember-view sw-input v2']//input[@class='ember-view ember-text-field']"));
   	return element;
   	}
    public static WebElement rating12(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@style='background-color:#52a7f9;']//input[@placeholder='Rating Name']"));
   	return element;
   	}
    public static WebElement bgcolor(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@style='background-color:#52a7f9;']"));
   	return element;
   	}
    public static WebElement anothercolor(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[@title='#0a882b']"));
   	return element;
   	}
    public static WebElement score(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@style='padding-left: 50px']"));
   	return element;
   	}
    public static WebElement iconrightactive(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//a[@class='sp-link inline icon-right active']"));
   	return element;
   	}
    public static WebElement save1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue  ']"));
   	return element;
   	}
    public static WebElement save12(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit blue  ']"));
   	return element;
   	}
    public static WebElement drg(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton cancel destructive-hover']"));
   	return element;
   	}
    public static WebElement dg(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton destructive ']"));
   	return element;
   	}
    public static WebElement switchknob(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='ember-view sp-switch blank-button']//div[@class='switch-knob']"));
   	return element;
   	}
    public static WebElement enableautoclose(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@type='text']"));
   	return element;
   	}
    public static WebElement enableautoclosebutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
   	return element;
   	}
    public static WebElement switchknob2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='ember-view sp-switch blank-button on']//div[@class='switch-knob']"));
   	return element;
   	}
    public static WebElement workspace(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[text()='Workspace:']"));
   	return element;
   	}
    public static WebElement residentissue(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//li[@data-id='resident-issue']"));
   	return element;
   	}
    public static WebElement editbutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='edit-button']"));
   	return element;
   	}
    public static WebElement administration(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@data-icon-id='administration']"));
   	return element;
   	}
    public static WebElement enablecategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h5[text()='Category']"));
   	return element;
   	}
    public static WebElement categorydescription(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='Optional: Provide a description if the Category name is not clear enough.']"));
   	return element;
   	}
    public static WebElement description(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h3[text()='Description']"));
   	return element;
   	}
    public static WebElement tags(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='sidebar-content sp-panel active']//div[@class='ember-view sp-tag-entry']//span[@class='drop-down-icon']"));
   	return element;
   	}
    public static WebElement categorytags(WebDriver driver)
   	{
   	element = driver.findElement(By.id("category_tags"));
   	return element;
   	}
    public static WebElement categorytagstooltip(WebDriver driver)
   	{
   	element = driver.findElement(By.id("category_tags_tooltip"));
   	return element;
   	}
    public static WebElement addasynomyn(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='Add a synonym, like “Fridge” for refrigerator.']"));
   	return element;
   	}
    public static WebElement sightplan(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h4[text()='SightPlan']"));
   	return element;
   	}
    public static WebElement category(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[text()='Category:']"));
   	return element;
   	}
    public static WebElement worktype(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//li[@data-id='worktype-voicemail']"));
   	return element;
   	}
    public static WebElement addresource(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[contains(@class,'blue enabled')]"));
   	return element;
   	}
    public static WebElement uploadbutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='upload-button ']"));
   	return element;
   	}
    public static WebElement addlink(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[@title='Add Link...']"));
   	return element;
   	}
    public static WebElement weburl(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@placeholder='example.com']"));
   	return element;
   	}
    public static WebElement label(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@placeholder='URL Label (optional)']"));
   	return element;
   	}
    public static WebElement addlinkbutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue ']"));
   	return element;
   	}
    public static WebElement placeholder2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='Add a description of this resource. Describe what it is and why it is important to review.']"));
   	return element;
   	}
    public static WebElement requireresource(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h5[text()='Require resource review to close task']"));
   	return element;
   	}
    public static WebElement requireforeverytask(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//label[text()='Required for every task']"));
   	return element;
   	}
    public static WebElement viewtaskdetails(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//label[text()='View task details']"));
   	return element;
   	}
    public static WebElement closetask(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//label[text()='Close task']"));
   	return element;
   	}
    public static WebElement Requiredforeverytask(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//label[text()='Required for every task']"));
   	return element;
   	}
    public static WebElement onlyrequiredonetime(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//label[text()='Only required one time']"));
   	return element;
   	}
    public static WebElement submit3(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  blue enabled']"));
   	return element;
   	}
    
    public static WebElement tasks(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Notify people when task created']"));
   	return element;
   	}
    public static WebElement setdocumentationbycategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Set documentation by Category']"));
   	return element;
   	}
    public static WebElement taskdocumentation(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//section[@class='task-documentation']"));
   	return element;
   	}
    public static WebElement documentation(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[text()='Documentation:']"));
   	return element;
   	}
    public static WebElement checkmark(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container   open']//li[@data-id='checkmark']"));
   	return element;
   	}
    public static WebElement settaskasurgent(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h5[text()='Set Task to Urgent']"));
   	return element;
   	}
    public static WebElement availabletoresidents(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h5[text()='Available to Residents']"));
   	return element;
   	}
    public static WebElement placeholder1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='If a resident selects the Category during a request, you can provide further instructions to them.']"));
   	return element;
   	}
    public static WebElement textsometimes(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Sometimes extra instructions to your residents are necessary. This note will appear during resident task creation.']"));
   	return element;
   	}
    public static WebElement button(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@tabindex='6']"));
   	return element;
   	}
    public static WebElement placeholder3(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@tabindex='6']"));
   	return element;
   	}
    public static WebElement requiresubcategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h5[text()='Require Subcategory to Close Task']"));
   	return element;
   	}
    public static WebElement save2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  green enabled']"));
   	return element;
   	}
    public static WebElement Autotest(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Auto Test']"));
   	return element;
   	}
    public static WebElement addsubcategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Add Subcategory...']"));
   	return element;
   	}
    public static WebElement addsubcategoryplaceholder(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@placeholder='Subcategory Name']"));
   	return element;
   	}
    public static WebElement addsubcategorytextarea(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='Optional: Provide a description if the Subcategory name is not clear enough.']"));
   	return element;
   	}
    public static WebElement addresourcebutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[text()='Add Resource']"));
   	return element;
   	}
    public static WebElement addlbutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[text()='Add Link']"));
   	return element;
   	}
    public static WebElement addtasksettings(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[text()='Add Task Settings']"));
   	return element;
   	}
    public static WebElement text(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Require users to open the support resource document before they can close tasks with this ']"));
   	return element;
   	}
    public static WebElement setdocumentationbysubcategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Set documentation by Subcategory']"));
   	return element;
   	}
    public static WebElement instructionsforresidents(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h3[text()='Instructions for Residents']"));
   	return element;
   	}
    public static WebElement ph(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='If a resident selects the Subcategory during a request, you can provide further instructions to them.']"));
   	return element;
   	}
    public static WebElement confirmationquestion(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h5[text()=' Confirmation Question']"));
   	return element;
   	}
    public static WebElement qualifierquestion(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h3[text()='Qualifier Question']"));
   	return element;
   	}
    public static WebElement ph2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='Example: Urgent requests within this category should be limited to X, Y and/or Z.  Does your request meet these requirements?']"));
   	return element;
   	}
    public static WebElement greenbutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  green enabled']"));
   	return element;
   	}
    public static WebElement disablecategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Disable ']"));
   	return element;
   	}
    public static WebElement disablecategorybutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[text()='Disable ']"));
   	return element;
   	}
    public static WebElement updatecategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@style='width: 500px; margin-left: -250px; padding-bottom: 0px; top: 50%; opacity: 1;']//span[@class='drop-down-icon']"));
   	return element;
   	}
    public static WebElement worktypevoicemail(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//li[@data-id='worktype-voicemail']"));
   	return element;
   	}
    public static WebElement updatetasksbutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
   	return element;
   	}
    public static WebElement headerupdateopentasks(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//header[text()='Update Open Tasks']"));
   	return element;
   	}
    public static WebElement enablecategory1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Enable ']"));
   	return element;
   	}
    public static WebElement enablecategorybutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[text()='Enable Category']"));
   	return element;
   	}
    public static WebElement deletecategory(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Delete ']"));
   	return element;
   	}
    public static WebElement deletecategorybutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton destructive']"));
   	return element;
   	}
    public static WebElement selectday(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@tabindex='3']//span[text()='Select Day']"));
   	return element;
   	}
    public static WebElement remove(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='blank-button remove']"));
   	return element;
   	}
    public static WebElement sunday(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//li[@data-id='1']"));
   	return element;
   	}
    public static WebElement selectday2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='ember-view sw-select-container day inactive']//span[text()='Select Day']"));
   	return element;
   	}
    public static WebElement friday(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='ember-view sw-select-container day inactive']//li[@data-id='6']"));
   	return element;
   	}
    public static WebElement nineam(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='9:00 AM (EDT)']"));
   	return element;
   	}
    public static WebElement nineam2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//ul[@class='sw-select-list ']//span[text()='9:30 AM (EDT)']"));
   	return element;
   	}
    public static WebElement five(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@tabindex='3']//span[text()='5:00 PM (EDT)']"));
   	return element;
   	}
    public static WebElement five2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//li[@data-id='17:30']"));
   	return element;
   	}
    public static WebElement leasingoffice(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='fields clearfix']//label[@class='ember-view sw-input type']//input[@placeholder='Name']"));
   	return element;
   	}
    public static WebElement phonenumber(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='fields clearfix']//label[@class='ember-view sw-input phone']//input[@tabindex='4']"));
   	return element;
   	}
    public static WebElement email(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='fields clearfix']//label[@class='ember-view sw-input email']//input[@tabindex='4']"));
   	return element;
   	}
    public static WebElement schedulednotifications(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h2[text()='Scheduled Notifications']"));
   	return element;
   	}
    public static WebElement sendnotificationsat(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='ember-view sw-select-container active time']//div[@tabindex='5']"));
   	return element;
   	}
    public static WebElement nine(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//li[@data-id='0930']"));
   	return element;
   	}
    public static WebElement siteactivitydigestemail(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Enable the option(s) below to send a daily and/or weekly summary of site activity:']"));
   	return element;
   	}
    public static WebElement daily(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Daily']"));
   	return element;
   	}
    public static WebElement weekly(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//p[text()='Weekly']"));
   	return element;
   	}
    public static WebElement save3(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
   	return element;
   	}
    public static WebElement image1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='upload']//img[@style='width: auto; height: 150px;']"));
   	return element;
   	}
    public static WebElement brandcolor(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h3[text()='Brand Color']"));
   	return element;
   	}
    public static WebElement color(WebDriver driver)
   	{
   	element =  driver.findElement(By.xpath("//button[@id='brand_color_palette']//span"));
   	return element;
   	}
    public static WebElement color1(WebDriver driver)
   	{
   	element =  driver.findElement(By.xpath("//span[@title='#164e86']"));
   	return element;
   	}
    public static WebElement resettodefault(WebDriver driver)
   	{
   	element =  driver.findElement(By.xpath("//a[text()='Reset to Default']"));
   	return element;
   	}
    public static WebElement residentportaldomain(WebDriver driver)
   	{
   	element =  driver.findElement(By.xpath("//h2[text()='Resident Portal Domain']"));
   	return element;
   	}
    public static WebElement choosename(WebDriver driver)
   	{
   	element =  driver.findElement(By.xpath("//input[@id='resident_domain_name']"));
   	return element;
   	}
    public static WebElement residentserviceintegrations(WebDriver driver)
   	{
   	element =  driver.findElement(By.xpath("//h2[text()='Resident Service Integrations']"));
   	return element;
   	}
    public static WebElement onlinerentpayment(WebDriver driver)
   	{
   	element =  driver.findElement(By.xpath("//button[@class='ember-view sp-switch blank-button']"));
   	return element;
   	}
    public static WebElement onlinerentpaymentph(WebDriver driver)
   	{
   	element =   driver.findElement(By.id("online_rent_payment"));
   	return element;
   	}
    public static WebElement marketingintegrations(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//h2[text()='Marketing Integrations']"));
   	return element;
   	}
    public static WebElement websiteurl(WebDriver driver)
   	{
   	element =   driver.findElement(By.id("website_url"));
   	return element;
   	}
    public static WebElement residentservicesave(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
   	return element;
   	}
    
    public static WebElement residentservicetasks(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//a[text()='Tasks']"));
   	return element;
   	}
    public static WebElement reopeningtasks(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//strong[text()='Prevent residents from reopening tasks of a certain age']"));
   	return element;
   	}
    public static WebElement reopeningtasksph(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@maxlength='4']"));
   	return element;
   	}
    public static WebElement residentservicemarketplace(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//a[text()='Marketplace']"));
   	return element;
   	}
    public static WebElement configure(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//a[contains(text(),'Configure')]"));
   	return element;
   	}
    public static WebElement enableyelp(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@class='switch-knob']"));
   	return element;
   	}
    public static WebElement disableyelp(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[@class='standardButton destructive right ']"));
   	return element;
   	}
    public static WebElement distanceradius(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@class='input-container         ']//div[text()='Distance Radius:']"));
   	return element;
   	}
    public static WebElement miles4(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//li[@data-id='8046']"));
   	return element;
   	}
    public static WebElement miles5(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//li[@data-id='8046']"));
   	return element;
   	}
    public static WebElement businesses(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//a[contains(text(),'Businesses')]"));
   	return element;
   	}
    public static WebElement addbusiness(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[text()='Add Business']"));
   	return element;
   	}
    public static WebElement addbusinessph(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='Business Name']"));
   	return element;
   	}
    public static WebElement addbusinesscategory(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[text()='Category:']"));
   	return element;
   	}
    public static WebElement activelife(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@class='list-container selectro-list-container   open']//li[@data-id='active']"));
   	return element;
   	}
    public static WebElement visibletoresidents(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//h5[text()='Visible to Residents']"));
   	return element;
   	}
    public static WebElement address(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='1234 Street']"));
   	return element;
   	}
    
    public static WebElement address2(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='Apt./Suite']"));
   	return element;
   	}
    public static WebElement phone(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='(xxx) xxx-xxxx']"));
   	return element;
   	}
    public static WebElement description1(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//h3[text()='Description']"));
   	return element;
   	}
    public static WebElement descriptionph(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@tabindex='4']"));
   	return element;
   	}
    public static WebElement dropfiletoattach(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@class='upload-button ']"));
   	return element;
   	}
    public static WebElement offer(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Offer']"));
   	return element;
   	}
    public static WebElement offertitle(WebDriver driver)
   	{
   	element =   driver.findElement(By.id("deal_title"));
   	return element;
   	}
    public static WebElement weburl1(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='example.com']"));
   	return element;
   	}
    public static WebElement placeholder4(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@tabindex='6']"));
   	return element;
   	}
    public static WebElement daterange(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//h3[text()='Date Range']"));
   	return element;
   	}
    public static WebElement startdate(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[text()='Start Date']"));
   	return element;
   	}
    public static WebElement date(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//a[text()='30']"));
   	return element;
   	}
    public static WebElement createbusiness(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Create Business']"));
   	return element;
   	}
    public static WebElement createdby(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@class='input-container         filter-btn']//div[text()='Created by']"));
   	return element;
   	}
    public static WebElement sammyd(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[@title='sammy d']"));
   	return element;
   	}
    public static WebElement header(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@class='ember-view sp-action-bar']"));
   	return element;
   	}
    public static WebElement triple(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[text()='Triple H Gym']"));
   	return element;
   	}
    public static WebElement deletebusiness(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[text()='Delete Business...']"));
   	return element;
   	}
    
    public static WebElement deletebusinessbutton(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Delete Business']"));
   	return element;
   	}
    public static WebElement customcontentlink(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//a[text()='Custom Content']"));
   	return element;
   	}
    public static WebElement addsection(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Add Section']"));
   	return element;
   	}
    public static WebElement sectionname(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='Section Name']"));
   	return element;
   	}
    public static WebElement ph4(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[@tabindex='5']"));
   	return element;
   	}
    public static WebElement createsection(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Create Section']"));
   	return element;
   	}
    public static WebElement automation(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[text()='Automation']"));
   	return element;
   	}
    public static WebElement addsubsection(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[text()='Add Subsection...']"));
   	return element;
   	}
    public static WebElement subsectionname(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='Subsection Name']"));
   	return element;
   	}
    public static WebElement contenttype(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[text()='Content Type:']"));
   	return element;
   	}
    public static WebElement subsectionweburl(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[@title='Web URL']"));
   	return element;
   	}
    public static WebElement weburlplaceholder(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//input[@placeholder='example.com']"));
   	return element;
   	}
    public static WebElement createsubsection(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Create Subsection']"));
   	return element;
   	}
    public static WebElement deletesection(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//li[@class='sp-context-menu-item']//span[text()='Delete ']"));
   	return element;
   	}
    public static WebElement deletesectionbutton(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Delete Section']"));
   	return element;
   	}
    public static WebElement addannouncement(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[@title='Add an announcement [N]']"));
   	return element;
   	}
    public static WebElement business(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//div[text()='Business:']"));
   	return element;
   	}
    public static WebElement businessdropdown(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//li[@data-id='ZpwuFRTsbkssDMeSGWQGRw']"));
   	return element;
   	}
    public static WebElement createannouncement(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Create Announcement']"));
   	return element;
   	}
    public static WebElement a3(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[text()='3']"));
   	return element;
   	}
    public static WebElement deleteannouncement(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//span[text()='Delete Announcement...']"));
   	return element;
   	}
    public static WebElement deleteannouncementbutton(WebDriver driver)
   	{
   	element =   driver.findElement(By.xpath("//button[text()='Delete Announcement']"));
   	return element;
   	}
    
}
