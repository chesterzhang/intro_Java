package indi.chester.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
@Slf4j
public class AsynTask {
    @Async
    public void publishMsg() {
        try {
            Thread.sleep(5000);
            log.warn("异步任务处理完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
