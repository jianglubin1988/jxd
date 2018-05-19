package com.jxd.web;

import com.jxd.entity.Member;
import com.jxd.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/member")
public class MemberController extends BaseController {

    @Autowired
    private MemberService service;

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "host");
        return "member/index";
    }

    @RequestMapping("/save")
    @ResponseBody
    public Map<String, Object> save(Member member) {
        service.insert(member);
        return super.success("");
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> list() {
        return super.success(service.getAll());
    }

}
