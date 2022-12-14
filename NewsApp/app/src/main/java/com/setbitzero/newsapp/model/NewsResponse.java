package com.setbitzero.newsapp.model;

import java.util.List;

public class NewsResponse {
    private String status;
    private int totalResults;
    private List<NewsArticles> articles;

    public NewsResponse(){}

    public NewsResponse(String status, int totalResults, List<NewsArticles> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsArticles> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsArticles> articles) {
        this.articles = articles;
    }
}
