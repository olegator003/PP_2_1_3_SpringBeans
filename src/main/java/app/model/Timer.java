package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    private long startTime;

    public Timer() {
        this.startTime = System.currentTimeMillis(); // Инициализируем время запуска
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - startTime;  // Возвращаем прошедшее время
    }
}
