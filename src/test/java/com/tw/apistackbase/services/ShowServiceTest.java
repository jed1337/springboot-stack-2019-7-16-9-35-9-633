package com.tw.apistackbase.services;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.nio.cs.Surrogate;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class ShowServiceTest {
    private ShowService showService;

    @BeforeEach
    void setUp() {
        showService = new ShowService();
    }

    @Test
    public void should_get_company_list() {
        MatcherAssert.assertThat("a", is("a"));
    }
}