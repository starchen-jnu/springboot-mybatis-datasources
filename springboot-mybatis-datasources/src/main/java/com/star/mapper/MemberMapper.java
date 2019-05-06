package com.star.mapper;

import com.star.entity.Member;
import com.star.entity.MemberExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: StarC
 * @Date: 2019/5/5 10:36
 * @Description:
 */
@Mapper
public interface MemberMapper {

    int insert(Member member);

    int save(Member member);

    List<Member> selectAll();

    String getToken(String appId);

    Member selectMember(int id);

    List<Member> selectByExample(MemberExample memberExample);
}
