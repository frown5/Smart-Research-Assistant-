package com.research.research_assistent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // enable CORS for frontend
public class ResearchController {

    @Autowired
    private ResearchService researchService;

    @PostMapping("/summarize")
    public String summarize(@RequestBody ResearchRequest request) {
        request.setOperation("summarize"); // force operation to summarize
        return researchService.processContent(request);
    }
}
