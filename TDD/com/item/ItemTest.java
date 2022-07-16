package com.item;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	  @AfterEach
	    void tearDown() throws Exception {


	    }
	    @Test
	    void test() {
	        Item i = new Item(1,"Kurkure", 25,30,LocalDate.of(2022,06,25),LocalDate.of(2022, 10, 25));

	        assertEquals(true,i.createObject(i));
	    }

}
