package com.wonder4work.active.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wonder4work.active.domain.Activity;
import com.wonder4work.active.utils.PagedGridResult;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wonder4work
 * @since 2020-09-07
 */
public interface ActivityService extends IService<Activity> {

    /**
     * 条件分页查询活动信息
     * @param queryMap 查询参数 queryMap:{partyBranch:所属党支部,activityTheme:活动主题,activityStatus:活动状态}
     * @param page 页码
     * @param pageSize 每页显示多少条
     * @return PagedGridResult
     */
    PagedGridResult query(Map<String, Object> queryMap, Integer page, Integer pageSize);


    /**
     * 条件分页查询活动报名人员信息
     * @param queryMap 查询参数 queryMap:{partyBranch:所属党支部,name:姓名}
     * @param page 页码
     * @param pageSize 每页显示多少条
     * @return PagedGridResult
     */
    PagedGridResult signUpDetail(Map<String, Object> queryMap, Integer page, Integer pageSize);

    /**
     * 添加新活动
     * @param activity
     */
    void create(Activity activity);

    /**
     * 将活动状态别为取消
     * @param activityId 活动ID
     */
    void cancel(Integer activityId);

}
