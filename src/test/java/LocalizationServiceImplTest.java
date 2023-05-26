package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    public void testsCheckReturnedText(){

        String expected = "Добро пожаловать";
        Country country = Country.RUSSIA;
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(country);

        Assertions.assertEquals(expected,actual);
    }
}
