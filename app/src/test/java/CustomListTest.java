import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }


    @Test
    public void hasCityTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){

        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCityTest(){

        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(list.countCities(), list.getCount());

    }

}
