package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.DictGovermentDept;
import com.yixun.ccmz.domain.DictGovermentDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictGovermentDeptMapper {
    long countByExample(DictGovermentDeptExample example);

    int deleteByExample(DictGovermentDeptExample example);

    int deleteByPrimaryKey(String fullCode);

    int insert(DictGovermentDept record);

    int insertSelective(DictGovermentDept record);

    List<DictGovermentDept> selectByExample(DictGovermentDeptExample example);

    DictGovermentDept selectByPrimaryKey(String fullCode);

    int updateByExampleSelective(@Param("record") DictGovermentDept record, @Param("example") DictGovermentDeptExample example);

    int updateByExample(@Param("record") DictGovermentDept record, @Param("example") DictGovermentDeptExample example);

    int updateByPrimaryKeySelective(DictGovermentDept record);

    int updateByPrimaryKey(DictGovermentDept record);
}