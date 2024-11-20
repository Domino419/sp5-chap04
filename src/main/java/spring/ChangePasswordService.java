package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ChangePasswordService {

    @Autowired   //의존 자동 주입을 위한 애노태이션 추가
    private MemberDao memberDao ;


    /**
     * class         : changePassword
     * date          : 24-11-17 21:52
     * param         : email, oldPwd, newPwd)
     * description   : email을 기준으로 회원 정보를 조회한 뒤 패스워드 변경 처리
     */
    public void changePassword(String email, String oldPwd, String newPwd) {
        Member member = memberDao.selectByEmail(email) ;
        if ( member == null )
            throw new MemberNotFoundException() ;
        member.changePassword(oldPwd, newPwd);
        memberDao.update(member);
    }

    public void setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao ;
    }
}
