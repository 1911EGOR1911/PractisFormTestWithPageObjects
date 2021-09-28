package com.hrizantemovich;

import com.hrizantemovich.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.hrizantemovich.TestData.*;


public class PractiseFormTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    void fillFormTest(){
        registrationPage.openPage();
        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeEmail(emailAdres);
        registrationPage.choseGender();
        registrationPage.typePhone(phoneNumber);
        registrationPage.calendar.setDate("29","December","1989");
        registrationPage.choseHobbies();
        registrationPage.uploadPicture();
        registrationPage.typeAddress(addressStreet);
        registrationPage.typeSubject(studiedSubject);
        registrationPage.stateCityChose();
        registrationPage.submitClick();
        registrationPage.examinationOfFeelForm();

    }


}

