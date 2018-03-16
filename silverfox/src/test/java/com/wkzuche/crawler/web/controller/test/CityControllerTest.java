package com.wkzuche.crawler.web.controller.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.wkzuche.crawler.web.controller.CityController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
public class CityControllerTest {
	@Test
	public void testCityController() throws Exception{
		CityController cityController = new CityController();
		MockMvc mockMvc = standaloneSetup(cityController).build();
		
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}

}
