package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$;

public class MovieTicketsPage {

    //Кнопка "Билеты в кино" в меню
    SelenideElement menuTicketsBtn =  $(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div/a[5]"));

    //Весь блок "Билеты в кино"
    SelenideElement TicketsBlock =  $(By.className("styles_blockClassName__2GDW6"));

    //Заголовок блока "Билеты в кино"
    SelenideElement headerTicketsBlock =  $(By.className("styles_link__KtvyW"));

    //Карусель фильмов
    SelenideElement carousel =  $(By.className("styles_scrollBar__NTulg"));

    //Сниппет в карусели
    SelenideElement snippetCarousel =  $(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/section/div/div/div/div[5]"));

    //Картинка в карусели фильмов
    SelenideElement pictureSnippetCarousel =  $(By.className("styles_posterLink__Xjqyr"));

    //Название фильма в карусели
    SelenideElement nameFilm =  $(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/section/div/div/div/div[1]/a/span[1]"));

    @Step ("Переход по «Билеты в кино» из меню»")
    public MovieTicketsPage clickMenuTicketsBtn() {
        menuTicketsBtn.click();
        return this;
    }

    @Step ("Отображается блок – «Билеты в кино»")
    public MovieTicketsPage visibleBlockTickets() {
        TicketsBlock.shouldBe(Condition.visible);
        return this;
    }

    @Step ("Текст блока – «Билеты в кино»")
    public MovieTicketsPage HeaderTextTicketsBlock() {
        String textHeaderTicketsPage = "Билеты в кино";
        headerTicketsBlock.shouldBe(Condition.text(textHeaderTicketsPage));
        return this;
    }

    @Step ("Получение ссылки «Билеты в кино»")
    public MovieTicketsPage HeaderLinkTicketsBlock() {
        String textHeaderTicketsPage = headerTicketsBlock.getAttribute("href");
        Boolean regLink = Pattern.matches("^(https?:\\/\\/)?([\\w-]{1,32}\\.[\\w-]{1,32})[^\\s@]*",textHeaderTicketsPage);
        Boolean regTrue = true;
        return this;
    }

    @Step ("Отображается карусель с фильмами")
    public MovieTicketsPage visibleCarousel() {
        carousel.shouldBe(Condition.visible);
        return this;
    }

    @Step ("Ссылка из заголовка блока /afisha/new/city")
    public MovieTicketsPage linkTicketsBlock() {
        String linkTicketsBlock = "https://www.kinopoisk.ru/afisha/new/city";
        headerTicketsBlock.shouldBe(Condition.attribute("href", linkTicketsBlock));
        return this;
    }

    @Step ("В карусели есть сниппеты")
    public MovieTicketsPage visibleSnippetCarousel() {
        snippetCarousel.shouldBe(Condition.visible);
        return this;
    }

    @Step ("У сниппета есть постер")
    public MovieTicketsPage visiblePictureSnippetCarousel() {
        pictureSnippetCarousel.shouldBe(Condition.visible);
        return this;
    }

    @Step ("У сниппета есть название")
    public MovieTicketsPage nameFilm() {
        nameFilm.shouldBe(Condition.visible);
        return this;
    }

}
