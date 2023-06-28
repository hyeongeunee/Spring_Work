package com.gura.spring.file.service;

import com.gura.spring.file.dto.FileDto;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public interface FileService {
    // 파일 목록 얻어오기
    public void getList(HttpServletRequest request);

    // 업로드된 파일 저장하기
    public void saveFile(FileDto dto, ModelAndView mView, HttpServletRequest request);

    // 파일 하나의 정보 얻어오기
    public void getFileData(int num, ModelAndView mView);

    // 파일 삭제하기
    public void deleteFile(int num, HttpServletRequest request);
}
