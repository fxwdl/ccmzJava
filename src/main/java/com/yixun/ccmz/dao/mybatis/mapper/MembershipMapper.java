package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.Membership;
import com.yixun.ccmz.domain.MembershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MembershipMapper {
    int countByExample(MembershipExample example);

    int deleteByExample(MembershipExample example);

    int deleteByPrimaryKey(String userId);

    int insert(Membership record);

    int insertSelective(Membership record);

    List<Membership> selectByExampleWithBLOBs(MembershipExample example);

    List<Membership> selectByExample(MembershipExample example);

    Membership selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") Membership record, @Param("example") MembershipExample example);

    int updateByExampleWithBLOBs(@Param("record") Membership record, @Param("example") MembershipExample example);

    int updateByExample(@Param("record") Membership record, @Param("example") MembershipExample example);

    int updateByPrimaryKeySelective(Membership record);

    int updateByPrimaryKeyWithBLOBs(Membership record);

    int updateByPrimaryKey(Membership record);
}