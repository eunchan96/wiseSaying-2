package com.back.domain.wiseSaying.controller;

import com.back.AppContext;

import java.util.Scanner;

public class WiseSayingController {
    Scanner scanner;

    public WiseSayingController() {
        scanner = AppContext.scanner;
    }

    public void actionWrite() {
        System.out.print("명언) ");
        String content = scanner.nextLine().trim();
        System.out.print("작가) ");
        String author = scanner.nextLine().trim();
    }
}