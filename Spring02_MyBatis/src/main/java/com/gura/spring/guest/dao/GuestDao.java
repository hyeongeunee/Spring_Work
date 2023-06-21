package com.gura.spring.guest.dao;

import com.gura.spring.guest.dto.GuestDto;

import java.util.List;

public interface GuestDao {
    public void insert(GuestDto dto);
    public void delete(GuestDto dto);
    public void update(GuestDto dto);
    public GuestDto getData(int num);
    public List<GuestDto> getList();

}
