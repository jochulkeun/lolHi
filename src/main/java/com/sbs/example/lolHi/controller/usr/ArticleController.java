package com.sbs.example.lolHi.controller.usr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.example.lolHi.Service.ArticleService;
import com.sbs.example.lolHi.dto.Article;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/usr/article/list")
	public String showList() {
		
		List<Article> articles =  articleService.getArticles();
		
		return "/usr/article/list";
	}
}
