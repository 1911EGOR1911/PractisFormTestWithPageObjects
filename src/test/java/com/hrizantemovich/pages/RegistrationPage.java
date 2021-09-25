package com.hrizantemovich.pages;
import com.codeborne.selenide.SelenideElement;
import com.hrizantemovich.pages.components.CalenfdarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPage {
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            phoneInput =   $("#userNumber"),
            pressUploadButton = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            subjectInput = $("#subjectsInput");

    public CalenfdarComponent calendar = new CalenfdarComponent();

    private final String FORM_TITLE = "Student Registration Form";
    public void openPage(){
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }
    public void typeFirstName(String value){

        firstNameInput.setValue(value);
    }
    public void typeLastName(String value){

        lastNameInput.setValue(value);
    }
    public void typeEmail(String value){
        emailInput.setValue(value);
    }
    public void choseGender(){
        $("#genterWrapper");
        $(byText("Male")).click();
    }
    public void typePhone (String value){
        phoneInput.setValue(value);
    }
    public void choseHobbies(){
        $("#hobbiesWrapper");
        $(byText("Music")).click();
        $(byText("Reading")).click();
    }
    public void uploadPicture (){
        pressUploadButton.uploadFromClasspath("img/12.png");

    }
    public void typeAddress (String value){
        addressInput.setValue(value);

    }
    public void typeSubject (String value ){
        subjectInput.setValue(value).pressEnter();
    }
    public void stateCityChose (){
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
    }
    public void submitClick (){
        $("#submit").click();
    }
    public void examinationOfFeelForm() {
        $(".modal-header").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Zhenia" +" " + "Zhenia"), text("Zhenia@gmail.com"), text("Male"),
                text("1212121212"), text("29 December,1989"), text("Math"), text("Music, Reading"), text("12.png"),
                text("Lenina 1"), text("NCR Noida"));

    }
}


