package spring2.spring2.controllers;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/hi")
public class HiController {

    @GetMapping("/hebrew")
    public String hiHebrew() {
        return "shalom";
    }

    @GetMapping("/sayHi/{name}")
    public String getName(@PathVariable String name){
        return "Hi " + name;
    }

    @GetMapping("/sayBye")
    public String getAnotherName(@RequestParam String name,
                                 @RequestParam int age){
        return "Bye "+ name + " your are " + age + " years old";
    }

    @GetMapping("/english")
    public String hiEnglish() {
        return "hi there";
    }

    @PostMapping("/post")
    public String postMe(){
        return "Post yo!";
    }


}
