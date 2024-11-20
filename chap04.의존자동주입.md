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

 -- 112page까지 했음.
 