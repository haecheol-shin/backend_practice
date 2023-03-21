package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional // 트랙잭션을 이용할 수 있게 해주는 어노테이션
// 이게 없다면 test를 수행하고 나면 DB에 남는다.(커밋이 수행됨)
// 이걸 쓰면 퀴리문을 수행해서 테스트까지 하고 롤백을 해준다.(커밋x)
// 이 어노테이션 기준으로 트랜잭션이 시작된다.
public class MemberServiceIntegrationTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);

        /*
        try {
            memberService.join(member2);
            fail();
        } catch (IllegalStateException e) {
            // 중복을 걸렀으니 성공
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }
         */ // 이렇게 해도 되지만 잘 안쓴다.

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        //then
    }

}
