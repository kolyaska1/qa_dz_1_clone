package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BoxTestsDz1 {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        //Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        //Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form/");
        //name
        $("#firstName").setValue("KOLYA");
        //lastName
        $("#lastName").setValue("YARUSOV");
        //email
        $("#userEmail").setValue("kolya123pvp@gmail.com");
        //gender
        $("label[for='gender-radio-2']").click();
        //number
        $("#userNumber").setValue("9605348241");
        //date
       // dateOfBirthInput 07 Aug 2025
        $("#dateOfBirthInput").clear();
        //$("#dateOfBirthInput").setValue("07 Aug 2005").pressEnter();
        $("#dateOfBirthInput").sendKeys(Keys.chord(Keys.CONTROL, "a"), "07 Aug 2005");
        $("#dateOfBirthInput").pressEnter();

        //предмет
        $("#subjectsInput").setValue("english").pressEnter();
        //хобби
        $("label[for='hobbies-checkbox-1']").click();
        //фото
        $("#uploadPicture").uploadFile(new File("C:\\Users\\Glaas\\Pictures\\Screenshots\\Снимок экрана 2025-05-24 212550.png"));

        $("#currentAddress").setValue("М Горького 20");

        //         $("#state").setValue("Uttar Pradesh");
        $("#react-select-3-input").setValue("NCR").pressEnter();
//        $("#city").click();         $("#city").setValue("Agra");
        $("#react-select-4-input").setValue("Noida").pressEnter();


        $("#submit").click();

//далее идет проверка




 //       $("").$("").shouldHave(text(""));
   //     $("").shouldHave(text(""));
     //   $("").shouldHave(text(""));
       // $("").shouldHave(text(""));

        $(".modal-content table tr").find(String.valueOf(text("Student Email"))).$("td:nth-child(2)").shouldHave(text("kolya12pvp@gmail.com"));
//        $(".modal-content table tr").find(text("Gender")).$("td:nth-child(2)").shouldHave(text("Female"));
    //    $(".modal-content table tr").find(text("Mobile")).$("td:nth-child(2)").shouldHave(text("9605348241"));
      //  $(".modal-content table tr").find(text("Date of Birth")).$("td:nth-child(2)").shouldHave(text("07 August 2005"));
        //$(".modal-content table tr").find(text("Subjects")).$("td:nth-child(2)").shouldHave(text("English"));
        //$(".modal-content table tr").find(text("Hobbies")).$("td:nth-child(2)").shouldHave(text("Sports"));
        //$(".modal-content table tr").find(text("Picture")).$("td:nth-child(2)").shouldHave(text("чмок экрана 2025-05-24 212550.png"));
        //$(".modal-content table tr").find(text("Address")).$("td:nth-child(2)").shouldHave(text("М Горького 20"));
        //$(".modal-content table tr").find(text("State and City")).$("td:nth-child(2)").shouldHave(text("NCR Noida"));
    }

}