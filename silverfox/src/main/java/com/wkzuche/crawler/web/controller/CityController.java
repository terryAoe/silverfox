package com.wkzuche.crawler.web.controller;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wkzuche.crawler.dao.CityDao;
import com.wkzuche.crawler.pojo.City;

@Controller
@RequestMapping(path = {"/"})
public class CityController {
	
	@Autowired
	private CityDao cityDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String defaultHandler(){
		return "home";
	}
	
	@RequestMapping(path= {"qcitybyname/{name}"} , method=RequestMethod.GET)
	public void queryCityByName(ModelAndView modelAndView , @PathVariable String name){
		modelAndView.setViewName("home");
		
		if(StringUtils.isEmpty(name)){
			modelAndView.addObject("city", "");
			return ;
		}
		City city = null;
		try {
			city = cityDao.queryOneCityByName(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(city == null){
			modelAndView.addObject("city", null);
		}else {
			modelAndView.addObject("city", city);
		}
	}
	@RequestMapping(value ={"/qcitybyid/{id}"} , method=RequestMethod.GET)
	public void queryCityById(ModelAndView modelAndView , @PathVariable int id){
		modelAndView.setViewName("home");
		City city = null;
		try {
			city = this.cityDao.queryOneCityById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		modelAndView.addObject("city" , city);
	}
	/*int cityId;
	String cityName ;
	String chineseName;
	String englishName;
	boolean topCity;
	int numberOfShops;*/
	@RequestMapping(value ={"/insertCity"} , method =RequestMethod.POST)
	public void insertCity(ModelAndView modelAndView ,
			@RequestParam(value="cityName" ,required=true) String cityName,
			@RequestParam(value ="cityId" , defaultValue = "0" , required=true) int cityId,
			@RequestParam("chineseName")String chineseName,
			@RequestParam("englishName") String englishName,
			@RequestParam("topCity") boolean topCity ,
			@RequestParam(value = "numberOfShops",defaultValue = "0", required=true) int numberOfShops){
		
	}
	
	@RequestMapping(value = {"/increaseCity"} , method= RequestMethod.POST)
	public String increaseCity(ModelAndView modelAndView , @Valid City city ,Errors error){
		if(error.hasErrors()){//如果检测出来错误,转到注册页面
			return "regisit";
		}
		try {
			this.cityDao.insertCity(city);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:/" + city.getCityId();
	}
	
	@RequestMapping(value = {"/{cityId}"} , method = RequestMethod.GET)
	public void regisitSuccess(Model model , @PathVariable int cityId){
		City city =null;
		try {
			city = this.cityDao.queryOneCityById(cityId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("city", city);
		
	}
	
	@RequestMapping(value ={"/update"} , method =RequestMethod.POST)
	public void updateCity( ModelAndView modelAndView, @Valid City city , Errors error){
		int result =0;
		if(error.hasErrors()){
			//返回失败
			return ;
		}
		try {
			result = this.cityDao.updateCity(city);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(result == 0){
			return ;
		}
		return ;

	}
	
	
	public CityDao getCityDao() {
		return cityDao;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}
	
	
}
