package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tasksPage {
	
	static WebElement element = null;
	
	
	
	public static WebElement sightplaninc(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='© SightPlan Inc. All Rights Reserved.']"));
	return element;
	}
	public static WebElement portfolio(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h1[text()='Portfolio']"));
	return element;
	}
	
	
	public static WebElement addsite(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add Site']"));
	return element;
	}
	public static WebElement sitename(WebDriver driver)
	{
	element = driver.findElement(By.id("location_name"));
	return element;
	}
	public static WebElement siteshortname(WebDriver driver)
	{
	element = driver.findElement(By.id("location_shortname"));
	return element;
	}
	public static WebElement officephone(WebDriver driver)
	{
	element = driver.findElement(By.id("location_phone"));
	return element;
	}
	public static WebElement address(WebDriver driver)
	{
	element = driver.findElement(By.id("address_street"));
	return element;
	}
	public static WebElement city(WebDriver driver)
	{
	element = driver.findElement(By.id("address_city"));
	return element;
	}
	public static WebElement state(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='sw-select-box  ']//span[text()='State']"));
	return element;
	}
	public static WebElement fl(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='FL']"));
	return element;
	}
	public static WebElement zip(WebDriver driver)
	{
	element = driver.findElement(By.id("address_zip"));
	return element;
	}
	public static WebElement typeofsite(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='sw-select-box  ']//span[text()='Type of Site']"));
	return element;
	}
	public static WebElement lowrise(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='Low-rise']"));
	return element;
	}
	public static WebElement numberofunits(WebDriver driver)
	{
	element = driver.findElement(By.id("address_unitCount"));
	return element;
	}
	public static WebElement locateonmap(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//fieldset//button[1]"));
	return element;
	}
	public static WebElement zoomin(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[contains(@class,'zoomIn enable')]//span[contains(@class,'hover')]"));
	return element;
	}
	public static WebElement zoomout(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[contains(@class,'zoomOut enable')]//span[contains(@class,'hover')]"));
	return element;
	}
	public static WebElement create(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton green  enabled']"));
	return element;
	}
	public static WebElement addresss(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='address']"));
	return element;
	}
	public static WebElement sites(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='filter-bar-content']//div[@class='input-container         filter-btn']//div[text()='Site: ATS']"));
	return element;
	}
	public static WebElement ats(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='ATS']"));
	return element;
	}
	public static WebElement header(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-action-bar']"));
	return element;
	}
	public static WebElement Settings(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Settings']"));
	return element;
	}
	public static WebElement deletebutton(WebDriver driver)
	{
	element = driver.findElement(By.id("site_delete_button"));
	return element;
	}
	public static WebElement deletethissite(WebDriver driver)
	{
	element = driver.findElement(By.id("site_delete_input"));
	return element;
	}
	public static WebElement deletesite(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Delete Site']"));
	return element;
	}
	public static WebElement tswithlinks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='ts with links']"));
	return element;
	}
	public static WebElement save(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Save Edited View']"));
	return element;
	}
	public static WebElement viewname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='View name']"));
	return element;
	}
	public static WebElement saveview(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
	return element;
	}
	public static WebElement ellipse(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro three-dots-horizontal']"));
	return element;
	}
	public static WebElement renameview(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Rename View...']"));
	return element;
	}
	public static WebElement renameviewplaceholder(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Name']"));
	return element;
	}
	public static WebElement renameviewsaveview(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue  ']"));
	return element;
	}
	public static WebElement deleteview(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Delete View...']"));
	return element;
	}
	public static WebElement deleteviewred(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton destructive right ']"));
	return element;
	}
	public static WebElement opentasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h1[text()='Open Tasks']"));
	return element;
	}
	public static WebElement openresidentreportedtasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Open Resident Reported Tasks']"));
	return element;
	}
	public static WebElement openenteranytimetasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Open Enter Any Time Tasks']"));
	return element;
	}
	public static WebElement OpenContactMeFirstTasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Open Contact Me First Tasks']"));
	return element;
	}
	public static WebElement ResidentRatedTasksthisMonth(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Resident Rated Tasks this Month']"));
	return element;
	}
	public static WebElement openresidentreportedtasksh1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h1[text()='Open Resident Reported Tasks']"));
	return element;
	}
	public static WebElement OpenEnterAnyTimeTasksh1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h1[text()='Open Enter Any Time Tasks']"));
	return element;
	}
	public static WebElement OpenContactMeFirstTasksh1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h1[text()='Open Contact Me First Tasks']"));
	return element;
	}
	public static WebElement discardchanges(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue right ']"));
	return element;
	}
	public static WebElement exportlist(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@title='Export list [E]']"));
	return element;
	}
	public static WebElement printall(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@title='Print list [P]']"));
	return element;
	}
	public static WebElement printtasksbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue ']"));
	return element;
	}
	public static WebElement addanewtask(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='primary standardColors blue    ']"));
	return element;
	}
	public static WebElement category(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro classification-selectro']//div[@tabindex='4']//div[text()='Category:']"));
	return element;
	}
	public static WebElement worktypeappliances(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='primary']//li[@data-id='worktype-appliances']//div[@class='has-sub-view']"));
	return element;
	}
	public static WebElement dishwasher(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='worktype-appliances-worktypedetail-dishwasher']"));
	return element;
	}
	public static WebElement textarea(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Describe the task']"));
	return element;
	}
	public static WebElement residentreported(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Resident reported']"));
	return element;
	}
	public static WebElement resident(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Resident:']"));
	return element;
	}
	public static WebElement residentj(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='J']"));
	return element;
	}
	public static WebElement mj(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro-list']//span[text()='Michael Jackson']"));
	return element;
	}
	public static WebElement contactresidentfirst(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//label[text()='Contact resident first']"));
	return element;
	}
	public static WebElement textarea1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Add entry instructions on behalf of the resident reporting the task. Viewable by resident.']"));
	return element;
	}
	public static WebElement entryinstructions(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Entry Instructions (optional)']"));
	return element;
	}
	public static WebElement urgent(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[text()='Urgent']"));
	return element;
	}
	public static WebElement assignee(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Assignee:']"));
	return element;
	}
	public static WebElement csn(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='chandra sekhar n']"));
	return element;
	}
	public static WebElement documentation(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Close with:']"));
	return element;
	}
	public static WebElement note(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Note']"));
	return element;
	}
	public static WebElement tags(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Tags']"));
	return element;
	}
	public static WebElement tagcovid19(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='tag:76024304-cd5f-4688-8e2a-7c32f43fb6b6']"));
	return element;
	}
	public static WebElement createtaskbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton v2 mainSubmit green   ']"));
	return element;
	}
	public static WebElement addfilter(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Add Filter']"));
	return element;
	}
	public static WebElement createddate(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='createdAt']"));
	return element;
	}
	public static WebElement createdtoday(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container filter-mode  open']//li[@data-id='today']"));
	return element;
	}
	public static WebElement text(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Creation of Task']"));
	return element;
	}
	public static WebElement claim(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Claim']"));
	return element;
	}
	
	public static WebElement ellipse1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='blank-button task-menu   ']"));
	return element;
	}
	public static WebElement printtask(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon print']"));
	return element;
	}
	public static WebElement converttoproject(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Convert to Project...']"));
	return element;
	}
	public static WebElement placeholder(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Describe the project']"));
	return element;
	}
	public static WebElement addprojecttasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Add Project Tasks (1)']"));
	return element;
	}
	public static WebElement createproject(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Create Project']"));
	return element;
	}
	public static WebElement addprojectdropdown(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon down-white']"));
	return element;
	}
	public static WebElement addproject(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add Project']"));
	return element;
	}
	public static WebElement projectname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@style='padding-left: 90px']"));
	return element;
	}
	public static WebElement place(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='5']//div[text()='Place:']"));
	return element;
	}
	public static WebElement buildingquadrient(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Building Quadrient1']"));
	return element;
	}
	public static WebElement addprojecttasks1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Add Project Tasks']"));
	return element;
	}
	public static WebElement addprojecttask(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Add Project Task']"));
	return element;
	}
	public static WebElement addprojecttask2(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton v2 mainSubmit blue in-project  ']"));
	return element;
	}
	public static WebElement text2(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Project tasks can only be scheduled before the project is due.']"));
	return element;
	}
	public static WebElement assignee2(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='10']//div[text()='Assignee:']"));
	return element;
	}
	public static WebElement closewith(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='11']//div[text()='Close with:']"));
	return element;
	}
	public static WebElement note2(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container   open']//span[text()='Note']"));
	return element;
	}
	public static WebElement tags1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='12']//div[text()='Tags']"));
	return element;
	}
	public static WebElement schedule(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='9']//div[text()='Schedule:']"));
	return element;
	}
	public static WebElement custom(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='pick-date']"));
	return element;
	}
	public static WebElement datepicker(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='30']"));
	return element;
	}
	public static WebElement appliances(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='worktype-appliances']"));
	return element;
	}
	public static WebElement dtt(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Describe the task']"));
	return element;
	}
	public static WebElement text3(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='You can pin the location on the map (accessed via the toggle above).']"));
	return element;
	}
	public static WebElement place2(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Place:']"));
	return element;
	}
	public static WebElement repeating(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container   open']//li[@data-id='repeating']"));
	return element;
	}
	public static WebElement repeatingdaily(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='1']//span[text()='Daily']"));
	return element;
	}
	public static WebElement repeatingweekly(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='weekly']"));
	return element;
	}
	public static WebElement saverepeatingseries(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Save Repeating Series']"));
	return element;
	}
	public static WebElement repeatingseriesfilter(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container filter-mode open']//li[@data-id='repeatingSeries']"));
	return element;
	}
	public static WebElement testdocumentation(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Test Documentation']"));
	return element;
	}
	public static WebElement editdocumentation(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Edit Documentation...']"));
	return element;
	}
	public static WebElement closetask(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Close Task']"));
	return element;
	}
	public static WebElement reopentask(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Reopen Task']"));
	return element;
	}
	public static WebElement closeit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Close with:']"));
	return element;
	}
	public static WebElement note1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='note']"));
	return element;
	}
	public static WebElement changedocumentation(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue  ']"));
	return element;
	}
	public static WebElement notehere(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Enter note here']"));
	return element;
	}
	public static WebElement closetaskbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton green ']"));
	return element;
	}
	public static WebElement checkmark(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='checkmark']"));
	return element;
	}
	public static WebElement sitemplate(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Test rennovation']"));
	return element;
	}
	public static WebElement projectnameph(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Project Name']"));
	return element;
	}
	public static WebElement selectplace(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h3[text()='Select Place']"));
	return element;
	}
	public static WebElement shoptobeinspected(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='4']//div[text()='Inspector:']"));
	return element;
	}
	public static WebElement inspector(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Inspector:']"));
	return element;
	}
	public static WebElement createproject1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit green  ']"));
	return element;
	}
	public static WebElement templatefilter(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container filter-mode open']//li[@data-id='projectTemplate']"));
	return element;
	}
	public static WebElement template(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro filter-mode']//div[text()='Template']"));
	return element;
	}
	public static WebElement shopinspectiontemplate(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='Test rennovation']"));
	return element;
	}
	public static WebElement addprojecttemplate(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add Project Template']"));
	return element;
	}
	public static WebElement workspace(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Workspace:']"));
	return element;
	}
	public static WebElement maintenance(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='work-order']"));
	return element;
	}
	public static WebElement text1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='You can pin the location on the map (accessed via the toggle above).']"));
	return element;
	}
	public static WebElement addprojecttasksgreen(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit v2 green  ']"));
	return element;
	}
	public static WebElement projectcomparison(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h3[text()='Project Comparison ']"));
	return element;
	}
	public static WebElement include(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Include residents in project details']"));
	return element;
	}
	public static WebElement rapidmode(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Rapid mode as default']"));
	return element;
	}
	public static WebElement blue(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton v2 mainSubmit blue in-project  ']"));
	return element;
	}
	public static WebElement testprojecttemplate(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Test Project Template']"));
	return element;
	}
	public static WebElement deletetemplate(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Delete Template...']"));
	return element;
	}
	public static WebElement deletetemplatebutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Delete Template']"));
	return element;
	}
	public static WebElement addrepeatingtask(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@title='Add a new repeating task [N]']"));
	return element;
	}
	public static WebElement tooltip(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='float-right count']"));
	return element;
	}
	public static WebElement favourites(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue  ']"));
	return element;
	}
	public static WebElement sitesfavourite(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Sites: Favorites']"));
	return element;
	}
	public static WebElement cptappliances(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container   open']//li[@data-id='worktype-appliances']"));
	return element;
	}
	public static WebElement textycplom(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='You can pin the location on the map.']"));
	return element;
	}
	public static WebElement texttps(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[text()='Test Repeating Schedule']"));
	return element;
	}
	public static WebElement deleterepeating(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Delete Repeating...']"));
	return element;
	}
	public static WebElement deleterepeatingbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Delete Repeating Task']"));
	return element;
	}
	public static WebElement deleterepeatingproject(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Delete Repeating Project']"));
	return element;
	}
	public static WebElement trigger(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Trigger']"));
	return element;
	}
	public static WebElement selectcondition(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Select condition']"));
	return element;
	}
	public static WebElement daylease(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='30-day lease expiration']"));
	return element;
	}
	public static WebElement triggerdelayvalue(WebDriver driver)
	{
	element = driver.findElement(By.id("triggerDelayValue"));
	return element;
	}
	public static WebElement triggerdelayvaluedays(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro delay-type']//div[@tabindex='2']"));
	return element;
	}
	public static WebElement triggerdelayvalueweeks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='weeks']"));
	return element;
	}
	public static WebElement texttpr(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[text()='Test Repeating Trigger']"));
	return element;
	}
	public static WebElement addrepeatingproject(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add Repeating Project']"));
	return element;
	}
	public static WebElement text4(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='You can pin the location on the map (accessed via the toggle above).']"));
	return element;
	}
	public static WebElement apt(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit v2 blue  ']"));
	return element;
	}
	public static WebElement schedule1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='6']//div[text()='Schedule:']"));
	return element;
	}
	public static WebElement appliances2(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container   open']//li[@data-id='worktype-electrical']"));
	return element;
	}
	public static WebElement GFCI(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[contains(text(),'GFCI')]"));
	return element;
	}
	public static WebElement noturgent (WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon not-urgent']"));
	return element;
	}
	public static WebElement makeurgent (WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[contains(text(),'Make Urgent')]"));
	return element;
	}
	public static WebElement converttoproject1 (WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon convert-to-project']"));
	return element;
	}
	public static WebElement closemodal(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='blank-button modal-close medium']"));
	return element;
	}
	public static WebElement editdoc(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[contains(text(),'Edit Documentation...')]"));
	return element;
	}
	public static WebElement text5(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[text()='Test the repeat project']"));
	return element;
	}
	public static WebElement printtask1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@id='task_menu_popup']//span[contains(@class,'icon print')]"));
	return element;
	}
	public static WebElement printtaskbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue ']"));
	return element;
	}
	public static WebElement descriptionedit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement editaccept(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement gfci(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h3[@title='GFCI / Electrical']"));
	return element;
	}
	public static WebElement header1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='content-icon']"));
	return element;
	}
	public static WebElement editaccept1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view task-inline-edit workType loaded visible']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement csn1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='chandra sekhar n']"));
	return element;
	}
	public static WebElement csn2(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='chandra sekhar n']"));
	return element;
	}
	public static WebElement mapview(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@title='Map View']"));
	return element;
	}
	public static WebElement mapclick(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//canvas[@class='mapboxgl-canvas']"));
	return element;
	}
	public static WebElement header3(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//section[@class='objective clearfix']"));
	return element;
	}
	public static WebElement assignedtoaccept(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view task-inline-edit assignee visible loaded suppress-menu']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement place1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Floor 101 / Building mickeymouse']"));
	return element;
	}
	public static WebElement place3(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Unit 1 / Floor 103 / Building mickeymouse']"));
	return element;
	}
	public static WebElement placeaccept(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view task-inline-edit place offset-left full-width-edit visible loaded suppress-menu']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement place12(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Floor 103 / Building mickeymouse']"));
	return element;
	}
	public static WebElement place13(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Unit 1 / Floor 101 / Building mickeymouse']"));
	return element;
	}
	public static WebElement Pte(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='PTE Test Edit']"));
	return element;
	}
	public static WebElement entrypreferenceedit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[@class='name can-edit']"));
	return element;
	}
	public static WebElement ptecontactresidentfirst(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//label[text()='Contact resident first']"));
	return element;
	}
	public static WebElement pteEnteranytime(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//label[text()='Enter any time']"));
	return element;
	}
	public static WebElement favoritepopupclose(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='blank-button modal-close medium']"));
	return element;
	}
	public static WebElement tswl(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[text()='test site with links']"));
	return element;
	}
	public static WebElement priordoc(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Display prior documentation']"));
	return element;
	}
}
