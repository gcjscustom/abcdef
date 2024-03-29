package gcjs.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/userController")
public class UserController {

    @ResponseBody
    @RequestMapping("/index")
    public Map<String,Object> index(@RequestParam(value = "count",defaultValue = "5") int threadCount){

        Map<String,Object> map = new HashMap<>();
        map.put("hello","精通Java微服务 000");
        map.put("version",8.0);
   
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