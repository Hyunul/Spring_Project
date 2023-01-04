package hello.hellospring.Service;

import java.util.List;
import java.util.Optional;

import hello.hellospring.Domain.Member;
import hello.hellospring.Repository.MemberRepository;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId(); // 멤버의 id 리턴
    }

    // 중복 회원 검증
    private void validateDuplicateMember(Member member) {
        // 이름이 있으면 예외처리
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
