# Day4 mission

## 1. 코드 리팩토링하기

```java
public boolean validateOrder(Order order) {
    if (order.isEmpty()) {
        log.info("주문 항목이 없습니다.");
        return false;
    }
    if (order.isInvalidTotalPrice()) {
        log.info("올바르지 않은 총 가격입니다.");
        return false;
    }
    if (order.isCustomerInfoMissing()) {
        log.info("사용자 정보가 없습니다.");
        return false;
    }
    return true;
}
```

## 2. SOLID란?

객체 지향 설계 5대 원칙으로, 유지 보수와 확장이 쉬운 시스템을 만들고자할 때 도움을 준다. 각 원칙의 세부 내용은 다음과 같다.

### SRP

한 클래스는 하나의 책임만 가져야 하는 원칙으로, 클래스가 변경될 이유를 줄이고 객체의 응집도를 높이고 객체간 결합도록 낮추는 원칙이다.

### OCP

확장에는 열려있고, 변경에는 닫혀있어야 한다는 원칙으로, 시스템의 기능이 확장되어도 기존 코드는 변하지 않아야 한다.

### LSP

상속 관계에서 부모 클래스가 사용되는 곳에 자식 클래스를 적용해도 동작에 문제가 없어야 한다는 원칙이다. LSP를 위반하면 오동작하거나 예외를 던질 수 있기 때문에 사용하는 쪽에서 불필요한 타입 체크나 오류 처리
로직이 수반되어야 한다.

### DIP

고수준 모듈과 저수준 모듈이 모두 추상화에 의존해야 한다는 원칙이다. 변경이 상대적으로 잦은 저수준 모듈이 변경되어도 고수준 모듈에는 영향이 가지 않는 구조를 만들 수 있다.
