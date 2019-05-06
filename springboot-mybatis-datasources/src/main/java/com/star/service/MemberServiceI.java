package com.star.service;

import com.star.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: StarC
 * @Date: 2019/5/5 10:38
 * @Description:
 */

public interface MemberServiceI {

    int insert(Member member);

    int save(Member member);

    List<Member> selectAll();

    Member selectMember(int id);

    String getToken(String appId);
}
