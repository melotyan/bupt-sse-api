package cn.sse.bupt.service;

import cn.sse.bupt.model.NoticeModel;

/**
 * Created by hao.yan on 2015/12/11.
 */
public interface NoticeService {
    public int publishNotice(NoticeModel noticeModel);

    public int updateNotice(int id, int updateUid, String title, String content);

    public int deleteNotice(int id, int updateUid);

    public NoticeModel findNoticeByUid(int uid);
}
