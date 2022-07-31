package se.ds.ba.prophet.application.extension;

import com.alibaba.cola.extension.Extension;
import se.ds.ba.prophet.application.extension.extpt.SomeExtPt;
import org.springframework.stereotype.Component;

@Extension(bizId = "A")
@Component
public class ExtensionTemplateA implements SomeExtPt {
    @Override
    public void doSomeThing() {
        System.out.println("SomeExtensionA::doSomething");
    }
}
