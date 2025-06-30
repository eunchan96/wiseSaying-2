package com.back;

import com.back.domain.system.controller.SystemController;

import java.util.Scanner;

public class AppContext {
    public static Scanner scanner;
    public static SystemController systemController;

    public static void renew() {
        renew(new Scanner(System.in));
    }

    public static void renew(Scanner _scanner) {
        scanner = _scanner;
        systemController = new SystemController();
    }
}