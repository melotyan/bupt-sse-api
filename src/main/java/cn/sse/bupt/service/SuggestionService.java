package cn.sse.bupt.service;

import cn.sse.bupt.model.SuggestionModel;

import java.util.List;

/**
 * Created by hao.yan on 2016/1/12.
 */
public interface SuggestionService {
    public int makeSuggestion(SuggestionModel suggestionModel);

    public int editSuggestion(int id, String title, String content);

    public int deleteSuggestion(int id);

    public SuggestionModel viewSuggestion(int id);

    public List<SuggestionModel> listSuggestions(int offset, int pageSize);
}
