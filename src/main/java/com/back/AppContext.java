package com.back;

import com.back.domain.system.controller.SystemController;
import com.back.domain.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;

public class AppContext {
    public static Scanner scanner;
    public static SystemController systemController;
    public static WiseSayingController wiseSayingController;

    public static void renew() {
        renew(new Scanner(System.in));
    }

    public static void renew(Scanner _scanner) {
        scanner = _scanner;
        systemController = new SystemController();
        wiseSayingController = new WiseSayingController();
    }
}