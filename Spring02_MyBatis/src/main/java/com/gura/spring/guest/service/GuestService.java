package com.gura.spring.guest.service;

import com.gura.spring.guest.dto.GuestDto;
import org.springframework.web.servlet.ModelAndView;

public interface GuestService {
    public void addGuest(GuestDto dto);
    public void updateGuest(GuestDto dto);
    public void deleteGuest(GuestDto dto);
    public void getGuestInfo(ModelAndView mView, int num);
    public void getGuestList(ModelAndView mView);
}
