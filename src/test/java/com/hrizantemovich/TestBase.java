package com.hrizantemovich;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void Beforeall(){
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
}
