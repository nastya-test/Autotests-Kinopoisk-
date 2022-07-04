package org.example;
import PageObject.MovieTicketsPage;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.open;

    public class TodayInCinema {
    @BeforeMethod
    public void openPage() {
        String url = ConfProperties.getProperty("loginPageUrl");
        open(url);
    }

    @Test
    @Description("Переход по «Билеты в кино« из меню»")
    public void testClickMenuTicketsBtn() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.clickMenuTicketsBtn();
    }

    @Test
    @Description("Отображается блок – «Билеты в кино»")
    public void testVisibleBlockTickets() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.visibleBlockTickets();
    }

    @Test
    @Description("Текст блока – «Билеты в кино»")
    public void testHeaderTextTicketsBlock() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.HeaderTextTicketsBlock();
    }

    @Test
    @Description("Соответствие ссылки регулярному выражению")
    public void test() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.HeaderLinkTicketsBlock();
    }

    @Test
    @Description("Отображается карусель фильмов в блоке «Билеты в кино»")
    public void testVisibleCarousel() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.visibleCarousel();
    }

    @Test
    @Description("Отображается сниппет в карусели")
    public void testVisibleSnippetCarousel() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.visibleSnippetCarousel();
    }

    @Test
    @Description("Ссылка из заголовка блока /afisha/new/city")
    public void testLinkTicketsBlock() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.linkTicketsBlock();
    }

    @Test
    @Description("У сниппета в карусели отображается картинка")
    public void testVisiblePictureSnippetCarousel() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.visiblePictureSnippetCarousel();
    }

    @Test
    @Description("Отображается название у фильма")
    public void testNameFilm() {
        MovieTicketsPage movieTicketsPage = new MovieTicketsPage();
        movieTicketsPage.nameFilm();
    }

}
