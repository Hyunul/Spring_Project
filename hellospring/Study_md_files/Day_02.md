✔ 유닛 테스트

- 모든 함수와 메서드에 대한 테스트 케이스를 작성하여 의도된대로 잘 동작하는지 **검증**하는 절차
- 프로그램을 작은 **단위**로 쪼개어 각 단위가 정확하게 동작하는지 검사함으로써 **프로그램의 안정성을 높임**
- System.out.println()으로 하는 번거로운 디버깅이 필요없으며, 개발기간 중 대부분을 차지하는 **디버깅 시간을 단축**

✔ JUnit

- 자바용 유닛 테스트 프레임워크
- 테스트 결과는 Test클래스로 개발자에게 테스트 방법 및 클래스의 History를 공유 가능
- assert 메서드로 테스트 케이스의 수행 결과를 판별
- 어노테이션으로 간결하게 지원

✔ assert 메서드

- assertArrayEquals(a, b) : 배열 a와 b가 일치한지 확인
- assertEquals(a, b) : 객체 a와 b가 같은 값을 가지는지 확인
- assertEquals(a, b, c) : 객채 a와 b가 값이 일치함을 확인 (a: 예상값, b: 결과값, c: 오차범위)
- assertSame(a, b) : 객체 a와 b가 같은 객체임을 확인
- assertTrue(a) : 조건 a가 참인지 확인
- assertNotNull(a) : 객체 a가 null이 아님을 확인

✔ 기본 어노테이션

- @Test : 테스트를 만드는 모듈 역할
- @DisplayName : 테스트 클래스 또는 테스트 메서드의 사용자 정의 표시 이름을 정의
- @ExtendWith : 사용자 정의 확장명을 등록하는데 사용
- @BeforeEach : 각 테스트 메서드 전에 실행됨을 나타냄
- @AfterEach : 각 테스트 메서드 후에 실행됨을 나타냄
- @BeforeAll : 현재 클래스의 모든 테스트 메서드 전에 실행됨을 나타냄
- @AfterAll : 현재 클래스의 모든 테스트 메서드 후에 실행됨을 나타냄
- @Disable : 테스트 클래스 또는 메서드를 비활성화

> 테스트는 각각 독립적으로 실행되어야 함. 테스트 순서에 의존관계가 있는 것은 좋지 못함.

---

✔ Optional

- Optional<T> 클래스 : null이 올 수 있는 값을 감싸는 Wrapper 클래스로, 참조하더라도 NPE가 발생하지 않도록 도와줌.
- Optional<T> 클래스를 사용해 Null_Point_Exception을 방지할 수 있도록 도와줌.

> 왜 방지할 수 있을까? : Optional 클래스는 아래와 같은 value에 값을 저장하기 때문에 값이 null이더라도 바로 NPE가 발생하지 않으며, 클래스이기 때문에 각종 메소드를 제공해준다.

```java
public final class Optional<T> {
    private final T value;
}
```
