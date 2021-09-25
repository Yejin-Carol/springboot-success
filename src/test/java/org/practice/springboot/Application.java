package org.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//스프링부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동으로 설정됨. 여기서부터 읽으므로 항상 프로젝트 상단위치!
public class Application {//앞으로 만들 프로젝트의 메인클래스
    public static void main(String[] args) {
        //SpringApplication.run으로 인한 내장 WAS(Web Application Server) 실행.
        //내장 WAS로 Tomcat 설치 필요가 없게 되고, 스프링 부트로 만들어진 Jar 파일(실행 가능한 Java 패키징 파일)로 실행하면됨.
        SpringApplication.run(Application.class, args);
    }
}
