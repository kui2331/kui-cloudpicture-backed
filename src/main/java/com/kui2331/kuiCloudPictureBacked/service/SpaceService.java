package com.kui2331.kuiCloudPictureBacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kui2331.kuiCloudPictureBacked.model.dto.space.SpaceAddRequest;
import com.kui2331.kuiCloudPictureBacked.model.dto.space.SpaceQueryRequest;
import com.kui2331.kuiCloudPictureBacked.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kui2331.kuiCloudPictureBacked.model.entity.User;
import com.kui2331.kuiCloudPictureBacked.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author kui23
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-11-05 22:52:02
*/
public interface SpaceService extends IService<Space> {

    /**
     * 校验
     *
     * @param space
     * @param add
     */
    void validSpace(Space space, boolean add);

    /**
     * 添加空间
     *
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 获取空间封装类
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取查询条件
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);


    /**
     * 获取空间封装类
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);


    /**
     * 根据空间级别，自动填充限额
     *
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);
}
