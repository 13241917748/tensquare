package com.tensquare.base.service;

import com.tensquare.base.pojo.Label;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface LabelService {

    /**
     * 查询全部标签
     *
     * @return
     */
    public List<Label> findAll();

    /**
     * 根据ID查询标签
     *
     * @param id
     * @return
     */
    public Label findById(String id);

    /**
     * 增加标签
     *
     * @param label
     */
    public void add(Label label);

    /**
     * 修改标签
     *
     * @param label
     */
    public void update(Label label);

    /**
     * 删除标签
     *
     * @param id
     */
    public void deleteById(String id);

    /**
     * 条件查询
     *
     * @param searchMap
     * @return
     */
    public List<Label> findSearch(Map searchMap);

    /**
     * 分页条件查询
     *
     * @param searchMap
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Label> findSearch(Map searchMap, int page, int pageSize);

}
