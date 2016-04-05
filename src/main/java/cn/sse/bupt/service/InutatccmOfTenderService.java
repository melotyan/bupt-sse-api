package cn.sse.bupt.service;

import cn.sse.bupt.model.InutatccmOfTenderModel;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
public interface InutatccmOfTenderService {
    public int createTenderInfo(InutatccmOfTenderModel inutatccmOfTenderModel);

    public int editTenderInfo(int id, String title, String content, String fileUrl);

    public int deleteTenderInfo(int id);

    public InutatccmOfTenderModel viewTenderDetail(int id);

    public List<InutatccmOfTenderModel> listTenderInfos(int page, int pageSize);
}
