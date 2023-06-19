package com.gura.spring.member.dao;

import com.gura.spring.member.dto.MemberDto;

import java.util.List;

public interface MemberDao {
    public void insert(MemberDto dto);
    public void update(MemberDto dto);
    public void delete(int num);
    public MemberDto getData(int num);
    public List<MemberDto> getList();
}
