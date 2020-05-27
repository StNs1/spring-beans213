package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class Timer {

    @Autowired
    @Qualifier("animalsCage")
    private AnimalsCage animalCage;

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
