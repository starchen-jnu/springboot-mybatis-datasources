package com.star.service.serviceImpl;


import com.star.annotation.Master;
import com.star.entity.Member;
import com.star.entity.MemberExample;
import com.star.mapper.MemberMapper;
import com.star.service.MemberServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: StarC
 * @Date: 2019/5/5 10:39
 * @Description:
 */
@Service
public class MemberServiceImpl implements MemberServiceI {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public int insert(Member member) {
        return memberMapper.insert(member);
    }

    @Master
    @Override
    public int save(Member member) {
        return memberMapper.insert(member);
    }

    @Override
    public List<Member> selectAll() {
        return memberMapper.selectByExample(new MemberExample());
    }

    @Override
    public Member selectMember(int id) {
        return memberMapper.selectMember(id);
    }

    @Override
    public String getToken(String appId) {
        return null;
    }
}
