 chap 04.의존 자동 주입
 
1. 예제 프로젝트 준비 ( commit ) 
 3장에서 실습한 chap03 프로젝트에서 가져온 소스 파일 목록 
 - spring 패키지의 모든 자바 파일(.java) 
 - config 패키지의 AppCts.java
 - main 패키지의 MainForSpring

 패키지 명 일부 수정하고 나서 정상적으로 프로그램 실행 ok 


2.@Autowired 애노테이션을 이용한 의존 자동 주입 
 @Autowired 를 붙이면 자동주입기능을 사용하면 설정에 의존 객체를 명시하지 않아도 스프링이 필요한 의존 빈 객체를 찾아서 주입해준다.
 2-1.ChangePasswordService의 private MemberDao memberDao 에 애노테이션을 추가.
 2-2.AppCtx의 Bean 설정 부분에서 세터 메서드 ( setMemberDao()메서드 ) 를 이용해서 의존 객체를 주입하는 걸 주석 처리함.
>> @Autowired 애노태이션을 필드나 세터 메서드에 붙이면 스프링은 타입이 일치하는 빈 객체를 찾아서 주입한다.

2.1 일치하는 빈이 없는 경우 
@Autowired 애노태이션을 적용한 대상에 일치하는 빈이 없는 경우 익셉션 발생하면서 실행이 불가능함.
@Autowired 애노태이션을 붙인 주입 대상에 일치하는 빈이 두개 이상이면 ~~expected single matching bean but found 2' 
이라는 메시지가 발생하면서 에러 발생

3.@Qualifier 애노태이션을 이용한 의존 객체 선택 
자동 주입 가능한 빈이 두개 이상이면 @Qualifier을 이용해서 자동 주입 대상 빈을 한정할 수 있다.
@Qualifier은 @Bean 애노태이션을 붙인 빈 설정 메서드에서 사용이 가능하다. 
 ex) 
@Bean
@Qualifier("printer")   << 이런 식으로 ..

