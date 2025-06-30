package com.back;

import com.back.domain.system.controller.SystemController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;

    public void run() {
        System.out.println("== 명언 앱 ==");

        SystemController systemController = AppContext.systemController;

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine().trim();

            switch (cmd) {
                case "종료" -> {
                    systemController.actionExit();
                    return;
                }
                default -> System.out.println("알 수 없는 명령어입니다.");
            }
        }
    }

    public App() {
        scanner = AppContext.scanner;
    }
}