package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.DictHospital;
import com.yixun.ccmz.domain.DictHospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictHospitalMapper {
    long countByExample(DictHospitalExample example);

    int deleteByExample(DictHospitalExample example);

    int deleteByPrimaryKey(String ID);

    int insert(DictHospital record);

    int insertSelective(DictHospital record);

    List<DictHospital> selectByExample(DictHospitalExample example);

    DictHospital selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") DictHospital record, @Param("example") DictHospitalExample example);

    int updateByExample(@Param("record") DictHospital record, @Param("example") DictHospitalExample example);

    int updateByPrimaryKeySelective(DictHospital record);

    int updateByPrimaryKey(DictHospital record);
}