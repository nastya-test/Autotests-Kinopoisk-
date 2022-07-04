package org.example;

import PageObject.MovieTicketsPage;
import PageObject.PopularPage;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Popular {
    @BeforeMethod
    public void openPage() {
        String url = ConfProperties.getProperty("loginPageUrl");
        open(url);
    }

    @Test
    @Description("Отображается название у фильма")
    public void test1 () {
        PopularPage popularPage = new PopularPage();
        popularPage.visiblePopularBlock();
    }

    @Test
    @Description("Заголовок блока популярное")
    public void test2() {
        PopularPage popularPage = new PopularPage();
        popularPage.HeaderTextPopularBlock();
    }

    @Test
    @Description("Цвет номера новости")
    public void test3() {
        PopularPage popularPage = new PopularPage();
        popularPage.colourNewsNumber();
    }


}
