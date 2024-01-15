package com.example.first_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // DB가 해당 객체를 인식 가능
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Article {
    @Id // 대표값을 지정. like 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, .... 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }

/*
    public Article(Long id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }       @AllArgsConstructor로 대체

    @Override
    public String toString(){
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }       @ToString으로 대체
 */
}
