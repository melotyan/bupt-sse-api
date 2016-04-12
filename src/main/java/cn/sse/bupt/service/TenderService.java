package cn.sse.bupt.service;

import cn.sse.bupt.model.TenderModel;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
public interface TenderService {
    public int competitiveTender(int uid, int tid, String title, String fileUrl);

    public List<TenderModel> listTenderByTid(int tid);

    public List<TenderModel> listTenderByUid(int uid);
}
