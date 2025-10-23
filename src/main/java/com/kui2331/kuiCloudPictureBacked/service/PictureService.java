package com.kui2331.kuiCloudPictureBacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kui2331.kuiCloudPictureBacked.model.dto.picture.PictureQueryRequest;
import com.kui2331.kuiCloudPictureBacked.model.dto.picture.PictureUploadRequest;
import com.kui2331.kuiCloudPictureBacked.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kui2331.kuiCloudPictureBacked.model.entity.User;
import com.kui2331.kuiCloudPictureBacked.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kui23
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-10-23 19:36:13
 */
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile, PictureUploadRequest pictureUploadRequest, User loginUser);

    /**
     * 获取图片包装类（单条）
     *
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 获取查询对象
     *
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 校验图片
     *
     * @param picture
     */
    void validPicture(Picture picture);
}
