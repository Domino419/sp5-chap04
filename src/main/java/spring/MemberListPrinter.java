package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;

/**
 * class         : MemberListPrinter
 * date          : 24-11-17
 * description   : 모든 회원의 정보를 출력하는 클래스. MemberDao를 통해 회원 목록을 가져오고 MemberPrinter를 사용하여 출력함.
 */
public class MemberListPrinter {
 private MemberDao memberDao ;
 private MemberPrinter printer ;

 public MemberListPrinter() {  //  [리스트4.7]
 }
    /**
     * method        : MemberListPrinter (constructor)
     * date          : 24-11-17
     * param         : MemberDao memberDao - 회원 데이터를 관리하는 DAO 객체
     *               : MemberPrinter printer - 회원 정보를 출력하는 Printer 객체
     * description   : MemberListPrinter 생성자. MemberDao와 MemberPrinter를 주입받아 초기화.
     */
    public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
        this.memberDao =memberDao;
        this.printer =printer;
    }

    /**
     * method        : printAll
     * date          : 24-11-17
     * return        : void
     * description   : 모든 회원 정보를 가져와서 MemberPrinter를 사용해 출력.
     */
    public void printAll() {
        Collection <Member> members = memberDao.selectAll() ;
        members.forEach( m -> printer.print(m));
    }
    /**
     * method        : setMemberDao
     * date          : 24-11-17 23:54
     * param         : MemberDao memberDao - MemberDao 객체를 주입받음
     * return        : void
     * description   : MemberDao 객체를 해당 클래스의 필드에 주입
     * history       : [리스트 4.7]
     */
    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    /**
     * method        : setMemberPrinter
     * date          : 24-11-17 23:54
     * param         : MemberPrinter printer - MemberPrinter 객체를 주입받음
     * return        : void
     * description   : MemberPrinter 객체를 해당 클래스의 필드에 주입
     * history       : [리스트 4.7]
     */
    @Autowired
    @Qualifier("printer")
    public void setMemberPrinter(MemberPrinter printer) {
        this.printer = printer;
    }


}
