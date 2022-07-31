package se.ds.ba.prophet;

import com.alibaba.cola.extension.BizScenario;
import com.alibaba.cola.extension.ExtensionExecutor;
import com.alibaba.cola.extension.register.ExtensionRegister;
import  se.ds.ba.prophet.application.extension.extpt.SomeExtPt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动Runner
 *
 * @author peihua
 **/
@Component
@Slf4j
public
class ColaRunner implements CommandLineRunner {

    @Autowired
    private ExtensionRegister register;
    @Autowired
    private ExtensionExecutor executor;

    @Override
    public void run(String... args) {

        executor.executeVoid(SomeExtPt.class, BizScenario.valueOf("A"), SomeExtPt::doSomeThing);
        executor.executeVoid(SomeExtPt.class, BizScenario.valueOf("B"), SomeExtPt::doSomeThing);

    }

}