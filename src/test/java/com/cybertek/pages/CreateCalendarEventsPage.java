package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCalendarEventsPage extends BasePage {

    public CreateCalendarEventsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[id^='recurrence-repeat-view']")
    public WebElement repeat;

    @FindBy(css = "[id^='recurrence-repeats-view']")
    public WebElement repeatOptions;

    @FindBy(className = "select2-chosen")
    public WebElement selectedOwner;

    @FindBy(css = "input[id^='oro_calendar_event_form_title-']")
    public WebElement title;

    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_start']")
    public WebElement startDate;
    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_end']")
    public WebElement endDate;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_start']")
    public WebElement startTime;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_end']")
    public WebElement endTime;

    @FindBy(xpath = "//li[@class='ui-timepicker-pm'][19]")
    public WebElement NinePM;

    @FindBy(xpath = "//li[@class='ui-timepicker-pm'][20]")
    public WebElement TenPM;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement days;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement weekday;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    public WebElement never;

    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement after;

    @FindBy(xpath = "(//input[@type='radio'])[5]")
    public WebElement by;

    @FindBy(xpath = "//a[@title='Cancel']")
    public WebElement cancel;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement AllCalendarEventSubtitle;

    @FindBy(xpath = "//label[contains(text(),'All-day event')]")
    public WebElement AllDayEvent;

    @FindBy(xpath = "//div//label[@for='recurrence-repeat-view1196'")
    public WebElement repeat2;

    @FindBy(id = "recurrence-repeats-view1196")
    public WebElement daily;


    public Select repeatOptionsList(){
        return new Select(repeatOptions);
    }

}
