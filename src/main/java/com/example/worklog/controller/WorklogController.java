package com.example.worklog.controller;

import com.example.worklog.domain.Worklog;
import com.example.worklog.repository.WorklogRepository; // 레포지토리 이름 확인
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worklog")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class WorklogController {

    // 변수명도 클래스명에 맞춰 변경하는 것이 관례입니다.
    private final WorklogRepository worklogRepository;

    // 모든 일지 목록 가져오기 (GET)
    @GetMapping
    public List<Worklog> getAll() {
        return worklogRepository.findAll();
    }

    // 새 일지 저장하기 (POST)
    @PostMapping
    public Worklog create(@RequestBody Worklog worklog) {
        return worklogRepository.save(worklog);
    }
}