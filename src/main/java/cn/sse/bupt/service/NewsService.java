package cn.sse.bupt.service;

import cn.sse.bupt.model.NewsModel;

import java.util.List;

/**
 * Created by melot on 2016/4/14.
 */
public interface NewsService {
    public int publishNews(NewsModel newsModel);

    public int deleteNews(int id);

    public int editNews(NewsModel newsModel);

    public List<NewsModel> listNews(int page, int pageSize);

    public NewsModel viewNewsDetail(int id);

}
