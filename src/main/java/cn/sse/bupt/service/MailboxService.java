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

    public List<MailboxModel> viewInbox();

    public List<MailboxModel> viewOutbox();

    public int deleteSendedMail(int id);

    public int deleteReceivedMail(int id);
}
