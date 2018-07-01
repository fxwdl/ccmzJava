package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.DictStdDisease;
import com.yixun.ccmz.domain.DictStdDiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictStdDiseaseMapper {
    long countByExample(DictStdDiseaseExample example);

    int deleteByExample(DictStdDiseaseExample example);

    int deleteByPrimaryKey(String code);

    int insert(DictStdDisease record);

    int insertSelective(DictStdDisease record);

    List<DictStdDisease> selectByExample(DictStdDiseaseExample example);

    DictStdDisease selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") DictStdDisease record, @Param("example") DictStdDiseaseExample example);

    int updateByExample(@Param("record") DictStdDisease record, @Param("example") DictStdDiseaseExample example);

    int updateByPrimaryKeySelective(DictStdDisease record);

    int updateByPrimaryKey(DictStdDisease record);
}