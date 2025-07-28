package com.research.research_assistent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173") 
public class ResearchController {
    
    @Autowired
    private ResearchService researchService;

    @PostMapping("/summarize")
    public String summarize(@RequestBody ResearchRequest request) {
        request.setOperation("summarize");
        return researchService.processContent(request);
    }
}
