package com.artistic.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistic.backend.model.Portfolio;
import com.artistic.backend.service.PortfolioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/portfolios")
public class PortfolioController {

    private final PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.createPortfolio(portfolio);
    }

    @GetMapping
    public List<Portfolio> getPortfolios() {
        return portfolioService.getAllPortfolios();
    }

    @GetMapping("/{id}")
    public Optional<Portfolio> getPortfolioById(@PathVariable String id) {
        return portfolioService.getPortfolioById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePortfolio(@PathVariable String id) {
        portfolioService.deletePortfolio(id);
    }
}