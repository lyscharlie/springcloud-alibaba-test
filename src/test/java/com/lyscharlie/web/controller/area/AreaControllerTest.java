package com.lyscharlie.web.controller.area;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.lyscharlie.web.controller.BaseControllerTest;

public class AreaControllerTest extends BaseControllerTest {

	@Test
	public void queryListForChina() {

		try {
			MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/area/chinaList.php"))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andDo(MockMvcResultHandlers.print())
					.andReturn();

			System.out.println(mvcResult.getResponse().getContentAsString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void queryCityListByProvinceId() {
		try {
			MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.post("/area/queryCityListByProvinceId.php")
					.accept(MediaType.APPLICATION_JSON)
					.param("provinceId", "330000"))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andDo(MockMvcResultHandlers.print())
					.andReturn();

			System.out.println(mvcResult.getResponse().getContentAsString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}