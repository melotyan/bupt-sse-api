package cn.sse.bupt.service;

import cn.sse.bupt.model.NoticeModel;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/11.
 */
public interface NoticeService {
    public int publishNotice(NoticeModel noticeModel);

    public int updateNotice(int id, int updateUid, String title, String content);

    public int deleteNotice(int id);

    public List<NoticeModel> findNoticeByUid(int uid, int startId, int pageSize);

    public NoticeModel findNoticeById(int id);

    public List<NoticeModel> listNotice(int offset, int pageSize);
}
