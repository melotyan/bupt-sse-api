package cn.sse.bupt.service;

import cn.sse.bupt.model.MailboxModel;

import java.util.List;

/**
 * Created by melot on 2016/5/1.
 */
public interface MailboxService {
    public int sendMail(MailboxModel mailboxModel);

    public int sendDraft(int id);

    public int saveDraft(MailboxModel mailboxModel);

    public MailboxModel readMail(int id);

    public int setMailReaded(int id);

    public List<MailboxModel> viewInbox(String receiver);

    public List<MailboxModel> viewOutbox(String sender);

    public List<MailboxModel> viewDrafts(String sender);

    public int deleteSendedMail(int id);

    public int deleteReceivedMail(int id);

    public int editDraft(int id, String receiver, String title, String content);
}
