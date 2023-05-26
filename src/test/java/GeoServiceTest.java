package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import ru.netology.entity.Country;


public class GeoServiceTest {
    GeoServiceImpl geoService;

    @BeforeEach
    public void beforeEach(){
        geoService = new GeoServiceImpl();
    }

    @Test
    void testByIp(){
        Country exp = Country.USA;
        String ip = "96.233.125.6";

        Country actual = geoService.byIp(ip).getCountry();
        Assertions.assertEquals(exp, actual);
    }

    @Test
    void testByCoordinates(){
        final double latitude = 1.2;
        final double longitude = 5.3;

        Executable executable = () -> geoService.byCoordinates(latitude,longitude);
        Assertions.assertThrows(RuntimeException.class, executable);
    }
}
