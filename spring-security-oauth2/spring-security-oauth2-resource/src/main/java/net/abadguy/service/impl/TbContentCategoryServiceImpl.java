package net.abadguy.service.impl;

import net.abadguy.mapper.TbContentCategoryMapper;
import net.abadguy.service.TbContentCategoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
