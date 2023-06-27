# oop-aop-springboot
### 스프링 입문을 위한 자바 객체 지향의 원리와 이해 AOP 부분 Springboot로 정리
환경
 - Spring Boot : 3.1.0
 - JDK : 17
 - IDE : Intellij <hr/>
## 참고자료 
 * https://docs.spring.io/spring-framework/reference/core/aop.html

## Configuration
### AOP Gradle 설정
```
implementation 'org.springframework.boot:spring-boot-starter-aop'
```
###
| 어노테이션   |내용|
|---------|---|
 | @Aspect | AOP로 정의하는 클래스들을 지정함|
 |@Pointcut| AOP 기능 적용 시점 설정 (메소드, 어노테이션 등등의 단위) -> 설정 수식이 많음
 |@Before| 메소드 실행 이전|	