package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;


import static com.codeborne.selenide.Selenide.$;

public class PopularPage {

    //Весь блок "Популярное"
    SelenideElement PopularBlock =  $(By.className("styles_popularPostsColumn___JPK_"));

    //Заголовок блока "Популярное"
    SelenideElement headerPopularBlock =  $(By.className("styles_title__LFX23"));

    //Порядковый номер у новости
    SelenideElement newsNumber =  $(By.className("styles_index__XzutB"));

    //Количество комментариев
    SelenideElement numberOfComments =  $(By.className("styles_root__Ra5rg"));

    //Название класса у всех новостей
    SelenideElement classNameNews =  $(By.className("styles_root__UqPmO"));

    //Картинка первой новости
    SelenideElement pictureNews =  $(By.className("styles_image__iaFZw"));

    //Текст первой новости
    SelenideElement firstNewsText =  $(By.className("styles_titleWrapper__pjDVp"));

    //Блок с новостью
    SelenideElement NewsBlock =  $(By.className("styles_listItem__dWdTN"));

    @Step ("Отображается блок – «Билеты в кино»")
    public PopularPage visiblePopularBlock() {
        PopularBlock.shouldBe(Condition.visible);
        return this;
    }

    @Step ("Текст блока – «Билеты в кино»")
    public PopularPage HeaderTextPopularBlock() {
        String textHeaderPopularBlock = "Популярное";
        headerPopularBlock.shouldBe(Condition.text(textHeaderPopularBlock));
        return this;
    }

    @Step ("Текст блока – «Билеты в кино»")
    public PopularPage colourNewsNumber() {
        String colourExpected = newsNumber.getCssValue("color");
        String colourActual = "rgba(255, 102, 0, 1)";
        System.out.println(colourExpected);
        Assert.assertEquals(colourExpected, colourActual);
        return this;
    }


}
