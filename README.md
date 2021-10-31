# 첫 번째 목표

@ComponentScan 어노테이션 만들기

기본 생김새

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ComponentScan {
    String basePackage() default "";
}
```

```java
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
```

요구사항

- ComponentScan 어노테이션에서 basePackage
  - 지정된 경우, 지정된 패키지를 스캔
  - 지정되지 않은 경우, 컴포넌트 스캔이 속한 패키지부터 스캔
- 패키지를 탐색해서 다음 어노테이션을 찾는다.
  - @Controller
  - @Service
  - @Component
  - @Repository
  - @RestController
  
# 두 번째 목표

DispatcherServlet 만들기

기본 생김새

```java
public class DispatcherServlet {

  public void doDispatch(HttpServletRequest request, HttpServletResponse response) {
    // 구현 할 부분
  }
}
```

요구사항

1. 앞서 만든 스캐너로 핸들러(@Controller, @RestController) 찾아서 등록
2. doDispatch 구현
3. WAS에 등록
4. 실행

특이사항

컨트롤러 기본 생김새

```java
@Controller
public class TestController {

  @RequestMapping("/hello")
  public void sayHello(HttpServletRequest request, HttpServletResponse response) {

  }
}
```

# 세 번째 목표

간단한 서비스 만들기 (DB 사용 X)

요구사항

1. 회원가입 페이지
2. 로그인 페이지
3. 로그인 확인