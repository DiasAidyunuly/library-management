package kz.iitu.libraryjpa.librarymanagement.Controller;

import kz.iitu.libraryjpa.librarymanagement.Entity.Member;
import kz.iitu.libraryjpa.librarymanagement.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/all")
    public List<Member> getMembers(){
        return memberRepository.findAll();
    }
    @GetMapping("/find/{id}")
    public Member getMemberById(@PathVariable Long id){
        return memberRepository.findById(id).get();
    }
    @GetMapping("/find/surname")
    public List<Member> getBySurname(@RequestParam String name){
        return memberRepository.findByNameEquals(name);
    }

    @PostMapping("/addMember")
    public Member addCategory(@RequestBody Member member){
        return memberRepository.saveAndFlush(member);
    }
    @PutMapping("/updateMember/{id}")
    public Member updateMember(@PathVariable Long id,
                           @RequestBody Member member) {
        member.setId(id);
        return memberRepository.saveAndFlush(member);
    }
    @DeleteMapping("/deleteMember/{id}")
    public void deleteMember(@PathVariable Long id){
        memberRepository.deleteById(id);
    }
}
