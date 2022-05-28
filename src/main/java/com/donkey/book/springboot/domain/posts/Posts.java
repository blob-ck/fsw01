package com.donkey.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
//테이블과 링크될 클래스 명시
//기본값으로 클래스(카멜케이스:SalesManager) ==> 테이블(언더스코어:sales_manager) 로 매칭
public class Posts {

    @Id //해당테이블의 PK필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //PK생성규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
