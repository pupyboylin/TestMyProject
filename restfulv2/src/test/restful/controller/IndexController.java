package test.restful.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import test.restful.dao.infoDAO;
import test.restful.model.SearchParam;

@RestController
public class IndexController {

	@Autowired
	private infoDAO infoDAO;
	
	@RequestMapping("/")
	 public ModelAndView message() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@GetMapping("/searchResult")
	public Map getSearchResult() {
		return infoDAO.mapResult();
	}
	
	@PostMapping(value = "/infoCreate")
	public Map infoCreate(@RequestParam("insertString") String insertString) {
		return infoDAO.create(insertString);
	}
	
	@PostMapping(value = "/infoQuery" ,produces="text/plain;charset=UTF-8")
	public Map infoQuery(@RequestParam("userName") String userName
			,@RequestParam("include") List include
			,@RequestParam("exclude") List exclude
			,@RequestParam("start") String start
			,@RequestParam("rows") String rows
			,@RequestParam("timeStart") String timeStart
			,@RequestParam("timeEnd") String timeEnd
			,@RequestParam("orderBy") String orderBy
			) {
		System.out.println("userName="+userName);
		System.out.println("include="+include);
		System.out.println("exclude="+exclude);
		System.out.println("start="+start);
		System.out.println("rows="+rows);
		System.out.println("timeStart="+timeStart);
		System.out.println("timeEnd="+timeEnd);
		System.out.println("orderBy="+orderBy);
		
		SearchParam sp = new SearchParam();
		
		return infoDAO.infoQuery(sp);
		//return new HashMap();
	}
	
	
}
