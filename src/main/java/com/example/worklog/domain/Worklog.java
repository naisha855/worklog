package com.example.worklog.domain; // 본인의 패키지 경로로 수정하세요

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter @Setter
@NoArgsConstructor
public class Worklog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;    // 제목
    private String content;  // 내용
    private String author;   // 작성자
    private LocalDateTime createdAt = LocalDateTime.now(); // 생성시간
}