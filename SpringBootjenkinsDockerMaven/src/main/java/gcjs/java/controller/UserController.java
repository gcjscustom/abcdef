package gcjs.java.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/userController")
public class UserController {

    //@Value("${HOSTNAME}")
    //private String docker;
	
	//http://127.0.0.1:80/userController/index
    @ResponseBody
    @RequestMapping("/index")
    public Map<String,Object> index(@RequestParam(value = "count",defaultValue = "5") int threadCount){
        //System.out.println("--------------------docker:"+docker);
        Map<String,Object>  map = new HashMap<>();
        map.put("hello","world");
        map.put("version",8.0);
        //map.put("docker",docker);
        long startTime=System.currentTimeMillis();
        int count = threadCount;
        while (count--!=0){
            System.out.println("hello world");
        }
        long endTime=System.currentTimeMillis();
        map.put("cost_time" ,(endTime - startTime) + "ms" );
        return map;
    }

}