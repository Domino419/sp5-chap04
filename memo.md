2024.11.13
생성한 프로젝트 - git하고 연결함.
https://github.com/Domino419/sp5 
Chapter 2. 스프링 시작하기 

2024.11.14
Chapter 3. 스프링 DI 
chap02 안에 모듈 추가로 생성했음. >> 11.15 삭제함 (pom. 폴더 모두 )

2024.11.15
Chapter 3. 스프링 Di 
chap03 프로젝트 새로 생성함. 예제 프로젝트 만들기  ( 59page ~  ) 

2024.11.16
git에서 리포지토리 생성해서 chap03 연결했음. 
근데 인텔리에서 마우스 우클릭해도 git 메뉴가 확인이 안되서 터미널에서 push 하는 중
터미널 써도 불편한 건 없어서 일단 그냥 이대로 쓰기로 함.

2024.11.18
chap03에서 @Configuration 이랑 @Bean 실습 
Assembler 클래스를 이용해서 작성한 mainForAssembler 클래스를 스프링 컨테이너를 사용하도록 변경함.

2024.11.19
인텔리제이 껏다 키고 프로젝트 폴더 정리했는데 build 안됨. 
일부 class에서 import 제대로 되지 않음.
리빌드 해도 동일 , 빌드 및 캐시 리빌드 하고 나서 build 성공
. File > Invalidate Caches / Restart에서 캐시를 무효화한 후 인텔리제이 재시작함. 
chap03은 스프링으로 빌드 되지 않던 문제 해결  - 


2024.11.19 
getBean이 안되서 확인 했더니 빈 이름은 memberRegSvc 인데
getBean할 때에는 MemberRegSvc 으로 하고 있어서 오류 났음.
대소문자에 주의하고, 어지간하면 타이핑하지 말고 복붙하자.

DI 방식에 따른 차이 
>> 생성자 방식 : 빈 객체를 생성하는 시점에 모든 의존 객체가 주입된다. 
>> 설정 메서드 방식 : 세터 메서드 이름을 통해 어떤 의존 객체가 주입되는지 알 수 있다.

>>@Autowired 애노테이션은 스프링 빈에 의존하는 다른 빈을 자동으로 주입하고 싶을 때 사용한다. 

2024.11.20 다중 @Import 
MainForSpring에서 AppconfImport를 사용하도록 수정하였다면 이후 다른 설정 클래스를 추가하여도
MainForSpring을 수정할 필요가 없다. @Import를 사용해서 포함한 설정 클래스가 다시 @Import를 사용할 수 있다
이렇게 하면 설정 클래스를 변경해도 AnnotationConfigApplicationContext는 최상위 설정 클래스 한 개만 사용하면 된다.



-- 주석 템플릿 
/**
* methodName    : ${element.getName()}\n
* date          : time
* description   : \n
*/