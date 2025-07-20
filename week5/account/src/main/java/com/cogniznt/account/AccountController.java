package com.cogniznt.account;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{num}")
    public Map<String,Object> getAccount(@PathVariable String num){
        Map<String,Object> res=new HashMap<>();
        res.put("number",num);
        res.put("type","savings");
        res.put("balance","232343");
        return res;
    }
    
}
