# Factory Method Pattern
* ⁠하위 클래스에서 객체를 생성 반환하는 메서드를 오버라이딩해서 객체를 반환하게 하는 것을 의미
* ⁠팩토리 패턴은 객체를 생성하는 인터페이스는 미리 정의하되, 인스턴스를 만들 클래스의 결정은 서브 클래스 쪽에서 내리는 패턴<br/>
  ⁠여러 개의 서브 클래스를 가진 슈퍼 클래스가 있을 때 인풋에 따라 하나의 자식 클래스의 인스턴스를 리턴해주는 방식
* ⁠팩토리 패턴에서는 클래스의 인스턴스를 만드는 시점을 서브 클래스로 미룹니다.
* ⁠활용성
  * ⁠어떤 클래스가 자신이 생성해야 하는 객체의 클래스를 예측할 수 없을 때⁠
  * 생성할 객체를 기술하는 책임을 자신의 서브클래스가 지정했으면 할 때


## 환경
* jdk 20
