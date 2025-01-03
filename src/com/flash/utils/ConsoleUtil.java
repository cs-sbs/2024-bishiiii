package com.flash.utils;

/**
 * 控制台美化工具类 - 粉嫩少女风格
 */
public class ConsoleUtil {
    // 前景色 - 使用较浅的颜色
    public static final String RESET = "\u001B[0m";
    public static final String PINK = "\u001B[38;5;218m";      // 浅粉色
    public static final String LIGHT_PURPLE = "\u001B[38;5;183m"; // 浅紫色
    public static final String PEACH = "\u001B[38;5;217m";     // 桃色
    public static final String MINT = "\u001B[38;5;158m";      // 薄荷绿
    public static final String SKY_BLUE = "\u001B[38;5;153m";  // 天蓝色
    public static final String LAVENDER = "\u001B[38;5;147m";  // 薰衣草紫
    public static final String CREAM = "\u001B[38;5;223m";     // 奶油色
    public static final String ROSE = "\u001B[38;5;211m";      // 玫瑰色

    // 背景色 - 使用柔和的色调
    public static final String BG_PINK = "\u001B[48;5;218m";
    public static final String BG_LIGHT_PURPLE = "\u001B[48;5;183m";
    public static final String BG_PEACH = "\u001B[48;5;217m";
    public static final String BG_MINT = "\u001B[48;5;158m";
    public static final String BG_SKY_BLUE = "\u001B[48;5;153m";
    public static final String BG_LAVENDER = "\u001B[48;5;147m";
    public static final String BG_CREAM = "\u001B[48;5;223m";
    public static final String BG_ROSE = "\u001B[48;5;211m";

    /**
     * 打印标题
     */
    public static void printTitle(String title) {
        String line = "•*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•";
        System.out.println(LIGHT_PURPLE + line + RESET);
        System.out.println(PINK + "★ " + title + " ★" + RESET);
        System.out.println(LIGHT_PURPLE + line + RESET);
    }

    /**
     * 打印分隔线
     */
    public static void printDivider() {
        System.out.println(LAVENDER + "•°•°•°•°•°•°•°•°•°•°•°•°•°•°•°•°•°•°•°•°•°" + RESET);
    }

    /**
     * 打印菜单选项
     */
    public static void printMenuItem(int index, String item) {
        System.out.printf(MINT + "  ❀ %d. %s\n" + RESET, index, item);
    }

    /**
     * 打印错误信息
     */
    public static void printError(String message) {
        System.out.println(ROSE + "✿ 哎呀! " + message + RESET);
    }

    /**
     * 打印成功信息
     */
    public static void printSuccess(String message) {
        System.out.println(MINT + "✿ 好耶! " + message + RESET);
    }

    /**
     * 打印警告信息
     */
    public static void printWarning(String message) {
        System.out.println(PEACH + "✿ 提醒: " + message + RESET);
    }

    /**
     * 打印信息
     */
    public static void printInfo(String message) {
        System.out.println(SKY_BLUE + "✿ " + message + RESET);
    }

    /**
     * 打印进度条
     */
    public static void printProgressBar(int progress, int total) {
        int width = 40;
        int completed = (int) ((double) progress / total * width);
        System.out.print("\r" + PINK + "【");
        for (int i = 0; i < width; i++) {
            if (i < completed) {
                System.out.print("✿");
            } else if (i == completed) {
                System.out.print("✿");
            } else {
                System.out.print("·");
            }
        }
        System.out.printf("】 %d%%" + RESET, (int) ((double) progress / total * 100));
    }

    /**
     * 打印加载动画
     */
    public static void printLoadingAnimation(String message, int seconds) {
        String[] frames = {"✿", "❀", "✾", "❁"};
        int framesPerSecond = 4;
        int totalFrames = seconds * framesPerSecond;
        
        for (int i = 0; i < totalFrames; i++) {
            System.out.print("\r" + PINK + message + " " + 
                           frames[i % frames.length] + RESET);
            try {
                Thread.sleep(1000 / framesPerSecond);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println();
    }

    /**
     * 清屏
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // 备选方案
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    /**
     * 打印带颜色的文本
     */
    public static void printColored(String text, String color) {
        System.out.print(color + text + RESET);
    }

    /**
     * 打印带颜色的一行文本
     */
    public static void printlnColored(String text, String color) {
        System.out.println(color + text + RESET);
    }
} 