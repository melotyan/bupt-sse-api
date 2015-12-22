package cn.sse.bupt.service;

import cn.sse.bupt.model.FileModel;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/22.
 */
public interface FileService {
    public int saveFile(FileModel fileModel);

    public List<FileModel> getFileByNid(int nid);

    public int deleteFileById(int id);
}
