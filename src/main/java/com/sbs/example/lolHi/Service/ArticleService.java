package com.sbs.example.lolHi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.example.lolHi.Dao.ArticleDao;
import com.sbs.example.lolHi.dto.Article;

@Service
public class ArticleService {
	@Autowired
	private ArticleDao articleDao;
	
	public List<Article> getArticles() {
		return null;
	}

	
}
