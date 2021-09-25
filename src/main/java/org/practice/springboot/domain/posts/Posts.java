package org.practice.springboot.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter //Lombok Annotation , 클래스 내 모든 필드의 Getter 메소드 자동생성
@NoArgsConstructor //Lombok " , public Posts() {}와 같은 효과
@Entity //JPA Annotation, SalesManager.java -> sales_manager table
public class Posts {

    @Id//해당 테이블의 PK필드 나타냄
    //PK 생성 규칙
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//

    //해당 클래스의 필드는 모두 칼럼이 됨.
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder//해당 클래스의 빌더 패턴 클래스 생성, 생성자 상단에 선언시 생성자에 포함된 플드만 빌더에 포함.
    //Entity 클래스에 절대 Setter 메소드 만들지 않음!
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
