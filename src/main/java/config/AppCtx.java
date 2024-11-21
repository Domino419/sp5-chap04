package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.*;


/**
 * class         : AppCtx
 * date          : 24-11-17
 * description   : Spring 설정 클래스. 애플리케이션에서 필요한 Bean을 정의하고 관리.
 */
@Configuration
public class AppCtx {

    /**
     * method        : memberDao
     * date          : 24-11-17
     * description   : MemberDao 빈을 생성하여 반환. 회원 데이터를 관리하는 DAO 객체.
     */
    @Bean
    public MemberDao memberDao(){
        return new MemberDao() ;
    }

    /**
     * method        : memberRegisterService
     * date          : 24-11-17
     * return        : MemberRegisterService
     * description   : MemberRegisterService 빈을 생성하여 반환. 회원 등록 기능을 제공하며, MemberDao에 의존함.
     */
    @Bean
    public MemberRegisterService memberRegSvc(){
        return new MemberRegisterService();
    }

    /**
     * method        : changePwdSvc
     * date          : 24-11-17
     * param         : None
     * return        : ChangePasswordService
     * description   : ChangePasswordService 빈을 생성하여 반환. 비밀번호 변경 기능을 제공하며, MemberDao에 의존함.
     */
    @Bean
    public ChangePasswordService changePwdSvc() {
        return new ChangePasswordService() ;
    }

    /**
     * method        : memberPrinter
     * date          : 24-11-17
     * description   : MemberPrinter는 회원 정보를 출력하는 역할을 수행한다.
     */
//    @Bean
//    public MemberPrinter memberPrinter() {
//        return new MemberPrinter() ;
//    }

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1() {
        return new MemberPrinter() ;
    }
    @Bean
    public MemberPrinter memberPrinter2() {
        return new MemberPrinter() ;
    }




    /**
     * method        : listPrinter
     * date          : 24-11-17
     * description   : MemberListPrinter 객체를 생성하여 스프링 컨텍스트에 등록한다.
     *                 MemberDao와 MemberPrinter를 주입하여 모든 회원 정보를 출력하는 기능을 제공한다.
     */

    @Bean
    public MemberListPrinter listPrinter() {
        return new MemberListPrinter() ;
    }




    /**
     * method        : infoPrinter
     * date          : 24-11-17
     * param         : none
     * return        : MemberInfoPrinter
     * description   : MemberInfoPrinter 빈을 생성하고 MemberDao 및 MemberPrinter 객체를 설정하여 반환한다.
     *                 의존성 주입을 통해 회원 정보를 조회하고 출력하는 기능을 제공한다.
     * history       : [리스트 4.8]
     */
    @Bean
    public MemberInfoPrinter infoPrinter() {
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter() ;
           return infoPrinter ;
    }


    /**
     * method        : versionPrinter
     * date          : 24-11-17
     * param         : none
     * return        : VersionPrinter - 버전 정보를 설정한 VersionPrinter 객체
     * description   : VersionPrinter 객체를 생성하고, majorVersion과 minorVersion 값을 설정하여 반환한다.
     *                 이 메소드는 프로그램의 버전 정보 출력을 위한 Bean을 생성한다. (리스트 3.24 , 89page)
     */
    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter() ;
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter ;
    }
}

