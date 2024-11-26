package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.*;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		return new ChangePasswordService() ;
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

    //119 str
    @Bean
	@Qualifier("Printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
	@Bean
	@Qualifier("SummaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
	// 119 end
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {                           //infoPrinter 으로 Spring 컨텍스트에 등록
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter() ;	   // MemberInfoPrinter 클래스의 새로운 인스턴스를 생성
		infoPrinter.setPrinter(memberPrinter2());					   // setPrinter 메소드를 호출하여 MemberPrinter의 특정 구현체인 memberPrinter2()를 주입
		return infoPrinter ;										   // 초기화된 MemberInfoPrinter 객체를 반환하며, 이 객체는 Spring 컨테이너에 등록
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}

// 113page  - Appctx class설정에서 memberPrinter2()메서드가 MemberSummaryPrinter 타입의 빈 객체를 설정하도록 변경.
// 119page -