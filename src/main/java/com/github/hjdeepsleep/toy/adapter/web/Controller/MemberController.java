package com.github.hjdeepsleep.toy.adapter.web.Controller;

import com.github.hjdeepsleep.toy.domain.mamber.dto.MemberSearchCondition;
import com.github.hjdeepsleep.toy.domain.mamber.dto.MemberTeamDto;
import com.github.hjdeepsleep.toy.repository.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberJpaRepository memberJpaRepository;

    @GetMapping("/v1/members")
    public List<MemberTeamDto> searchMemberV1(MemberSearchCondition condition) {
        return memberJpaRepository.search(condition);
    }
}