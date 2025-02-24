package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer implements TimerInterface {

    private long nanoTime = System.nanoTime();

    @Override
    public Long getTime() {
        return nanoTime;
    }

}
