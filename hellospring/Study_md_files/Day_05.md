@GetMapping("/")을 추가하면 localhost:8080을 url에 입력했을 때 나오도록 만들 수 있음.

GET방식 : url에 직접 입력하는 방식 (조회에서 주로 사용)
POST방식 : 데이터를 전달할때 주로 사용

addAttribute("members", members) : 꺼내서 담는 메서드

---

✔ DB

- H2 : 개발이나 테스트 용도의 가볍고 편리한 DB, 웹 화면 제공
- JDBC : SQL와 애플리케이션 서버를 연결할 때 필요한 기술
- JPA : 객체를 DB에 쿼리 없이 저장이 가능한 기술
- 스프링 데이터 JPA : JPA를 편리하게 사용할 수 있도록 한번 감싼 기술

순서대로 사용할 예정.

## JDBC

build.gradle 파일에 jdbc, h2 데이터베이스 관련 라이브러리 추가

```java
implementation 'org.springframework.boot:spring-boot-starter-jdbc'
runtimeOnly 'com.h2database:h2'
```

스프링 부트 데이터베이스 연결 설정 추가

```java
spring.datasource.url=jdbc:h2:tcp://localhost/~/test
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
```

## JPA

이전까지는 쿼리를 사용자가 직접 작성해야 했으나, JPA를 사용하면 SQL보다는 객체 중심의 설계로 패러다임을 바꿀 수 있음. >> 개발 생산성 향상

JPA는 인터페이스이며 구현체가 동반되어야 사용이 가능하다. 해당 예제에서는 Hibernate를 사용한다.
