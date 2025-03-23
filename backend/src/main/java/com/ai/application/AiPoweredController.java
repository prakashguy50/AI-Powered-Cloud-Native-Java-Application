package com.ai.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiPoweredController {

    @GetMapping("/history")
    public String getHistory() {
        return "Displaying History Tab Data!";
    }

    @GetMapping("/worklist")
    public String getWorklist() {
        return "Displaying Worklist Tab Data!";
    }
}
